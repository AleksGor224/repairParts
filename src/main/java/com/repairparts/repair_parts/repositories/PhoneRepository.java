package com.repairparts.repair_parts.repositories;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;

import java.sql.SQLException;
import java.util.List;

public interface PhoneRepository {
    PhoneEntity addPhone(PhoneEntity entity) throws SQLException;
    PhoneEntity findById(String id);
    boolean removeById(String id);
    List<PhoneEntity> getAll();
}
