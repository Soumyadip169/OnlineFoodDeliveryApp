package com.capgemini.OFD.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* This is an Entity class
 * 
 */
@Entity

/* To create table  "restaurants" */
@Table(name = "restaurants")

public class Restaurant {
	/*
	 * All the members are defined here with suitable datatypes
	 * 
	 */
	@Id
	/* To create column "restaurant_id */
	@Column (name = "restaurant_id" , length = 20)
	private String restaurantId;
	
	/* To create  column "restaurant_name */ 
	@Column (name = "restaurant_name" , length = 30 )
	private String restaurantName;
	
	/* To embed address from AddressModel */
	@Embedded
	private Address address;
	
	/* To create itemlist */
	private List<Item> itemlist; 
	
	/* To create column "manager_name" */
	private String ManagerName;
	
	/* To create column "contact_number" */
	private String ContactNumber;
	
	/*
	 * A default Constructor with no implementation
	 */
	public Restaurant() {
		//default
	}
	
	/* 
	 * A Parameterized Constructor for assigning the values to private numbers
	 */
	public Restaurant(String restaurantId, String restaurantName,Address address, 
			List<Item> itemlist , String ManagerName, String ContactNumber)  {
		super();
		this.restaurantId = restaurantId;
		this.restaurantId = restaurantId;
		this.address = address;
		this.itemlist = itemlist;
		this.ManagerName = ManagerName;
		this.ContactNumber =  ContactNumber;
	}
	
	/* 
	 * Corresponding Getters and Setters for private members
	 * 
	 */

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Item> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}	

}
