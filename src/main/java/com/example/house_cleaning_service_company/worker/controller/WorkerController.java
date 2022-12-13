package com.example.house_cleaning_service_company.worker.controller;

import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import com.example.house_cleaning_service_company.worker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkerService workerService;


    @PostMapping
    public ResponseEntity<WorkerModel> save(WorkerModel workerModel) {
        return ResponseEntity.ok(workerService.save(workerModel));

    }

    @DeleteMapping
    public ResponseEntity<WorkerModel> delete(Long id) {
        workerService.delete(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<WorkerModel> view(Long id) {
        return ResponseEntity.ok(workerService.findById(id));
    }

    @PutMapping
    public ResponseEntity<WorkerModel> update(WorkerModel workerModel) {
        return ResponseEntity.ok(workerService.update(workerModel));
    }

}
