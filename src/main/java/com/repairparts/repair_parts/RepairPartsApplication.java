package com.repairparts.repair_parts;

import com.repairparts.repair_parts.configurations.JdbcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class RepairPartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepairPartsApplication.class, args);
    }

}
