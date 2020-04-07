package com.repairparts.repair_parts.utils;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.entities.childs.BackEntity;
import com.repairparts.repair_parts.entities.childs.BatteryEntity;
import com.repairparts.repair_parts.entities.childs.DisplayEntity;
import com.repairparts.repair_parts.entities.childs.FlexEntity;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;

public interface Mapper {

    PhoneEntity map(PhoneRequestDto dto);
    PhoneResponseDto map(PhoneEntity entity);
    RepairPartEntity map(RepairPartRequestDto dto);
    RepairPartResponseDto mapFromBat(BatteryEntity entity);
    RepairPartResponseDto mapFromFlex(FlexEntity entity);
    RepairPartResponseDto mapFromDisp(DisplayEntity entity);
    RepairPartResponseDto mapFromBack(BackEntity entity);
}
