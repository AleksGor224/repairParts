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
@Table(name = "Flexes")
public class FlexEntity extends RepairPartEntity {
    @Column(name = "type")
    private String flexType;
    @Column(name = "orig")
    private boolean orig;

    public FlexEntity(PhoneEntity entity, String type, Integer amount, Integer requiredAmount, String flexType, boolean orig){
        super(entity, type, amount, requiredAmount);
        this.flexType = flexType;
        this.orig = orig;
    }
}
