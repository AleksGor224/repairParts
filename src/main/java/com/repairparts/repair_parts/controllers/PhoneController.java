package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.PhoneAlreadyExistsException;

import java.util.List;
import java.util.Optional;

public interface PhoneController {

    Optional<PhoneResponseDto> addPhone(PhoneRequestDto phoneRequestDto) throws PhoneAlreadyExistsException, DataBaseConnectionException;
    Optional<PhoneResponseDto> updatePhoneWithId(String id, PhoneRequestDto phoneEntity);
    Optional<PhoneResponseDto> removePhone(String id);
    List<PhoneResponseDto> getAllPhones();
}
