package com.example.house_cleaning_service_company.employer.model;

import com.example.house_cleaning_service_company.Base.domain.BaseDomain;
import jakarta.persistence.Basic;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class EmployerModel  {

    private Long id;

    private String firstName;

    private String lastName;

    private String number;

    private String password;

    private String username;

    private LocalDate birthDayDate ;

    private  LocalDate registerDate;

    private LocalDate registerTime ;

}








