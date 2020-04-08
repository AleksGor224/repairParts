package com.repairparts.repair_parts.utils.mappers;


import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.entities.childs.BackEntity;
import com.repairparts.repair_parts.entities.childs.BatteryEntity;
import com.repairparts.repair_parts.entities.childs.DisplayEntity;
import com.repairparts.repair_parts.entities.childs.FlexEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RepairPartMapper {

    RepairPartMapper INSTANCE = Mappers.getMapper(RepairPartMapper.class);
    @Mapping(target = "phoneEntityId", expression = "java(to.getPhoneEntity().getId())")
    @Mapping(target = "amount",expression = "java(to.getAmount()")
    @Mapping(target = "required")
    RepairPartResponseDto map(BatteryEntity to);
    @Mapping(target = "phoneEntityId", expression = "java(to.getPhoneEntity().getId())")
    RepairPartResponseDto map(DisplayEntity to);
    @Mapping(target = "phoneEntityId", expression = "java(to.getPhoneEntity().getId())")
    RepairPartResponseDto map(FlexEntity to);
    @Mapping(target = "phoneEntityId", expression = "java(to.getPhoneEntity().getId())")
    RepairPartResponseDto map(BackEntity to);


    BatteryEntity mapEDBatteryFromDto(RepairPartRequestDto to);
    DisplayEntity mapDisplayFromDto(RepairPartRequestDto to);
    FlexEntity mapEDFlexFromDto(RepairPartRequestDto to);
    BackEntity mapEDBackFromDto(RepairPartRequestDto to);


}
