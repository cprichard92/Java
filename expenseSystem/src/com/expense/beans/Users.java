package com.expense.beans;

import java.io.Serializable;

public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4934837047596826842L;
	private int userId;
	private String username;
	private String password;
	private String email;
	private int roleId;
	private String fname;
	private String lname;
	
	public Users(){
		
	}
	
	public Users(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public Users(int userId, String username, String password, String email, int roleId, String fname, String lname){
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.roleId = roleId;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", roleId=" + roleId + ", fname=" + fname + ", lname=" + lname + "]";
	}
}
