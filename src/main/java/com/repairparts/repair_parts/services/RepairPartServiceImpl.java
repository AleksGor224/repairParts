package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.RepairPartAlreadyExists;
import com.repairparts.repair_parts.exceptions.RepairPartNotFoundException;
import com.repairparts.repair_parts.exceptions.WrongDataFormatException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairPartServiceImpl implements RepairPartsService {
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
