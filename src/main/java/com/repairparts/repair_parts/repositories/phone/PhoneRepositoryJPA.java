package com.repairparts.repair_parts.repositories.phone;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PhoneRepositoryJPA extends Repository<PhoneEntity, String> {

    PhoneEntity save(PhoneEntity entity);
    PhoneEntity findById(String id);
    PhoneEntity removeById(String id);
    PhoneEntity findByBrandAndModel(String brand, String model);
    List<PhoneEntity> findAll();
}
