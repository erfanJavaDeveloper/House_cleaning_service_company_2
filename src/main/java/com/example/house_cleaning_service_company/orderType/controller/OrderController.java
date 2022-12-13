package com.example.house_cleaning_service_company.orderType.controller;

import com.example.house_cleaning_service_company.orderType.model.OrderModel;
import com.example.house_cleaning_service_company.orderType.service.OrderService;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderModel> save(@RequestBody OrderModel orderModel) {
        return ResponseEntity.ok(orderService.save(orderModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderModel> view(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.view(id));
    }

    @PutMapping
    public ResponseEntity<OrderModel> update(@RequestBody OrderModel groupModel) {
        return ResponseEntity.ok(orderService.update(groupModel));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }

    @PostMapping("/{workerId}")
    public void RegisteringTheOrderToTheWorker(@PathVariable Long workerId, @RequestBody OrderModel orderModelInput) {
        orderService.registeringTheOrderToTheWorker(workerId, orderModelInput);
    }

    @GetMapping
    public List<WorkerModel> viewAllWorkerModelsAreActive() {
        return orderService.viewAllWorkerModelsAreActive();
    }

    @PostMapping("/pay-with-wallet/{orderId}")
    public void payWithWallet(@PathVariable Long orderId) {
        orderService.pay(orderId);
    }

}