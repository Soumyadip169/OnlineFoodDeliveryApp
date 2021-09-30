package com.capgemini.OFD.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
/**
 * This Customer Class is a domain, which represents data and it will be moving
 * layer to layer.
 * 
 * @author subhasree
 *
 */

public class Customer {
	@NotBlank(message="enter the customerId")
	private String customerId;
	@NotBlank(message="enter the first name")
	private String firstName;
	@NotBlank(message="enter the last name")
	private String lastName;
	@NotBlank(message="enter the age")
	@Size(min = 10, max=65, message="Size must be between 10 and 65")
	private int age;
	@NotBlank(message="enter the gender")
	private String gender;
	@NotBlank(message="enter the mobile number")
	private String mobileNumber;
	private Address address;
	@NotBlank(message="enter the email")
	private String email;
	/*
	 * parameterized constructor
	 */
	public Customer(String customerId,String firstName, String lastName, int age, String gender, String MobileNumber, Address address, String email ) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}
	/*
	 * getters and setters
	 */
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
