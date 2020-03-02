package com.repairparts.repair_parts.dtos;

import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PhoneResponseDto {
    private String id;
    private LocalDateTime addedTime;
    private LocalDateTime lastUpdateTime;
    private String brand;
    private String model;
    private List<RepairPartEntity> repairPartEntities;
}
