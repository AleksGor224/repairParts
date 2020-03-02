package com.repairparts.repair_parts.entities.childs;

import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@Builder
public class BatteryEntity extends RepairPartEntity {
    private boolean orig;

    public BatteryEntity(String brand, String model, String type, Integer amount, Integer requiredAmount, boolean orig){
        super(brand, model, type, amount, requiredAmount);
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
                .append(super.getBrand()+";")
                .append(" \n")
                .append("Model: ")
                .append(super.getModel()+";")
                .append(" \n")
                .append("Type: ")
                .append(super.getType()+";")
                .append(" \n")
                .append("Amount: ")
                .append(super.getAmount()+";")
                .append(" \n")
                .append("ReqAmount: ")
                .append(super.getRequiredAmount()+";")
                .append(" \n")
                .append("Orig: ")
                .append(orig);
        return bld.toString();
    }
}
