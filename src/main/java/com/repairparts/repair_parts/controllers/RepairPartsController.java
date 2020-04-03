package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;

import java.util.List;

public interface RepairPartsController {

    RepairPartResponseDto addRepairPart(RepairPartRequestDto dto);
    RepairPartResponseDto updateRepairPart(RepairPartRequestDto dto);
    RepairPartResponseDto updateAmountById(String id, int amount);
    RepairPartResponseDto updateRepairPartById(String id);
    RepairPartResponseDto deleteRepairPartById(String id);
    List<RepairPartResponseDto> getAllByCategory(String category);
    List<RepairPartResponseDto> getAll();
    List<RepairPartResponseDto> getAllForOrderByCategory(String category);
    List<RepairPartResponseDto> getAllForOrder();
}
