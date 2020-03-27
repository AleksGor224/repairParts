package com.repairparts.repair_parts.entities.parents;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
@Table
public class RepairPartEntity {

    private LocalDateTime addedTime;
    @Id
    private String id;
    @ManyToOne()
    private PhoneEntity phoneEntity;
    private String type;
    private Integer amount;
    private Integer requiredAmount;

    public RepairPartEntity(PhoneEntity phoneEntity,String type, Integer amount, Integer requiredAmount){
        String id = UUID.randomUUID().toString();
        LocalDateTime time = LocalDateTime.now();
        this.id = id;
        this.phoneEntity = phoneEntity;
        this.addedTime = time;
        this.type = type;
        this.amount = amount;
        this.requiredAmount = requiredAmount;
    }
}
