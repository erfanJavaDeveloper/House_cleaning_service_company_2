package com.example.house_cleaning_service_company.TypeOfService.service;

import com.example.house_cleaning_service_company.TypeOfService.dao.ServiceOfCompany_Dao;
import com.example.house_cleaning_service_company.TypeOfService.model.ServiceOfCompanyModel;
import com.example.house_cleaning_service_company.mapStructMapper.MapStructMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOfCompany_Service {
    @Autowired
    private ServiceOfCompany_Dao service_OfCompany_dao;

    @Autowired
    private MapStructMapper mapStructMapper;

    public ServiceOfCompanyModel save(ServiceOfCompanyModel serviceOfCompanyModel) {
        return mapStructMapper.convertServiceDomainToServiceModel(service_OfCompany_dao.save(mapStructMapper.convertServiceModelToServiceDomain(serviceOfCompanyModel)));
    }


    public ServiceOfCompanyModel findById(Long id) {
        return mapStructMapper.convertServiceDomainToServiceModel(service_OfCompany_dao.findById(id).get());
    }


//    public ServiceOfCompanyModel update(ServiceOfCompanyModel typeOfServiceModel) {
//        service_OfCompany_dao.update(typeOfServiceModel);
//    }


}
