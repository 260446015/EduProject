package com.edu.service;

import com.edu.entity.Student;
import com.edu.entity.dto.StudentInput;
import org.springframework.data.domain.Page;

public interface StudentService {
    boolean addStudent(StudentInput student);

    Page<Student> showStudent(StudentInput student);

    boolean deleteStudent(Long id);

    Student findOne(long id);
}
