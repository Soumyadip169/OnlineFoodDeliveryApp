package com.capgemini.OFD.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* This is Entity class
 * 
 */
@Entity

/* To create table "items" */
@Table (name = "items")

public class Item {
	/*
	 * All the private members are defined here with suitable datatypes
	 * 
	 */
	@Id
	/*  For creating item_id column */
	@Column (name = "item_id" ,length=20)
	private String itemId;
	
	/* For creating item_name column */
	@Column (name = "item_name" , length=30)
	private String itemName;
	
	/* To create category */
	private Category category;
	
	/* For creating quantity column */
	@Column (name="quanity")
	private Integer quantity;
	
	/*For creating cost column */
	@Column (name="cost")
	private Double cost;
	
	private List<Restaurant> restaurants;
	
	/* 
	 * A default Constructor with no implementation
	 */
	public Item()  {
		//default
	}
	
	/*
	 * A Parametrized Constructor for assigning the values  to private members
	 */

	public Item(String itemId, String itemName, Category category, Integer quantity, Double cost,
			List<Restaurant> restaurants) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		this.restaurants = restaurants;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	
	

}
