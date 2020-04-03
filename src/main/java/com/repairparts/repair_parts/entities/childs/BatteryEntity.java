package com.repairparts.repair_parts.entities.childs;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder(builderMethodName = "childBuilder")
@Table(name = "Batteries")
public class BatteryEntity extends RepairPartEntity {
    @Column(name = "orig")
    private boolean orig;

    public BatteryEntity(PhoneEntity entity, String type, Integer amount, Integer requiredAmount, boolean orig){
        super(entity, type, amount, requiredAmount);
        this.orig = orig;
    }
}
