package com.example.house_cleaning_service_company.Worker2Order.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Worker2Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fk_orderId")
    private Long orderId;

    @Column(name = "fk_workerId")
    private Long workerId;

}