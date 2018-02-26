package com.edu.service;

import com.alibaba.fastjson.JSONArray;
import com.edu.entity.Teacher;


public interface TeacherService {
    boolean addTeacher(Teacher teacher);

    JSONArray findTeacherGroup();
}
