package com.example.house_cleaning_service_company.TypeOfService.controller;

import com.example.house_cleaning_service_company.TypeOfService.model.ServiceOfCompanyModel;
import com.example.house_cleaning_service_company.TypeOfService.service.ServiceOfCompany_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/type-of-service")
public class ServiceOfCompany_Controller {

    @Autowired
    private ServiceOfCompany_Service service_OfCompany_service;

    @PostMapping
    public ResponseEntity<ServiceOfCompanyModel> save(ServiceOfCompanyModel serviceOfCompanyModel) {
        return ResponseEntity.ok(service_OfCompany_service.save(serviceOfCompanyModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceOfCompanyModel> findById(Long id) {
     return ResponseEntity.ok(service_OfCompany_service.findById(id)) ;

    }

    @PutMapping
    public ResponseEntity<ServiceOfCompanyModel> update(ServiceOfCompanyModel serviceOfCompanyModel) {
//        service_OfCompany_service.update();
     return ResponseEntity.ok(serviceOfCompanyModel);
    }

}