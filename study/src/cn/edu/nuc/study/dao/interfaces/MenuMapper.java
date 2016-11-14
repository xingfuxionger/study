package cn.edu.nuc.study.dao.interfaces;

import java.util.List;

import cn.edu.nuc.study.entity.Menu;

public interface MenuMapper {
	
	List<Menu> listAllParentMenu();
	
	List<Menu> listSubMenuByParentId(Integer parentId);
	
	Menu getMenuById(Integer menuId);
	
	void insertMenu(Menu menu);
	
	void updateMenu(Menu menu);
	
	void deleteMenuById(Integer menuId);
	
	List<Menu> listAllSubMenu();
	
}
