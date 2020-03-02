package com.repairparts.repair_parts.utils;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MapperImpl implements Mapper{

    @Override
    public PhoneEntity map(PhoneRequestDto dto) {
        return PhoneEntity.builder()
                .brand(dto.getBrand())
                .model(dto.getModel())
                .repairPartEntities(new ArrayList<>())
                .build();
    }

    @Override
    public PhoneResponseDto map(PhoneEntity entity) {
        return PhoneResponseDto.builder()
                .addedTime(entity.getAddedTime())
                .lastUpdateTime(entity.getLastUpdateTime())
                .id(entity.getId())
                .brand(entity.getBrand())
                .model(entity.getModel())
                .repairPartEntities(entity.getRepairPartEntities())
                .build();
    }
}
