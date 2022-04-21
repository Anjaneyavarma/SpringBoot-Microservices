package com.spring.user.controller;

import com.spring.user.VO.ResponseTemplateVO;
import com.spring.user.entity.Student;
import com.spring.user.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api")
public class StudentController {

    private final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @PostMapping("/save/student")
    public Student saveDepartment(@RequestBody Student student){
        LOGGER.info("inside saveDepartment of department controller");
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/department/{id}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") Long id){
        return studentService.getStudentWithDepartment(id);
    }

    @PostMapping("/save/student/department")
    public String saveStudentWithDepartment(@RequestBody ResponseTemplateVO responseTemplateVO){
        return studentService.saveStudentWithDepartment(responseTemplateVO);

    }
}
