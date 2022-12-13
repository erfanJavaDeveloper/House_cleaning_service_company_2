package com.example.house_cleaning_service_company.worker.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String photo;

    private String number;

    private String password;

    private String username;

    @Enumerated(EnumType.STRING)
    private IsActive isActive;

}
