package com.spring.user.service;

import com.spring.user.VO.ResponseTemplateVO;
import com.spring.user.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    
    List<Student> getStudents();

    ResponseTemplateVO getStudentWithDepartment(Long id);
}
