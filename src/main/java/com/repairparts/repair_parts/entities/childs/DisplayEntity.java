package com.repairparts.repair_parts.entities.childs;

import com.repairparts.repair_parts.entities.parents.PhoneEntity;
import com.repairparts.repair_parts.entities.parents.RepairPartEntity;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder(builderMethodName = "childBuilder")
@Entity
@Table(name = "Displays")
public class DisplayEntity extends RepairPartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "color")
    @Builder.Default
    private String color = "black";
    @Column(name = "orig")
    @Builder.Default
    private boolean orig = false;

    public DisplayEntity(PhoneEntity phoneEntity, String type, Integer amount, Integer requiredAmount, String color, boolean orig){
        super(phoneEntity, type, amount, requiredAmount);
        this.color = color;
        this.orig = orig;
    }
}
