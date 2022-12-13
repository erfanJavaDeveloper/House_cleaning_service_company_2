package com.example.house_cleaning_service_company.Worker2Order.dao;

import com.example.house_cleaning_service_company.Worker2Order.domain.Worker2Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Worker2OrderDao extends JpaRepository<Worker2Order,Long> {

}
