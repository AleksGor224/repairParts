package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;

import java.util.List;

public interface PhoneController {

    PhoneResponseDto addPhone(PhoneRequestDto phoneRequestDto);
    PhoneResponseDto updatePhoneWithId(String id, PhoneRequestDto phoneEntity);
    boolean removePhone(String id);
    List<PhoneResponseDto> getAllPhones();
}
