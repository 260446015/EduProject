package com.edu.controller;

import com.edu.entity.Student;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.common.AjaxResult;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author yindawei 
 */
@Controller
@RequestMapping(value="/apis/eduShow")
public class EduController extends BaseController{

	@Autowired
	private StudentService studentService;
	/**
	 * 接口跳转ftl统一控制层
	 */
	@RequestMapping(value={"{page}"},method=RequestMethod.GET)
	public String urlMethod(@PathVariable String page, Model model, HttpServletRequest request){
		if(page.equalsIgnoreCase("editStudent")){
			String id = request.getParameter("id");
			Student student = studentService.findOne(Long.valueOf(id));
			model.addAttribute("student",student);
		}
		return "/student/" + page;
	}

	@RequestMapping(value="findEduInfo.json")
	public AjaxResult findEduInfo(){
		return success("");
	}
}
