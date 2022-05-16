package com.xaohii.swaggerdemo.pojo;

/**
 * @Author xaohii
 * @Date 2022/5/16 21:44
 */
public class User {
	private String name;
	private String password;

	public User(String name, String password) {
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
}
