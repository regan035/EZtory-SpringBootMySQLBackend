package com.EZtory.application.restfulwebservices;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String password;
	@Column(name="fname")
	private String fName;
	@Column(name="lname")
	private String lName;
	private String email;
	public User() {
		super();
	}
	public User(String username, String password, String fName, String lName, String email) {
		super();
		this.username = username;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
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
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
