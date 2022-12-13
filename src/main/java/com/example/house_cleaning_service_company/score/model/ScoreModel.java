package com.example.house_cleaning_service_company.score.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ScoreModel {

    private Long id;

    private Long orderId;

    private Long employerId;

    private Integer workerScore;
}
