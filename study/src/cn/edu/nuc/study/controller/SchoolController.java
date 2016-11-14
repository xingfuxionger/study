package cn.edu.nuc.study.controller;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.nuc.study.entity.School;
import cn.edu.nuc.study.service.SchoolService;




public class SchoolController {
	
/*	@Autowired
	private SchoolService schoolService;
	
	*//**
	 * 显示学校列表
	 * @param school
	 * @return
	 *//*
	@RequestMapping
	public ModelAndView list(School school){
		//List<User> userList = userService.listAllUser(page);
		List<School> schoolList = schoolService.listPageSchool(school);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("school");
		mv.addObject("shoolList", schoolList);
		mv.addObject("school", school);
		return mv;
	}
	
	*//**
	 * 请求新增学校页面
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="/add")
	public String toAdd(Model model){
		List<School> schoolList = schoolService.listAllSchools();
		model.addAttribute("schoolList", schoolList);
		return "school_info";
	}
	
	*//**
	 * 保存学校信息
	 * @param school
	 * @return
	 *//*
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveCouser(School school){
		ModelAndView mv = new ModelAndView();
		if(school.getSid()==null || school.getSid().intValue()==0){
			if(schoolService.insertSchool(school)==false){
				mv.addObject("msg","failed");
			}else{
				mv.addObject("msg","success");
			}
		}else{
			schoolService.updateSchoolBaseInfo(school);
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	*//**
	 * 请求编辑学校页面
	 * @param sId
	 * @return
	 *//*
	@RequestMapping(value="/edit")
	public ModelAndView toEdit(@RequestParam int sId){
		ModelAndView mv = new ModelAndView();
		School school = schoolService.getSchoolById(sId);
		mv.addObject("school", school);
		mv.setViewName("school_info");
		return mv;
	}
	
	*//**
	 * 删除某个课程
	 * @param sId
	 * @param out
	 *//*
	@RequestMapping(value="/delete")
	public void deleteUser(@RequestParam int sId,PrintWriter out){
		schoolService.deleteSchool(sId);
		out.write("success");
		out.close();
	}*/
}
