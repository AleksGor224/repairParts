package com.repairparts.repair_parts.repositories.repairParts.JPAs;

import com.repairparts.repair_parts.entities.childs.DisplayEntity;
import org.springframework.data.repository.Repository;

public interface RPDisplaysJPA extends Repository<DisplayEntity,String> {

    DisplayEntity save(DisplayEntity entity);
    DisplayEntity findById(String id);
    DisplayEntity findAll();
    DisplayEntity removeById(String id);
}
