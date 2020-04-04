package com.repairparts.repair_parts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class RepairPartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepairPartsApplication.class, args);
    }

}
