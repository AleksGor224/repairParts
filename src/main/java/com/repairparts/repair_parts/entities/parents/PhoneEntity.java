package com.repairparts.repair_parts.entities.parents;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PhoneEntity {
    private String id;
    private LocalDateTime addedTime;
    private LocalDateTime lastUpdateTime;
    private String brand;
    private String model;
    private List<RepairPartEntity> repairPartEntities;
}
