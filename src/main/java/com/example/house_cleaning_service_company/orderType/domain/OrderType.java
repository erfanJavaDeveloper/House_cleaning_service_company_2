package com.example.house_cleaning_service_company.orderType.domain;

import lombok.*;

import jakarta.persistence.*;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class OrderType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fk_typeOfService")
    private Long typeOfServiceId;

    @Column(name = "fk_employer")
    private Long employerId;

    private Long sumOfAmount;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @TableGenerator(name = "OrderGenerator", initialValue = 1000)
//    @Column(unique = true)
//    private int uniqueIdentifierOrder;

    @Enumerated(EnumType.STRING)
    private StateOfOrder stateOfOrder;

    @Temporal(TemporalType.TIME)
    private Date timeOfOrder= new Date();

    @Temporal(TemporalType.DATE)
    private Date dateOfOrder = new Date();

    @Temporal(TemporalType.TIME)
    private Date timeDelivery = null;

    @Temporal(TemporalType.DATE)
    private Date dateDelivery = null ;

}