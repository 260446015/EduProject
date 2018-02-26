package com.edu.service;

import org.springframework.data.domain.Page;

import com.edu.entity.Student;
import com.edu.entity.dto.StudentInput;

public interface EduService {

	Page<Student> findStudent(StudentInput student);
	
	boolean saveStudent(StudentInput student);
	
	boolean deleteStudent(StudentInput student);
}
