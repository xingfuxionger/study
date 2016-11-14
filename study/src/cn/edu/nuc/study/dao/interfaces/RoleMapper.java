package cn.edu.nuc.study.dao.interfaces;

import java.util.List;

import cn.edu.nuc.study.entity.Role;

public interface RoleMapper {
	
	List<Role> listAllRoles();
	
	Role getRoleById(int roleId);
	
	void insertRole(Role role);
	
	void updateRoleBaseInfo(Role role);
	
	void deleteRoleById(int roleId);
	
	int getCountByName(Role role);
	
	void updateRoleRights(Role role);
	
}
