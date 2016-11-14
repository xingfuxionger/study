package cn.edu.nuc.study.service;

import java.util.List;

import cn.edu.nuc.study.entity.Menu;

public interface MenuService {
	
	List<Menu> listAllMenu();
	
	List<Menu> listAllParentMenu();
	
	List<Menu> listSubMenuByParentId(Integer parentId);
	
	Menu getMenuById(Integer menuId);
	
	void saveMenu(Menu menu);
	
	void deleteMenuById(Integer menuId);
	
	List<Menu> listAllSubMenu();
	
}
