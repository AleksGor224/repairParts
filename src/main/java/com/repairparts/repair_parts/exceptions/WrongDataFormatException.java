package com.repairparts.repair_parts.exceptions;

public class WrongDataFormatException extends IllegalArgumentException {

    public WrongDataFormatException(String message){
        super(message);
    }
}
