package com.situ.struts.pojo;

public class Admin {
	private Integer id;
	private String name;
	private String password;
	
	public Admin() {
		super();
	}

	public Admin(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", password=" + password + "]";
	}

}
