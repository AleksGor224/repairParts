package com.repairparts.repair_parts.dtos;

import lombok.*;

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
