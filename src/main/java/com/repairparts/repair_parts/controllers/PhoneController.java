package com.repairparts.repair_parts.controllers;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.PhoneAlreadyExistsException;
import com.repairparts.repair_parts.exceptions.PhoneNotFoundException;

import java.util.List;
import java.util.Optional;

public interface PhoneController {

    PhoneResponseDto addPhone(PhoneRequestDto phoneRequestDto) throws PhoneAlreadyExistsException, DataBaseConnectionException;
    PhoneResponseDto updatePhoneWithId(String id, PhoneRequestDto phoneEntity) throws PhoneNotFoundException, DataBaseConnectionException;
    PhoneResponseDto removePhone(String id) throws DataBaseConnectionException, PhoneNotFoundException;
    List<PhoneResponseDto> getAllPhones();
}
