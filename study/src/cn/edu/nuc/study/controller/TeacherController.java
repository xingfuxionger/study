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

import cn.edu.nuc.study.entity.Teacher;
import cn.edu.nuc.study.service.TeacherService;


public class TeacherController {
	
	/*@Autowired
	private TeacherService teacherService;
	
	*//**
	 * 显示教师列表
	 * @param teacher
	 * @return
	 *//*
	@RequestMapping
	public ModelAndView list(Teacher teacher){
		//List<User> userList = userService.listAllUser(page);
		List<Teacher> teacherList = teacherService.listPageCouser(teacher);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacher");
		mv.addObject("teacherList",teacherList);
		mv.addObject("teacher", teacher);
		return mv;
	}
	
	*//**
	 * 请求新增教师页面
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="/add")
	public String toAdd(Model model){
		List<Teacher> teacherList = teacherService.listAllTeachers();
		model.addAttribute("teacherList", teacherList);
		return "teacher_info";
	}
	
	*//**
	 * 保存教师信息
	 * @param teacher
	 * @return
	 *//*
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveTeacher(Teacher teacher){
		ModelAndView mv = new ModelAndView();
		if(teacher.getTid()==null || teacher.getTid().intValue()==0){
			if(teacherService.insertTeacher(teacher)==false){
				mv.addObject("msg","failed");
			}else{
				mv.addObject("msg","success");
			}
		}else{
			teacherService.updateTeacherBaseInfo(teacher);
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	*//**
	 * 请求编辑教师页面
	 * @param userId
	 * @return
	 *//*
	@RequestMapping(value="/edit")
	public ModelAndView toEdit(@RequestParam int tId){
		ModelAndView mv = new ModelAndView();
		Teacher teacher = teacherService.getTeacherById(tId);
		mv.addObject("teacher", teacher);
		mv.setViewName("couser_info");
		return mv;
	}
	
	*//**
	 * 删除某个教师
	 * @param userId
	 * @param out
	 *//*
	@RequestMapping(value="/delete")
	public void deleteTeacher(@RequestParam int tId,PrintWriter out){
		teacherService.deleteTeacher(tId);
		out.write("success");
		out.close();
	}*/
}
