package com.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.edu.entity.Student;
import com.edu.entity.dto.StudentInput;
import com.edu.repository.StudentRepository;
import com.edu.service.EduService;

@Service
public class EduServiceImpl implements EduService {

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Page<Student> findStudent(StudentInput student) {
		return null;
		
	}
	@Override
	public boolean saveStudent(StudentInput student) {
		return false;
		
	}
	@Override
	public boolean deleteStudent(StudentInput student) {
		return false;
		
	}

}
