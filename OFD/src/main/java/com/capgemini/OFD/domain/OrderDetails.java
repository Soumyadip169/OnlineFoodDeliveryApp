package com.capgemini.OFD.domain;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 
 * This OrderDetails class is a domain, which represents data and it will be moving layer to layer
 * @author Sreeraj R
 *
 */

@Entity
public class OrderDetails {
	/**
	 * Id of the Order
	 * Primary Key and Auto generated
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	/**
	 * Date at which the order placed
	 */
	private LocalDateTime orderDate;
	
	/**
	 * Cart of the user
	 */
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL , mappedBy = "orderdetails")
	private FoodCart cart;
	
	/**
	 * Status of the order
	 */
	private String orderStatus;

	public OrderDetails() {
		super();
	}
	
	public OrderDetails(Integer orderId, LocalDateTime orderDate, FoodCart cart, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.cart = cart;
		this.orderStatus = orderStatus;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public FoodCart getCart() {
		return cart;
	}

	public void setCart(FoodCart cart) {
		this.cart = cart;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
	
}
