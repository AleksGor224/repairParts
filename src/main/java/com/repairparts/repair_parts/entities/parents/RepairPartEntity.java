package com.repairparts.repair_parts.entities.parents;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter

public abstract class RepairPartEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "added_time")
    private LocalDateTime addedTime;

    @Column(name = "last_update_time")
    private LocalDateTime updateTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entity_id")
    private PhoneEntity phoneEntity;

    @Column(name = "type")
    private String type;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "required_amount")
    private Integer requiredAmount;

    public RepairPartEntity(PhoneEntity phoneEntity, String type, Integer amount, Integer requiredAmount){
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
