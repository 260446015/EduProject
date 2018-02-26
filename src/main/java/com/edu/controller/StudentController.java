package com.edu.controller;

import com.edu.common.AjaxResult;
import com.edu.entity.dto.StudentInput;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生类控制层
 */
@RestController
@RequestMapping(value = "/apis/student")
public class StudentController extends BaseController{

    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/addStudent.json",method = {RequestMethod.POST})
    public AjaxResult addStudent(@RequestBody StudentInput student){
        return success(studentService.addStudent(student));
    }
    @RequestMapping(value = "/showStudent.json",method = {RequestMethod.POST})
    public AjaxResult showStudent(@RequestBody StudentInput student){
        return success(studentService.showStudent(student));
    }
    @RequestMapping(value = "/deleteStudent.json",method = {RequestMethod.GET})
    public AjaxResult deleteStudent(Long id){
        return success(studentService.deleteStudent(id));
    }
}
