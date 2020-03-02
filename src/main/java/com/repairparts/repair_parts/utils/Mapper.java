package com.repairparts.repair_parts.utils;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;

public interface Mapper {

    PhoneEntity map(PhoneRequestDto dto);
    PhoneResponseDto map(PhoneEntity entity);
}
