package com.repairparts.repair_parts.utils.mappers;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface PhoneEntityMapper {

    PhoneEntityMapper INSTANCE = Mappers.getMapper(PhoneEntityMapper.class);

    PhoneEntity map(PhoneRequestDto dto);
    PhoneResponseDto map(PhoneEntity entity);
}
