/**
 * Bean design for userRoles
 * int userRoleId & userRole
 */
/**
 * @author yru289
 *
 */
package com.expense.beans;

import java.io.Serializable;

public class UserRoles implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7695978541503801949L;
	private int userRoleId;
	private String userRole;
	
	public UserRoles(){
		
	}
	
	public UserRoles(int id, String name){
		
		this.userRoleId = id;
		this.userRole = name;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserRoles [userRoleId=" + userRoleId + ", userRole=" + userRole + "]";
	}
}