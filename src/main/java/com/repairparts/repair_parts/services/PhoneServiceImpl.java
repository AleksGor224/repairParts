package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.repositories.PhoneRepository;
import com.repairparts.repair_parts.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;
    @Autowired
    Mapper mapper;

    @Override
    public PhoneResponseDto addPhone(PhoneRequestDto phoneRequestDto) {
        PhoneEntity entity = mapper.map(phoneRequestDto);
        entity.setId(UUID.randomUUID().toString());
        entity.setAddedTime(LocalDateTime.now());

        try {
            phoneRepository.addPhone(entity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mapper.map(entity);
    }

    @Override
    public PhoneResponseDto updatePhoneWithId(String id, PhoneRequestDto phoneRequestDto) {
        PhoneEntity entity = phoneRepository.findById(id);
        if(phoneRequestDto.getBrand()!= null){
            entity.setBrand(phoneRequestDto.getBrand());
        }
        if(phoneRequestDto.getModel()!=null){
            entity.setModel(phoneRequestDto.getModel());
        }
        phoneRepository.removeById(id);
        entity.setLastUpdateTime(LocalDateTime.now());
        PhoneEntity tmp = null;
        try {
            tmp = phoneRepository.addPhone(entity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mapper.map(tmp);
    }

    @Override
    public boolean removePhone(String id) {
        return phoneRepository.removeById(id);
    }

    @Override
    public List<PhoneResponseDto> getAll() {
        return phoneRepository.getAll().stream().map((e)->mapper.map(e)).collect(Collectors.toList());
    }


}
