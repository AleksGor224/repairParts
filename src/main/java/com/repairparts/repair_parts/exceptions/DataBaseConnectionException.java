package com.repairparts.repair_parts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT)
public class DataBaseConnectionException extends RuntimeException {

    public DataBaseConnectionException(String message){
        super(message);
    }
}
