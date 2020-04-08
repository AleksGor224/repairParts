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
@Table(name = "Backs")
public class BackEntity extends RepairPartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "orig")
    private boolean orig;
    @Column(name = "color")
    private String color;

    public BackEntity(PhoneEntity phoneEntity, String type, Integer amount, Integer requiredAmount, String color, boolean orig){
        super(phoneEntity, type, amount, requiredAmount);
        this.color = color;
        this.orig = orig;
    }
}
