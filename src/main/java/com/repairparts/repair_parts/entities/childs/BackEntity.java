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
@Table(name = "Backs")
public class BackEntity extends RepairPartEntity {
    @Column(name = "orig")
    private boolean orig;
    @Column(name = "color")
    private String color;

    public BackEntity(PhoneEntity entity, String type, Integer amount, Integer requiredAmount, String color, boolean orig){
        super(entity, type, amount, requiredAmount);
        this.color = color;
        this.orig = orig;
    }
}
