package com.repairparts.repair_parts.services;

import com.repairparts.repair_parts.dtos.PhoneRequestDto;
import com.repairparts.repair_parts.dtos.PhoneResponseDto;
import com.repairparts.repair_parts.exceptions.DataBaseConnectionException;
import com.repairparts.repair_parts.exceptions.PhoneAlreadyExistsException;
import com.repairparts.repair_parts.exceptions.PhoneNotFoundException;

import java.util.List;
import java.util.Optional;

public interface PhoneService {

    PhoneResponseDto addPhone(PhoneRequestDto phoneRequestDto) throws PhoneAlreadyExistsException, DataBaseConnectionException;
    PhoneResponseDto updatePhoneWithId(String id, PhoneRequestDto phoneRequestDto) throws DataBaseConnectionException;
    PhoneResponseDto removePhone(String id) throws DataBaseConnectionException;
    List<PhoneResponseDto> getAll();
}
