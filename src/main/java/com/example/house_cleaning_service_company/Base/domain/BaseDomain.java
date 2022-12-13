package com.example.house_cleaning_service_company.Base.domain;



import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Setter
@Getter
public class BaseDomain {
    @Id
    private Long id;
}
