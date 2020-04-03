package com.repairparts.repair_parts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RepairPartNotFoundException extends RuntimeException{

    public RepairPartNotFoundException(String msg){
        super(msg);
    }
}
