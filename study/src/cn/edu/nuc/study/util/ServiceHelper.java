package cn.edu.nuc.study.util;

import cn.edu.nuc.study.service.CouserService;
import cn.edu.nuc.study.service.MenuService;
import cn.edu.nuc.study.service.RoleService;
import cn.edu.nuc.study.service.SchoolService;
import cn.edu.nuc.study.service.TeacherService;
import cn.edu.nuc.study.service.UserService;


/**
 * @author Administrator
 * 获取Spring容器中的service bean
 */
public final class ServiceHelper {
	
	public static Object getService(String serviceName){
		//WebApplicationContextUtils.
		return Const.WEB_APP_CONTEXT.getBean(serviceName);
	}
	
	public static UserService getUserService(){
		return (UserService) getService("userService");
	}
	
	public static RoleService getRoleService(){
		return (RoleService) getService("roleService");
	}
	
	public static MenuService getMenuService(){
		return (MenuService) getService("menuService");
	}
	
	public static TeacherService getTeacherService(){
		return (TeacherService) getService("teacherService");
	}
	
	public static SchoolService getSchoolService(){
		return (SchoolService) getService("schoolService");
	}
	
	public static CouserService getCouserService(){
		return (CouserService) getService("couserService");
	}
}
