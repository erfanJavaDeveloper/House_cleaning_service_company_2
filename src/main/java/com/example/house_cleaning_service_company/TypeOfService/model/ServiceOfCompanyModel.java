package com.example.house_cleaning_service_company.TypeOfService.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder
public class ServiceOfCompanyModel {
    private Long id;

    private String ServiceName;

    private String description;

    private Long groupId;

}
