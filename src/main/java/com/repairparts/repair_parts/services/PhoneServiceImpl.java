package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.PhoneAlreadyExistsException;
import com.repairparts.repair_parts.exceptions.WrongDataFormatException;
import com.repairparts.repair_parts.repositories.PhoneRepository;
import com.repairparts.repair_parts.utils.Mapper;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
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
    public Optional<PhoneResponseDto> addPhone(PhoneRequestDto phoneRequestDto) throws PhoneAlreadyExistsException, DataBaseConnectionException {

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
        try{
            return Optional.of(mapper.map(phoneRepository.save(entity)));
        }catch (Exception ex){
            throw new DataBaseConnectionException("Wrong connection");
        }
    }

    @Override
    public Optional<PhoneResponseDto> updatePhoneWithId(String id, PhoneRequestDto phoneRequestDto) {
        PhoneEntity entity = phoneRepository.findById(id);
        if(phoneRequestDto.getBrand()!= null){
            entity.setBrand(phoneRequestDto.getBrand());
        }
        if(phoneRequestDto.getModel()!=null){
            entity.setModel(phoneRequestDto.getModel());
        }
        entity.setLastUpdateTime(LocalDateTime.now());
        return Optional.of(mapper.map(entityManager.merge(entity)));
    }

    @Override
    public Optional<PhoneResponseDto> removePhone(String id) {
        PhoneEntity entity = phoneRepository.findById(id);
        entityManager.remove(entity);
        return Optional.of(mapper.map(entity));
    }

    @Override

    public List<PhoneResponseDto> getAll() {
        return phoneRepository.findAll().stream().map((e)->mapper.map(e)).collect(Collectors.toList());
    }


}
