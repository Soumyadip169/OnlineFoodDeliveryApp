package com.capgemini.OFD.service;

import java.util.List;
/**
 * 
 * @author thejhv
 *
 */
public interface Restaurant {
	
	
	/* Definition of addRestaurant method for adding restaurant */
	public Restaurant addRestaurant(Restaurant res);
	
	/* Definition of updateRestaurant method for updating restaurant */
	public Restaurant updateRestaurant(Restaurant res);
	
	/* Definition of removeRestaurant method for removing restaurant */
	public Restaurant removeRestaurant(Restaurant res);
	
	/* Definition of ViewNearByRestaurant method for Viewing restaurant */
	public List<Restaurant> ViewNearByRestaurant(String location);
	
	/* Definition of ViewRestaurantByItemName method for Viewing restaurant */
	public List<Restaurant> ViewRestaurantByItemName(String name);
	

}
