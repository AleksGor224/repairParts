package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.PhoneAlreadyExistsException;
import com.repairparts.repair_parts.exceptions.PhoneNotFoundException;
import com.repairparts.repair_parts.exceptions.WrongDataFormatException;
import com.repairparts.repair_parts.repositories.phone.PhoneRepository;
import com.repairparts.repair_parts.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;
    @Autowired
    Mapper mapper;
    @Autowired
    EntityManager entityManager;

    @Override
    public PhoneResponseDto addPhone(PhoneRequestDto phoneRequestDto) throws PhoneAlreadyExistsException, DataBaseConnectionException {

        if(phoneRequestDto == null ||
                (phoneRequestDto.getModel() == null|| phoneRequestDto.getModel().equals("")) ||
                (phoneRequestDto.getBrand() == null|| phoneRequestDto.getBrand().equals(""))){
            throw new WrongDataFormatException("Wrong data format exception");
        }
        for (PhoneResponseDto dto : getAll()) {
            if(dto.getModel().equals(phoneRequestDto.getModel()) && dto.getBrand().equals(phoneRequestDto.getBrand())){
                throw new PhoneAlreadyExistsException("Phone already exists");
            }
        }
        PhoneEntity entity = mapper.map(phoneRequestDto);
        entity.setId(UUID.randomUUID().toString());
        entity.setAddedTime(LocalDateTime.now());
        return Optional.of(mapper.map(phoneRepository.save(entity))).orElseThrow(()->new DataBaseConnectionException("Not saved. Check database connection"));
    }

    @Override
    public PhoneResponseDto updatePhoneWithId(String id, PhoneRequestDto phoneRequestDto) throws DataBaseConnectionException {
        PhoneEntity entity;
        try {
            entity = phoneRepository.findById(id);
            if (phoneRequestDto.getBrand() != null) {
                entity.setBrand(phoneRequestDto.getBrand());
            }
            if (phoneRequestDto.getModel() != null) {
                entity.setModel(phoneRequestDto.getModel());
            }
        }catch (NullPointerException ex){
            throw new PhoneNotFoundException("Phone Not Found");
        }
        entity.setLastUpdateTime(LocalDateTime.now());
        return Optional.of(mapper.map(entityManager.merge(entity))).orElseThrow(()->new DataBaseConnectionException("Not saved. Check database connection"));
    }

    @Override
    public PhoneResponseDto removePhone(String id) throws DataBaseConnectionException {
        PhoneEntity entity;
        try {
            entity = phoneRepository.findById(id);
        }catch (NullPointerException ex){
            throw new PhoneNotFoundException("Phone Not Found");
        }
        entityManager.remove(entity);
        return Optional.of(mapper.map(entity)).orElseThrow(()->new DataBaseConnectionException("Not removed. Check database connection"));
    }

    @Override

    public List<PhoneResponseDto> getAll() {
        return phoneRepository.findAll().stream().map((e)->mapper.map(e)).collect(Collectors.toList());
    }


}
