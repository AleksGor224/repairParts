package com.repairparts.repair_parts.repositories.repairParts.JPAs;

import com.repairparts.repair_parts.entities.childs.FlexEntity;
import org.springframework.data.repository.Repository;

public interface RPFlexesJPA extends Repository<FlexEntity,String> {

    FlexEntity save(FlexEntity entity);
    FlexEntity findById(String id);
    FlexEntity findAll();
    FlexEntity removeById(String id);
}
