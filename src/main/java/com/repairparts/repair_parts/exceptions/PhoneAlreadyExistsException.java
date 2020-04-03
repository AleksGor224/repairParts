package com.repairparts.repair_parts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class PhoneAlreadyExistsException extends RuntimeException {

    public PhoneAlreadyExistsException(String message){
        super(message);
    }

}
