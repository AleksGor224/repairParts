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
import com.repairparts.repair_parts.exceptions.WrongDataFormatException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MapperImpl implements Mapper{

//    @Override
//    public PhoneEntity map(PhoneRequestDto dto) {
//        return PhoneEntity.builder()
//                .brand(dto.getBrand())
//                .model(dto.getModel())
//                .repairPartEntities(new ArrayList<>())
//                .build();
//    }
//
//    @Override
//    public PhoneResponseDto map(PhoneEntity entity) {
//        return PhoneResponseDto.builder()
//                .addedTime(entity.getAddedTime())
//                .lastUpdateTime(entity.getLastUpdateTime())
//                .id(entity.getId())
//                .brand(entity.getBrand())
//                .model(entity.getModel())
//                .repairPartEntities(entity.getRepairPartEntities())
//                .build();
//    }
//
//    @Override
//    public RepairPartEntity map(RepairPartRequestDto dto) {
//        switch (dto.getType().toLowerCase()){
//            case "battery":{
//                return BatteryEntity.builder()
//                        .type(dto.getType())
//                        .requiredAmount(dto.getRequiredAmount())
//                        .amount(dto.getAmount())
//                        .build();
//            }
//            case "display":{
//                return DisplayEntity.builder()
//                        .type(dto.getType())
//                        .requiredAmount(dto.getRequiredAmount())
//                        .amount(dto.getAmount())
//                        .build();
//            }
//            case "flex":{
//                return FlexEntity.builder()
//                        .type(dto.getType())
//                        .requiredAmount(dto.getRequiredAmount())
//                        .amount(dto.getAmount())
//                        .build();
//            }
//            case "back":{
//                return BackEntity.builder()
//                        .type(dto.getType())
//                        .requiredAmount(dto.getRequiredAmount())
//                        .amount(dto.getAmount())
//                        .build();
//            }
//            default:{
//                throw new WrongDataFormatException("wrong rp type");
//            }
//        }
//    }
//
//    @Override
//    public RepairPartResponseDto mapFromBat(BatteryEntity entity) {
//        return RepairPartResponseDto.builder()
//                .orig(entity.isOrig())
//                .requiredAmount(entity.getRequiredAmount())
//                .amount(entity.getAmount())
//                .brand(entity.getPhoneEntityId().getBrand())
//                .model(entity.getPhoneEntityId().getModel())
//                .addedTime(entity.getAddedTime())
//                .lastUpdateTime(entity.getUpdateTime())
//                .build();
//    }
//
//    @Override
//    public RepairPartResponseDto mapFromFlex(FlexEntity entity) {
//        return RepairPartResponseDto.builder()
//                .orig(entity.isOrig())
//                .flexType(entity.getFlexType())
//                .requiredAmount(entity.getRequiredAmount())
//                .amount(entity.getAmount())
//                .brand(entity.getPhoneEntityId().getBrand())
//                .model(entity.getPhoneEntityId().getModel())
//                .addedTime(entity.getAddedTime())
//                .lastUpdateTime(entity.getUpdateTime())
//                .build();
//    }
//
//    @SuppressWarnings("Duplicates")
//    @Override
//    public RepairPartResponseDto mapFromDisp(DisplayEntity entity) {
//        return RepairPartResponseDto.builder()
//                .orig(entity.isOrig())
//                .color(entity.getColor())
//                .requiredAmount(entity.getRequiredAmount())
//                .amount(entity.getAmount())
//                .brand(entity.getPhoneEntityId().getBrand())
//                .model(entity.getPhoneEntityId().getModel())
//                .addedTime(entity.getAddedTime())
//                .lastUpdateTime(entity.getUpdateTime())
//                .build();
//    }
//
//    @SuppressWarnings("Duplicates")
//    @Override
//    public RepairPartResponseDto mapFromBack(BackEntity entity) {
//        return RepairPartResponseDto.builder()
//                .orig(entity.isOrig())
//                .color(entity.getColor())
//                .requiredAmount(entity.getRequiredAmount())
//                .amount(entity.getAmount())
//                .brand(entity.getPhoneEntityId().getBrand())
//                .model(entity.getPhoneEntityId().getModel())
//                .addedTime(entity.getAddedTime())
//                .lastUpdateTime(entity.getUpdateTime())
//                .build();
//    }
}
