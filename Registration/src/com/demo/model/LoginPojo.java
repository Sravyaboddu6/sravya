package com.demo.model;

public class LoginPojo {

	private String UserName;
	private String password;
	private String role;
	
	

public LoginPojo(String UserName,String password,String role) {
	this.UserName = UserName;
	this.password = password;
	this.role = role;
}



public String getUserName() {
	return UserName;
}



public void setUserName(String userName) {
	UserName = userName;
}



public LoginPojo() {
	super();
	// TODO Auto-generated constructor stub
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getRole() {
	return role;
}



public void setRole(String role) {
	this.role = role;
}

}