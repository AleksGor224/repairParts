package com.repairparts.repair_parts.entities.parents;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class RepairPartEntity {

    private LocalDateTime addedTime;
    private String id;
    private String brand;
    private String model;
    private String type;
    private Integer amount;
    private Integer requiredAmount;

    public RepairPartEntity(String brand, String model, String type, Integer amount, Integer requiredAmount){
        String id = UUID.randomUUID().toString();
        LocalDateTime time = LocalDateTime.now();
        this.id = id;
        this.addedTime = time;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.amount = amount;
        this.requiredAmount = requiredAmount;
    }
}
