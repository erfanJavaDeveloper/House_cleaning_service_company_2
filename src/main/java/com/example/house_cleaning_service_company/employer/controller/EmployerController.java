package com.example.house_cleaning_service_company.employer.controller;

import com.example.house_cleaning_service_company.employer.domain.Employer;
import com.example.house_cleaning_service_company.employer.model.EmployerModel;
import com.example.house_cleaning_service_company.employer.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employer")
public class EmployerController {
    @Autowired
    private EmployerService employerService;


    @PostMapping
    public ResponseEntity<Employer> save(@RequestBody EmployerModel employerModel){
        return ResponseEntity.ok(employerService.save(employerModel));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Employer> delete(@PathVariable Long id){

        return ResponseEntity.ok(employerService.view(id));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody EmployerModel employerModel){
        employerService.update(employerModel);
        return ResponseEntity.ok(employerModel.getId() +" update");
    }


    @GetMapping("/{id}")
    public ResponseEntity<Employer> view(@PathVariable Long id){
            return ResponseEntity.status(HttpStatus.OK)
                .body(employerService.view(id));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Employer>> findAll(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(employerService.findAll());
    }

}
