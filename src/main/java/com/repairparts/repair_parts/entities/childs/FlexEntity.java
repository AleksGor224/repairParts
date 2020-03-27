package com.repairparts.repair_parts.entities.childs;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@Builder
public class FlexEntity extends RepairPartEntity {
    private String flexType;
    private boolean orig;

    public FlexEntity(PhoneEntity entity, String type, Integer amount, Integer requiredAmount, String flexType, boolean orig){
        super(entity, type, amount, requiredAmount);
        this.flexType = flexType;
        this.orig = orig;
    }

    public String toString(){
        String orig = "No";
        if(this.isOrig()){
            orig = "Yes";
        }
        StringBuilder bld = new StringBuilder();
                bld
                .append("ID: ")
                .append(super.getId()+";")
                .append(" \n")
                .append("AddedTime: ")
                .append(super.getAddedTime().toString()+";")
                .append(" \n")
                .append("Brand: ")
                .append("Model: ")
                .append("Type: ")
                .append(super.getType()+";")
                .append(" \n")
                .append("Amount: ")
                .append(super.getAmount()+";")
                .append(" \n")
                .append("ReqAmount: ")
                .append(super.getRequiredAmount()+";")
                .append(" \n")
                .append("FlexType: ")
                .append(this.getFlexType()+";")
                .append(" \n")
                .append("Orig: ")
                .append(orig);
        return bld.toString();
    }
}
