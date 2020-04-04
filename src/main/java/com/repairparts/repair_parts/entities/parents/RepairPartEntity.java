package com.repairparts.repair_parts.entities.parents;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "repair_part_entity")
public class RepairPartEntity {

    public static final String PARENT = "RepairPartEntity[PhoneEntity]";


    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "added_time")
    private LocalDateTime addedTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entity_id")
    private PhoneEntity phoneEntityId;

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
        this.phoneEntityId = phoneEntity;
        this.addedTime = time;
        this.type = type;
        this.amount = amount;
        this.requiredAmount = requiredAmount;
    }
}
