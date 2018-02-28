package com.edu.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.edu.entity.Teacher;
import com.edu.entity.dto.TeacherIput;
import com.edu.repository.TeacherRepository;
import com.edu.service.TeacherService;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public List<Teacher> findByJob(String job) {
        return teacherRepository.findByJob(job);
    }

    @Override
    public Page<Teacher> showTeacher(TeacherIput teacher) {
        PageRequest pageRequest = new PageRequest(teacher.getPageNum(),teacher.getPageSize());
        /*if(StringUtil.isEmpty(teacher.getSearchName())){
            teacherRepository.findBy
        }*/
        return teacherRepository.findAll(pageRequest);
    }

    @Override
    public Teacher findOne(long id) {
        return teacherRepository.findOne(id);
    }

    @Override
    public List<String> findGroup() {
        return teacherRepository.findGroup();
    }
}
