package com.capgemini.OFD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.OFD.domain.Restaurant;

public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer>{
@Query("Select r from Restaurant r where resturant_name=?1")
	//@Query("Select r From item_master_restaurants where ")
	List<Restaurant> findByName(String name);
@Query("Select r1 From Address r1 where area=?1")
List<Restaurant> findByLocation(String location);

}
