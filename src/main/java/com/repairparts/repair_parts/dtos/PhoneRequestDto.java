package com.repairparts.repair_parts.dtos;

import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PhoneRequestDto {
    private String brand;
    private String model;
}
