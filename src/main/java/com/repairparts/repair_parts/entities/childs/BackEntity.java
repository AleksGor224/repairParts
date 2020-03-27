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
public class BackEntity extends RepairPartEntity {
    private boolean orig;
    private String color;

    public BackEntity(PhoneEntity entity, String type, Integer amount, Integer requiredAmount, String color, boolean orig){
        super(entity, type, amount, requiredAmount);
        this.color = color;
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
                .append(" \n")
                .append("Amount: ")
                .append("Type: ")
                .append(super.getType()+";")
                .append(" \n")
                .append(super.getAmount()+";")
                .append(" \n")
                .append("ReqAmount: ")
                .append(super.getRequiredAmount()+";")
                .append(" \n")
                .append("Color: ")
                .append(this.getColor()+";")
                .append(" \n")
                .append("Orig: ")
                .append(orig);
        return bld.toString();
    }
}
