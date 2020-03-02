package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;

import java.util.List;

public interface PhoneService {

    PhoneResponseDto addPhone(PhoneRequestDto phoneRequestDto);
    PhoneResponseDto updatePhoneWithId(String id, PhoneRequestDto phoneRequestDto);
    boolean removePhone(String id);
    List<PhoneResponseDto> getAll();
}
