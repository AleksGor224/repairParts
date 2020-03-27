package com.repairparts.repair_parts.entities.parents;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"brand","model"}))

public class PhoneEntity {
    @Id
    @Column(name = "entity_id")
    private String id;
    @Column(name = "phone_added_time")
    private LocalDateTime addedTime;
    @Column(name = "update_time")
    private LocalDateTime lastUpdateTime;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "model_repair_parts")
    @OneToMany(mappedBy="phoneEntity",fetch = FetchType.EAGER)
    private List<RepairPartEntity> repairPartEntities;
}
