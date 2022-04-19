package com.spring.user.service;

import com.spring.user.VO.Department;
import com.spring.user.VO.ResponseTemplateVO;
import com.spring.user.entity.Student;
import com.spring.user.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public ResponseTemplateVO getStudentWithDepartment(Long id) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Student student = studentRepository.findByStudentId(id);
        Department department = restTemplate.getForObject("http://DEARTMENT-SERVICE/v1/api/department/"+ student.getDepartmentId()
                , Department.class);

        responseTemplateVO.setDepartment(department);
        responseTemplateVO.setStudent(student);

        return responseTemplateVO;
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

}
