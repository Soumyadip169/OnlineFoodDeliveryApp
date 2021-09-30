package com.capgemini.OFD.service;

import com.capgemini.OFD.domain.FoodCart;
import com.capgemini.OFD.domain.Item;

/**
 * The ICartService interface is a service, which is used to implement the business Logic of cart
 * @author Sreeraj R
 *
 */
public interface ICartService {

	/**
	 * This addItemToCart method will add the item to cart
	 * @param cart
	 * @param item
	 * @return 
	 */
	public FoodCart addItemToCart(FoodCart cart ,Item item);
	/**
	 * This increaseQuantity method will increase the quantity of item by the value of quantity in the cart
	 * @param cart
	 * @param item
	 * @param quantiy
	 * @return
	 */
	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity);
	/**
	 * This reduceQuantity method will reduce the quantity of item by the value of quantity in the cart
	 * @param cart
	 * @param item
	 * @param quantity
	 * @return
	 */
	public FoodCart reduceQuantity(FoodCart cart, Item item);
	/**
	 * This removeItem method will remove the item from the cart
	 * @param cart
	 * @param item
	 * @return
	 */
	public FoodCart removeItem(FoodCart cart, Item item);
	/**
	 * This clearCart method will clear all the items in the cart
	 * @param cart
	 * @return
	 */
	public FoodCart clearCart(FoodCart cart);
}
