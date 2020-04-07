package com.repairparts.repair_parts.repositories.repairParts.JPAs;

import com.repairparts.repair_parts.entities.childs.BatteryEntity;
import org.springframework.data.repository.Repository;

public interface RPBatteriesJPA extends Repository<BatteryEntity,String> {

    BatteryEntity save(BatteryEntity entity);
    BatteryEntity findById(String id);
    BatteryEntity findAll();
    BatteryEntity removeById(String id);
}
