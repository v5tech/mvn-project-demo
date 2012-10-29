package org.user.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
	
	private int id;
	private String username;
	private String password;
	private String memo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public User() {
	}
	public User(int id, String username, String password, String memo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.memo = memo;
	}
	
	
}
