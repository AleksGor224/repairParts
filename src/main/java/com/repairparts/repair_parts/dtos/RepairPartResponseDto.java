package com.repairparts.repair_parts.dtos;

import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class RepairPartResponseDto {

    private String id;
    private LocalDateTime addedTime;
    private LocalDateTime lastUpdateTime;
    private String brand;
    private String model;
    private String type;
    private int amount;
    private int requiredAmount;
    private String color;
    private String flexType;
    private boolean orig;
}
