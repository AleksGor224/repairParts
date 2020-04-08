package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.entities.childs.BatteryEntity;
import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.exceptions.*;
import com.repairparts.repair_parts.repositories.phone.PhoneRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.BackRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.BatteryRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.DisplayRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.FlexRepository;
import com.repairparts.repair_parts.utils.mappers.RepairPartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@Service
public class RepairPartServiceImpl implements RepairPartsService {

    @Autowired
    BatteryRepository batteriesRepository;
    @Autowired
    DisplayRepository displayRepository;
    @Autowired
    FlexRepository flexRepository;
    @Autowired
    BackRepository backRepository;
    @Autowired
    PhoneRepository phoneRepository;


    @Override
    public RepairPartResponseDto addRepairPart(RepairPartRequestDto dto) throws RepairPartAlreadyExists, DataBaseConnectionException {
        PhoneEntity phoneEntity = phoneRepository.findAll().stream()
                .filter((e)->(e.getModel().toLowerCase().equals(dto.getModel().toLowerCase()) &&
                              e.getBrand().toLowerCase().equals(dto.getBrand().toLowerCase())))
                .findFirst().orElseThrow(()->new PhoneNotFoundException("Phone not found"));
        if(dto.getType() == null || dto.getType().equals("")){
            throw new WrongDataFormatException("Type not found");
        }else{
            switch (dto.getType().toLowerCase()){
                case "battery":{
                    BatteryEntity entity = RepairPartMapper.INSTANCE.mapEDBatteryFromDto(dto);
                    entity.setPhoneEntity(phoneEntity);
                    entity.setAddedTime(LocalDateTime.now());
                    entity.setUpdateTime(entity.getAddedTime());
                    entity.getPhoneEntity().setId(phoneEntity.getId());
                    batteriesRepository.save(entity);
                    return RepairPartMapper.INSTANCE.map(batteriesRepository.findById(entity.getId()));
                }
                case "display":{

                }
                case "flex":{

                }
                case "back":{

                }
                default:{

                }
            }
        }
        return null;
    }

    @Override
    public RepairPartResponseDto updateRepairPart(RepairPartRequestDto dto) throws RepairPartNotFoundException, DataBaseConnectionException {
        return null;
    }

    @Override
    public RepairPartResponseDto updateAmountById(String id, int amount) throws RepairPartNotFoundException, WrongDataFormatException {
        return null;
    }

    @Override
    public RepairPartResponseDto updateRepairPartById(String id) throws RepairPartNotFoundException, WrongDataFormatException, DataBaseConnectionException {
        return null;
    }

    @Override
    public RepairPartResponseDto deleteRepairPartById(String id) throws RepairPartNotFoundException, WrongDataFormatException, DataBaseConnectionException {
        return null;
    }

    @Override
    public List<RepairPartResponseDto> getAllByCategory(String category) throws WrongDataFormatException, DataBaseConnectionException {
        return null;
    }

    @Override
    public List<RepairPartResponseDto> getAll() throws DataBaseConnectionException {
        return null;
    }

    @Override
    public List<RepairPartResponseDto> getAllForOrderByCategory(String category) throws WrongDataFormatException, DataBaseConnectionException {
        return null;
    }

    @Override
    public List<RepairPartResponseDto> getAllForOrder() throws DataBaseConnectionException {
        return null;
    }


}
