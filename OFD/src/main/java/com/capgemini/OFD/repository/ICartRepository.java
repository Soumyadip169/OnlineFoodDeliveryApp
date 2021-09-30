package com.capgemini.OFD.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OFD.domain.FoodCart;
import com.capgemini.OFD.domain.Item;

/**
 * The ICartRepository class is a repository,to implement the CRUD operations on cart
 * @author Sreeraj R
 *
 */
@Repository
public interface ICartRepository extends CrudRepository<FoodCart, String> {
	/**
	 * This addItemToCart method will add the item to cart
	 * @param cart
	 * @param item
	 * @return 
	 */
	public FoodCart addItemToCart(FoodCart cart, Item item);
	/**
	 * This increaseQuantity method will increase the quantity of item by the value of quantity in the cart
	 * @param cart
	 * @param item
	 * @param quantiy
	 * @return
	 */
	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantiy);
	/**
	 * This reduceQuantity method will reduce the quantity of item by the value of quantity in the cart
	 * @param cart
	 * @param item
	 * @param quantity
	 * @return
	 */
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);
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
