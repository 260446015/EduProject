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
import java.util.List;

/**
 * 
 * @author yindawei 
 * @date 2018年2月10日上午11:05:24
 * @description 
 * @version
 */
@Controller
@RequestMapping(value="/apis/eduShow")
public class EduController extends BaseController{

	@Autowired
	private StudentService studentService;
	/**
	 * 接口跳转ftl统一控制层
	 * @return
	 */
	@RequestMapping(value={"{page}"},method=RequestMethod.GET)
	public String urlMethod(@PathVariable String page, Model model, HttpServletRequest request){
		if(page.equalsIgnoreCase("editStudent")){
			String id = request.getParameter("id");
			Student student = studentService.findOne(Long.valueOf(id));
			model.addAttribute("student",student);
			System.out.println(student);
            System.out.println("dwddwdwd");
		}
		return "/student/" + page;
	}

	@RequestMapping(value="findEduInfo.json")
	public AjaxResult findEduInfo(){
		return success("");
	}
}
