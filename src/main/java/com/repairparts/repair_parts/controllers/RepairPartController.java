package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.RepairPartRequestDto;
import com.repairparts.repair_parts.dtos.RepairPartResponseDto;
import com.repairparts.repair_parts.services.RepairPartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("repairPart")
public class RepairPartController implements RepairPartsController {

    @Autowired
    RepairPartsService repairPartsService;

    @Override
    @PostMapping
    public RepairPartResponseDto addRepairPart(@RequestBody RepairPartRequestDto dto) {
        System.out.println(dto.toString());
        return repairPartsService.addRepairPart(dto);
    }

    @Override
    @PostMapping("upd")
    public RepairPartResponseDto updateRepairPart(@RequestBody RepairPartRequestDto dto) {
        return repairPartsService.updateRepairPart(dto);
    }

    @Override
    @PostMapping("{id}/{amount}")
    public RepairPartResponseDto updateAmountById(@PathVariable("id") String id,@PathVariable("amount") int amount) {
        return repairPartsService.updateAmountById(id,amount);
    }

    @Override
    @PostMapping("{id}")
    public RepairPartResponseDto updateRepairPartById(@PathVariable("id") String id) {
        return repairPartsService.updateRepairPartById(id);
    }

    @Override
    @DeleteMapping("{id}")
    public RepairPartResponseDto deleteRepairPartById(@PathVariable("id") String id) {
        return repairPartsService.deleteRepairPartById(id);
    }

    @Override
    @GetMapping("{category}")
    public List<RepairPartResponseDto> getAllByCategory(@PathVariable("category") String category) {
        return repairPartsService.getAllByCategory(category);
    }

    @Override
    @GetMapping
    public List<RepairPartResponseDto> getAll() {
        return repairPartsService.getAll();
    }

    @Override
    @GetMapping("order/{category}")
    public List<RepairPartResponseDto> getAllForOrderByCategory(@PathVariable("category") String category) {
        return repairPartsService.getAllForOrderByCategory(category);
    }

    @Override
    @GetMapping("order")
    public List<RepairPartResponseDto> getAllForOrder() {
        return repairPartsService.getAllForOrder();
    }
}
