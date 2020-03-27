package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.PhoneAlreadyExistsException;
import com.repairparts.repair_parts.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("phone")
public class PhoneControllerImpl implements PhoneController {
    @Autowired
    PhoneService phoneService;
    @Override
    @PostMapping
    public Optional<PhoneResponseDto> addPhone(@RequestBody PhoneRequestDto phoneRequestDto) throws PhoneAlreadyExistsException, DataBaseConnectionException {
        return phoneService.addPhone(phoneRequestDto);
    }

    @Override
    @PostMapping("{id}")
    public Optional<PhoneResponseDto> updatePhoneWithId(@PathVariable("id") String id,@RequestBody PhoneRequestDto phoneRequestDto) {
        return phoneService.updatePhoneWithId(id,phoneRequestDto);
    }

    @Override
    @DeleteMapping("{id}")
    public Optional<PhoneResponseDto> removePhone(@PathVariable("id") String id) {
        return phoneService.removePhone(id);
    }

    @Override
    @GetMapping("all")
    public List<PhoneResponseDto> getAllPhones(){
        return phoneService.getAll();
    }
}
