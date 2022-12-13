package com.example.house_cleaning_service_company.Worker2Order.service;

import com.example.house_cleaning_service_company.Worker2Order.dao.Worker2OrderDao;
import com.example.house_cleaning_service_company.Worker2Order.domain.Worker2Order;
import com.example.house_cleaning_service_company.Worker2Order.model.Worker2OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Worker2OrderService {

    @Autowired
    private Worker2OrderDao worker2OrderDao;


    public Worker2OrderModel save(Worker2OrderModel worker2OrderModel){
       return convertDomainToModel(worker2OrderDao.save(convertModelToDomain(worker2OrderModel)));
    }

    public Worker2OrderModel findById(Long id){
        return  convertDomainToModel(worker2OrderDao.findById(id).orElseThrow(RuntimeException::new));
    }

    private Worker2Order convertModelToDomain(Worker2OrderModel worker2OrderModel){
        Worker2Order worker2Order =  new Worker2Order();
        worker2Order.setWorkerId(worker2OrderModel.getWorkerId());
        worker2Order.setOrderId(worker2OrderModel.getOrderId());
        return worker2Order;
    }

    private Worker2OrderModel convertDomainToModel(Worker2Order worker2Order){
        Worker2OrderModel worker2OrderModel =  new Worker2OrderModel();
        worker2OrderModel.setWorkerId(worker2Order.getWorkerId());
        worker2OrderModel.setOrderId(worker2Order.getOrderId());
        worker2OrderModel.setId(worker2Order.getId());
        return worker2OrderModel;
    }

}