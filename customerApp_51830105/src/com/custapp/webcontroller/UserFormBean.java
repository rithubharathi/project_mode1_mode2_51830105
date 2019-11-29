package com.custapp.webcontroller;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserFormBean {
	@NotEmpty(message="email can't be left blank!")
	@Email(message="please enter valid email id")
	private String userId;
	@NotEmpty(message="password cant be blank")
	private String password;
	
	
	public String getuserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
