package com.repairparts.repair_parts.dtos;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class RepairPartRequestDto {

    private String brand;
    private String model;
    private String type;
    private int amount;
    private int requiredAmount;
    private String color;
    private String flexType;
    private boolean orig;
}
