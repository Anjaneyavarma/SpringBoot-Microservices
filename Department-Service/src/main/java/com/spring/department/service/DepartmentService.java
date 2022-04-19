package com.spring.department.service;

import com.spring.department.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();

    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);
}
