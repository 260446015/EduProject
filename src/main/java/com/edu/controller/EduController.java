package com.edu.controller;

import com.alibaba.fastjson.JSONArray;
import com.edu.entity.Student;
import com.edu.entity.Teacher;
import com.edu.service.StudentService;
import com.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.common.AjaxResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 
 * @author yindawei 
 */
@Controller
@RequestMapping(value="/apis/eduShow")
public class EduController extends BaseController{

	@Autowired
	private StudentService studentService;
	@Autowired
    private TeacherService teacherService;
	/**
	 * 接口跳转ftl统一控制层
	 */
	@RequestMapping(value={"{page}"},method=RequestMethod.GET)
	public String urlMethod(@PathVariable String page, Model model, HttpServletRequest request){
		if(page.equalsIgnoreCase("editStudent") || page.equalsIgnoreCase("addStudent")){
			if(page.equalsIgnoreCase("editStudent")){
				String id = request.getParameter("id");
				Student student = studentService.findOne(Long.valueOf(id));
				model.addAttribute("student",student);
			}
			List<Teacher> chinese = teacherService.findByJob("语文");
			List<Teacher> math = teacherService.findByJob("数学");
			List<Teacher> english = teacherService.findByJob("外语");
			model.addAttribute("chinese",chinese);
			model.addAttribute("math",math);
			model.addAttribute("english",english);
		}else if(page.equalsIgnoreCase("editTeacher")){
			String id = request.getParameter("id");
			Teacher teacher = teacherService.findOne(Long.valueOf(id));
			model.addAttribute("teacher",teacher);
		}
		return "/student/" + page;
	}

	@RequestMapping(value="findEduInfo.json")
	public AjaxResult findEduInfo(){
		return success("");
	}
}
