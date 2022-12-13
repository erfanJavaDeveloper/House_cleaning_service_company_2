package com.example.house_cleaning_service_company.orderType.service;

import com.example.house_cleaning_service_company.orderType.model.OrderModel;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;

import java.util.List;


public interface OrderService {

    OrderModel save(OrderModel orderModel);

    OrderModel view(Long id);

    OrderModel delete(Long id);

    OrderModel update(OrderModel orderModel);

    List<WorkerModel> viewAllWorkerModelsAreActive();

    void registeringTheOrderToTheWorker(Long workerId, OrderModel orderModelInput);

    //todo this method must have another
//     void kasrePoleAsHesab();

    void pay(Long orderId);

}
