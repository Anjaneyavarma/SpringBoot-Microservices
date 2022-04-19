package com.spring.department.controller;

import com.spring.department.entity.Department;
import com.spring.department.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class DepartmentController {

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        LOGGER.info("inside getDepartments of department controller");
        return departmentService.getDepartments();
    }

    @PostMapping("/save/department")
    public Department saveDepartment(@RequestBody Department department){
        LOGGER.info("inside saveDepartment of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        LOGGER.info("inside getDepartmentById of department controller");
        return departmentService.getDepartmentById(id);
    }
}
