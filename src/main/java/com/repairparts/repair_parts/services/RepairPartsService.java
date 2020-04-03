package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.RepairPartAlreadyExists;
import com.repairparts.repair_parts.exceptions.RepairPartNotFoundException;
import com.repairparts.repair_parts.exceptions.WrongDataFormatException;

import java.util.List;

public interface RepairPartsService {

    RepairPartResponseDto addRepairPart(RepairPartRequestDto dto) throws RepairPartAlreadyExists, DataBaseConnectionException;
    RepairPartResponseDto updateRepairPart(RepairPartRequestDto dto)throws RepairPartNotFoundException,DataBaseConnectionException;
    RepairPartResponseDto updateAmountById(String id, int amount)throws RepairPartNotFoundException, WrongDataFormatException;
    RepairPartResponseDto updateRepairPartById(String id) throws RepairPartNotFoundException,WrongDataFormatException,DataBaseConnectionException;
    RepairPartResponseDto deleteRepairPartById(String id) throws RepairPartNotFoundException, WrongDataFormatException,DataBaseConnectionException;
    List<RepairPartResponseDto> getAllByCategory(String category)throws WrongDataFormatException, DataBaseConnectionException;
    List<RepairPartResponseDto> getAll() throws DataBaseConnectionException;
    List<RepairPartResponseDto> getAllForOrderByCategory(String category) throws WrongDataFormatException,DataBaseConnectionException;
    List<RepairPartResponseDto> getAllForOrder() throws DataBaseConnectionException;
}
