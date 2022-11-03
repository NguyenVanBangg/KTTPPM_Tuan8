package com.example.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
