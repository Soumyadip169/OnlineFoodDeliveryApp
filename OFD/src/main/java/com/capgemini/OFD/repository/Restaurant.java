package com.capgemini.OFD.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Restaurant {
	/**
	 * 
	 */
	public interface RestaurantReposiotry extends CrudRepository<Restaurant, String> {
	

	}
}
