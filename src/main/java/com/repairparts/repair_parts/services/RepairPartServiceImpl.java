package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.RepairPartAlreadyExists;
import com.repairparts.repair_parts.exceptions.RepairPartNotFoundException;
import com.repairparts.repair_parts.exceptions.WrongDataFormatException;
import com.repairparts.repair_parts.repositories.repairParts.JPAs.RPBatteriesJPA;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.BackRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.BatteryRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.DisplayRepository;
import com.repairparts.repair_parts.repositories.repairParts.interfaces.FlexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public RepairPartResponseDto addRepairPart(RepairPartRequestDto dto) throws RepairPartAlreadyExists, DataBaseConnectionException {

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
