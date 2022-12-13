package com.example.house_cleaning_service_company.orderType.model;

import com.example.house_cleaning_service_company.orderType.domain.StateOfOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Setter
@Getter
public class OrderModel {
    private Long id;

    private Long typeOfServiceId;

    private Long employerId;

    private Long sumOfAmount;

    private Date timeDelivery;

    private Date dateDelivery;

    private Date timeOfOrder;

    private Date dateOfOrder;

    private StateOfOrder stateOfOrder;

}