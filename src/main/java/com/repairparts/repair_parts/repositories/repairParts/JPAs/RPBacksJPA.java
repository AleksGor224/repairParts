package com.repairparts.repair_parts.repositories.repairParts.JPAs;

import com.repairparts.repair_parts.entities.childs.BackEntity;
import org.springframework.data.repository.Repository;

public interface RPBacksJPA extends Repository<BackEntity,String> {

    BackEntity save(BackEntity entity);
    BackEntity findById(String id);
    BackEntity findAll();
    BackEntity removeById(String id);

}
