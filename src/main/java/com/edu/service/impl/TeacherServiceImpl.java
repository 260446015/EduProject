package com.edu.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.edu.entity.Teacher;
import com.edu.repository.TeacherRepository;
import com.edu.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {
    private static Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public boolean addTeacher(Teacher teacher) {
        boolean flag = false;
        try {
            teacherRepository.save(teacher);
            flag = true;
        } catch (Exception e) {
            log.error("保存教师失败!", e.getMessage());
        }
        return flag;
    }

    @Override
    public JSONArray findTeacherGroup() {
        JSONArray arr = new JSONArray();
        List<String> group = teacherRepository.findGroup();
        group.forEach(job -> {
            List<Teacher> byJob = teacherRepository.findByJob(job);
            arr.add(byJob);
        });
        return arr;
    }
}
