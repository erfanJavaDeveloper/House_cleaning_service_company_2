package com.example.house_cleaning_service_company.TypeOfService.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class ServiceOfCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ServiceName;

    private String description;

    @Column(name = "fk_group")
    private Long groupId;

}