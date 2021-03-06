package com.repairparts.repair_parts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class WrongDataFormatException extends RuntimeException {

    public WrongDataFormatException(String message){
        super(message);
    }
}
