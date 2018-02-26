package com.edu.service.impl;

import com.edu.entity.Student;
import com.edu.entity.Teacher;
import com.edu.entity.dto.StudentInput;
import com.edu.repository.StudentRepository;
import com.edu.repository.TeacherRepository;
import com.edu.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    private static Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Page<Student> showStudent(StudentInput student) {
        PageRequest pageRequest = new PageRequest(student.getPageNum(),student.getPageSize());
        return studentRepository.findAll(pageRequest);
    }

    @Override
    public Student findOne(long id) {
       return studentRepository.findOne(id);
    }

    @Override
    public boolean deleteStudent(Long id) {
        boolean flag = false;
        try {
            studentRepository.delete(id);
            flag = true;
        }catch (Exception e){
            log.error("删除学生失败",e.getMessage());
        }
        return flag;
    }

    @Override
    public boolean addStudent(StudentInput student) {
        boolean flag = false;
        try {
            Student data = new Student();
            BeanUtils.copyProperties(student,data);
            Set<Teacher> teachers = new HashSet<>();
            student.getCourse().forEach(id ->{
                Teacher one = teacherRepository.findOne(id);
                teachers.add(one);
            });
            data.setTeachers(teachers);
            flag = true;
        } catch (Exception e) {
            log.error("保存学生失败!", e.getMessage());
        }
        return flag;
    }
}
