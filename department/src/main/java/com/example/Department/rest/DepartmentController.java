package com.example.Department.rest;

import com.example.Department.entity.Department;
import com.example.Department.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/dep")
    public List<Department> getAll() {
        return departmentService.getAll();
    }

    @PostMapping("/dep")
    public Department save(@RequestBody Department dep) {
        return departmentService.save(dep);
    }
}
