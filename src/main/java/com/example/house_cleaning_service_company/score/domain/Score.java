package com.example.house_cleaning_service_company.score.domain;


import lombok.*;

import jakarta.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fk_order")
    private Long orderId;

    @Column(name = "fk_employer")
    private Long employerId;

    private Integer workerScore;

}