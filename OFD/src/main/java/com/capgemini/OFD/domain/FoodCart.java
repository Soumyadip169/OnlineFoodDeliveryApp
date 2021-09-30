package com.capgemini.OFD.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
/**
 * The FoodCart Class is a domain, which represents data and it will be moving layer to layer
 * @author Sreeraj R
 * 
 *
 */

@Entity
public class FoodCart {
	/**
	 * Id of Cart
	 * Primary Key
	 */
	@Id
	private String cartId;
	
	/**
	 * customer owing the cart
	 * OnetoOne relation with customer
	 */
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "foodcart")
	private Customer customer;
	
	/**
	 * List of items 
	 * One to many relation with customer 
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "foodcart")
	private List<Item> itemList;

	public FoodCart() {
		super();
	}
	
	public FoodCart(String cartId, Customer customer, List<Item> itemList) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.itemList = itemList;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	
}
