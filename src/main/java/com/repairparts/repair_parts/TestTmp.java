package com.repairparts.repair_parts;

import com.repairparts.repair_parts.entities.childs.BatteryEntity;
import com.repairparts.repair_parts.entities.childs.ScreenEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;

public class TestTmp {
    public static void main(String[] args) {
        RepairPartEntity screen1 = new ScreenEntity("Iphone","6G","Screen",5,6,"White",false);
        RepairPartEntity screen2 = new ScreenEntity("Iphone","6G","Screen",5,6,"Black",false);
        RepairPartEntity battery = new BatteryEntity("Iphone","6G","Battery",4,6,false);
        System.out.println(screen1);
        System.out.println();
        System.out.println(screen2);
        System.out.println();
        System.out.println(battery);
    }
}
