package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;

import java.util.List;

public interface RepairPartsController {

    RepairPartResponseDto addRepairPart(RepairPartRequestDto dto);
    RepairPartResponseDto updateRepairPart(RepairPartRequestDto dto);
    RepairPartResponseDto updateRepairPartById(String id);
    RepairPartResponseDto deleteRepairPart(RepairPartRequestDto dto);
    List<RepairPartResponseDto> getAllByCategory(String category);
    List<RepairPartResponseDto> getAll();
    List<RepairPartResponseDto> getAllForOrderByCategory(String category);
    List<RepairPartResponseDto> getAllForOrder();

}
