package com.repairparts.repair_parts;

import org.springframework.beans.factory.annotation.Value;

public class test {

    @Value("${db.url}")
    static String value;

    public static void main(String[] args) {

        System.out.println(value);
    }
}
