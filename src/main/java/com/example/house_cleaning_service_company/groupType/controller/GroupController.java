package com.example.house_cleaning_service_company.groupType.controller;

import com.example.house_cleaning_service_company.groupType.model.GroupModel;
import com.example.house_cleaning_service_company.groupType.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping
    public ResponseEntity<GroupModel> save(@RequestBody GroupModel groupModel) {
        return ResponseEntity.ok(groupService.save(groupModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupModel> view(@PathVariable Long id) {
        return ResponseEntity.ok(groupService.view(id));
    }

    @PutMapping
    public ResponseEntity<GroupModel> update(@RequestBody GroupModel groupModel) {
        return ResponseEntity.ok(groupService.update(groupModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GroupModel> delete(@PathVariable Long id) {
        return ResponseEntity.ok(groupService.delete(id));
    }

}