package com.capgemini.OFD.domain;

import javax.validation.constraints.NotBlank;
/**
 * This Address Class is a domain, which represents data and it will be moving
 * layer to layer.
 * 
 * @author subhasree
 *
 */

public class Address {
	@NotBlank(message="enter addressId")
	private String addressId;
	@NotBlank(message= "Enter building name")
	private String buildingName;
	@NotBlank(message = "Enter the door no")
	private String doorNo;
	@NotBlank(message = "Enter the street")
	private String street;
	@NotBlank(message = "Enter the area")
	private String area;
	@NotBlank(message = "Enter the city")
	private String city;
	@NotBlank(message = "Enter the state")
	private String state;
	@NotBlank(message= "Enter country")
	private String country;
	@NotBlank(message= "Enter pincode")
	private String pincode;
	/*
	 * parameterized constructors
	 */


public Address(String addressId, String doorNo, String street, String area, String city, String state, String country, String pincode) {
	super();
	this.addressId = addressId;
	this.doorNo = doorNo;
	this.street = street;
	this.area = area;
	this.city = city;
	this.state = state;
	this.country=country;
	this.pincode = pincode;

}
/*
 * setters and getters
 */


public String getAddressId() {
	return addressId;
}


public void setAddressId(String addressId) {
	this.addressId = addressId;
}


public String getBuildingName() {
	return buildingName;
}


public void setBuildingName(String buildingName) {
	this.buildingName = buildingName;
}


public String getDoorNo() {
	return doorNo;
}


public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}


public String getStreet() {
	return street;
}


public void setStreet(String street) {
	this.street = street;
}


public String getArea() {
	return area;
}


public void setArea(String area) {
	this.area = area;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public String getPincode() {
	return pincode;
}


public void setPincode(String pincode) {
	this.pincode = pincode;
}

}
