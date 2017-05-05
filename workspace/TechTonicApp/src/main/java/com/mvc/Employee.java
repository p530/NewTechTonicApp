package com.mvc;

public class Employee {
	String email,uname,pass;

	public Employee() {
	// TODO Auto-generated constructor stub
	}	


	public Employee(String email, String username, String password) {
		super();
		this.email = email;
		this.uname = username;
		this.pass = password;
	}

	public String getEmail() {
		return email;
	}

	

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String username) {
		this.uname = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String password) {
		this.pass = password;
	}
	

}
