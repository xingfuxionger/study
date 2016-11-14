package cn.edu.nuc.study.entity;

public class Role {
	
	private Integer roleId;
	
	private String roleName;
	
	private String rights;
	
	public Integer getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRights() {
		return rights;
	}
	
	public void setRights(String rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "Role [rights=" + rights + ", roleId=" + roleId + ", roleName="
				+ roleName + "]";
	}
	
}
