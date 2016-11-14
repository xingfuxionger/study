package cn.edu.nuc.study.service.impl;

import java.util.List;

import cn.edu.nuc.study.dao.interfaces.MenuMapper;
import cn.edu.nuc.study.entity.Menu;
import cn.edu.nuc.study.service.MenuService;


public class MenuServiceImpl implements MenuService{

	private MenuMapper menuMapper;
	
	public void deleteMenuById(Integer menuId) {
		// TODO Auto-generated method stub
		menuMapper.deleteMenuById(menuId);
	}

	public Menu getMenuById(Integer menuId) {
		// TODO Auto-generated method stub
		return menuMapper.getMenuById(menuId);
	}

	public List<Menu> listAllParentMenu() {
		// TODO Auto-generated method stub
		return menuMapper.listAllParentMenu();
	}

	public void saveMenu(Menu menu) {
		// TODO Auto-generated method stub
		if(menu.getMenuId()!=null && menu.getMenuId().intValue()>0){
			menuMapper.updateMenu(menu);
		}else{
			menuMapper.insertMenu(menu);
		}
	}

	public List<Menu> listSubMenuByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		return menuMapper.listSubMenuByParentId(parentId);
	}
	
	public List<Menu> listAllMenu() {
		// TODO Auto-generated method stub
		List<Menu> rl = this.listAllParentMenu();
		for(Menu menu : rl){
			List<Menu> subList = this.listSubMenuByParentId(menu.getMenuId());
			menu.setSubMenu(subList);
		}
		return rl;
	}

	public List<Menu> listAllSubMenu(){
		return menuMapper.listAllSubMenu();
	}
	
	public MenuMapper getMenuMapper() {
		return menuMapper;
	}

	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}

}
