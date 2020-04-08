package com.repairparts.repair_parts.entities.childs;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

import javax.persistence.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "Batteries")
public class BatteryEntity extends RepairPartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "orig")
    private boolean orig;

    public BatteryEntity(PhoneEntity phoneEntity, String type, Integer amount, Integer requiredAmount, boolean orig){
        super(phoneEntity, type, amount, requiredAmount);
        this.orig = orig;
    }
}
