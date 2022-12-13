package com.example.house_cleaning_service_company.score.controller;

import com.example.house_cleaning_service_company.score.model.ScoreModel;
import com.example.house_cleaning_service_company.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping
    public ResponseEntity<ScoreModel> save(ScoreModel scoreModel){
        return ResponseEntity.ok(scoreService.save(scoreModel));
    }

    @GetMapping
    public ResponseEntity<ScoreModel> view(Long id){
       return ResponseEntity.ok(scoreService.view(id));
    }


}
