package com.example.house_cleaning_service_company.employer.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Employer {

//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String number;

    private String password;

    private String username;

    @Basic
    @Temporal(TemporalType.DATE)
    private LocalDate birthDayDate ;

    @Basic
    @Temporal(TemporalType.DATE)
    private  LocalDate registerDate= LocalDate.now();

    @Basic
    @Temporal(TemporalType.DATE)
    private LocalDate registerTime = LocalDate.now();

}