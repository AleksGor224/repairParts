package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneControllerImpl implements PhoneController {
    @Autowired
    PhoneService phoneService;
    @Override
    @PostMapping("addPhone")
    public PhoneResponseDto addPhone(@RequestBody PhoneRequestDto phoneRequestDto) {
        return phoneService.addPhone(phoneRequestDto);
    }

    @Override
    @PostMapping("udpatePhone/{id}")
    public PhoneResponseDto updatePhoneWithId(@PathVariable("id") String id,@RequestBody PhoneRequestDto phoneRequestDto) {
        return phoneService.updatePhoneWithId(id,phoneRequestDto);
    }

    @Override
    @DeleteMapping("deletePhone/{id}")
    public boolean removePhone(@PathVariable("id") String id) {
        return phoneService.removePhone(id);
    }

    @Override
    @GetMapping("getAll")
    public List<PhoneResponseDto> getAllPhones(){
        return phoneService.getAll();
    }
}
