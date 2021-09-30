package com.capgemini.OFD.domain;

/**
 * This is the Login bean class with userid, username and passwords as data members
 * All necessary constructors and setters/getters are provided
 * 
 * @author Soumyadip
 *
 */
public class Login {
	/*
	 * User ID of customer or restaurant owner
	 * PK and unique
	 */
	private String userid;
	/*
	 * User name
	 */
	private String username;
	/*
	 * Password of user
	 */
	private String password;
	/*
	 * Default Constructor
	 */
	public Login() {
		super();
	}
	/*
	 * Parameterized constructor
	 */
	public Login(String userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	/*
	 * Setters and getters
	 */
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
}
