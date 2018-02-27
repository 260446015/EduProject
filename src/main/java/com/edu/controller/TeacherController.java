package com.edu.controller;

import com.alibaba.fastjson.JSONObject;
import com.edu.common.AjaxResult;
import com.edu.entity.Teacher;
import com.edu.entity.dto.TeacherIput;
import com.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 教师类控制层
 */
@RestController
@RequestMapping(value = "/apis/teacher")
public class TeacherController extends BaseController{

    @Autowired
    private TeacherService teacherService;
    @RequestMapping(value = "/addTeacher.json",method = {RequestMethod.POST})
    public AjaxResult addTeacher(@RequestBody Teacher teacher){
        return success(teacherService.addTeacher(teacher));
    }
    @RequestMapping(value = "/findByJob.json",method = {RequestMethod.GET})
    public AjaxResult findByJob(String job){
        return success(teacherService.findByJob(job));
    }
    @RequestMapping(value = "/showTeacher.json",method = {RequestMethod.POST})
    public AjaxResult showTeacher(@RequestBody TeacherIput teacher){
        return success(teacherService.showTeacher(teacher));
    }
}
