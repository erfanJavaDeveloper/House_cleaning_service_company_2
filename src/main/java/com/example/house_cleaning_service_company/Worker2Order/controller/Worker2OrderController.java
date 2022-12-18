package com.example.house_cleaning_service_company.Worker2Order.controller;

import com.example.house_cleaning_service_company.Worker2Order.model.Worker2OrderModel;
import com.example.house_cleaning_service_company.Worker2Order.service.Worker2OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker-2-order")
public class Worker2OrderController {

    @Autowired
    private Worker2OrderService worker2OrderService;

    @PostMapping
    public ResponseEntity<Worker2OrderModel> save(Worker2OrderModel worker2OrderModel) {
        return ResponseEntity.ok(worker2OrderService.save(worker2OrderModel));
    }

    @GetMapping
    public ResponseEntity<Worker2OrderModel> findById(Long id) {
        return ResponseEntity.ok(worker2OrderService.findById(id));
    }

}