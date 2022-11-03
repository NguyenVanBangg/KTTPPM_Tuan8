package com.example.Department.service;

import com.example.Department.entity.Department;
import com.example.Department.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department save(Department dep) {
        return departmentRepository.save(dep);
    }
}
