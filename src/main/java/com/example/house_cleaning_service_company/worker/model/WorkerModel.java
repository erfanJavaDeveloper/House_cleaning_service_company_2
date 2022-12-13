package com.example.house_cleaning_service_company.worker.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkerModel {
    private Long id;

    private String firstName;

    private String lastName;

    private String photo;

    private String number;

    private String password;

    private String username;
}
