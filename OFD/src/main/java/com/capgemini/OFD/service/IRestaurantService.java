package com.capgemini.OFD.service;

import java.util.List;

import com.capgemini.OFD.domain.*;

public interface IRestaurantService {
	
	public Restaurant addRestaurant(Restaurant res);
	
	public Restaurant viewRestaurant(Restaurant res);
	
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	
	public List<Restaurant> viewRestaurantByItemName(String name);
	
	public List<Restaurant> viewBearByRestaurant(String location);

}
