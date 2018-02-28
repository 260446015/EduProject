package com.edu.service;

import com.edu.entity.Teacher;
import com.edu.entity.dto.TeacherIput;
import org.springframework.data.domain.Page;

import java.util.List;


public interface TeacherService {
    boolean addTeacher(Teacher teacher);

    List<Teacher> findByJob(String job);

    Page<Teacher> showTeacher(TeacherIput teacher);

    Teacher findOne(long id);

    List<String> findGroup();
}
