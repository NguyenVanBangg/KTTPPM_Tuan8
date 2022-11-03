package com.example.Department.service;

import java.util.List;

import com.example.Department.entity.Department;

public interface DepartmentService {
    public List<Department> getAll();
    public Department save(Department dep);
}
