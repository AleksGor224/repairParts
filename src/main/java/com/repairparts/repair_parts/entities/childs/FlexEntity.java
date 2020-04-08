package com.repairparts.repair_parts.entities.childs;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

import javax.persistence.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "Flexes")
public class FlexEntity extends RepairPartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "type")
    private String flexType;
    @Column(name = "orig")
    private boolean orig;

    public FlexEntity(PhoneEntity phoneEntity, String type, Integer amount, Integer requiredAmount, String flexType, boolean orig){
        super(phoneEntity, type, amount, requiredAmount);
        this.flexType = flexType;
        this.orig = orig;
    }
}
