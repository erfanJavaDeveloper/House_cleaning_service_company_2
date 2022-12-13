package com.example.house_cleaning_service_company.TypeOfService.dao;

import com.example.house_cleaning_service_company.TypeOfService.domain.ServiceOfCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceOfCompany_Dao extends JpaRepository<ServiceOfCompany,Long> {

}
