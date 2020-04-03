package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("repairPart")
public class RepairPartController implements RepairPartsController {

    @Override
    @PostMapping
    public RepairPartResponseDto addRepairPart(RepairPartRequestDto dto) {
        return null;
    }

    @Override
    @PostMapping("upd")
    public RepairPartResponseDto updateRepairPart(RepairPartRequestDto dto) {
        return null;
    }

    @Override
    @PostMapping("{id}")
    public RepairPartResponseDto updateRepairPartById(@PathVariable String id) {
        return null;
    }

    @Override
    @DeleteMapping
    public RepairPartResponseDto deleteRepairPart(RepairPartRequestDto dto) {
        return null;
    }

    @Override
    @GetMapping("{category}")
    public List<RepairPartResponseDto> getAllByCategory(@PathVariable String category) {
        return null;
    }

    @Override
    @GetMapping
    public List<RepairPartResponseDto> getAll() {
        return null;
    }

    @Override
    @GetMapping("order/{category}")
    public List<RepairPartResponseDto> getAllForOrderByCategory(@PathVariable String category) {
        return null;
    }

    @Override
    @GetMapping("order")
    public List<RepairPartResponseDto> getAllForOrder() {
        return null;
    }
}
