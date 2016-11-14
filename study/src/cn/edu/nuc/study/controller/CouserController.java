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

import cn.edu.nuc.study.entity.Couser;
import cn.edu.nuc.study.service.CouserService;


public class CouserController {
	
	/*@Autowired
	private CouserService couserService;
	
	*//**
	 * 显示课程列表
	 * @param couser
	 * @return
	 *//*
	@RequestMapping
	public ModelAndView list(Couser couser){
		//List<User> userList = userService.listAllUser(page);
		List<Couser> couserList = couserService.listPageCouser(couser);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("couser");
		mv.addObject("couserList", couserList);
		mv.addObject("couser", couser);
		return mv;
	}
	
	*//**
	 * 请求新增课程页面
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="/add")
	public String toAdd(Model model){
		List<Couser> couserList = couserService.listAllCousers();
		model.addAttribute("couserList", couserList);
		return "couser_info";
	}
	
	*//**
	 * 保存课程信息
	 * @param couser
	 * @return
	 *//*
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveCouser(Couser couser){
		ModelAndView mv = new ModelAndView();
		if(couser.getCid()==null || couser.getCid().intValue()==0){
			if(couserService.insertCouser(couser)==false){
				mv.addObject("msg","failed");
			}else{
				mv.addObject("msg","success");
			}
		}else{
			couserService.updateCouserBaseInfo(couser);
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	*//**
	 * 请求编辑课程页面
	 * @param cId
	 * @return
	 *//*
	@RequestMapping(value="/edit")
	public ModelAndView toEdit(@RequestParam int cId){
		ModelAndView mv = new ModelAndView();
		Couser couser = couserService.getCouserById(cId);
		mv.addObject("couser", couser);
		mv.setViewName("couser_info");
		return mv;
	}
	
	*//**
	 * 删除某个课程
	 * @param cId
	 * @param out
	 *//*
	@RequestMapping(value="/delete")
	public void deleteUser(@RequestParam int cId,PrintWriter out){
		couserService.deleteCouser(cId);
		out.write("success");
		out.close();
	}*/
}
