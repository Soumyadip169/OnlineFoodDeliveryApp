package com.capgemini.OFD.service;

import java.util.List;

import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.OrderDetails;
import com.capgemini.OFD.domain.Restaurant;


public interface IOrderService {

	public OrderDetails addOrder(OrderDetails order);
	
	public OrderDetails viewOrder(OrderDetails order);
	
	public OrderDetails updateOrder(OrderDetails order);
	
	public OrderDetails DeleteOrder(OrderDetails order);
	
	public List<OrderDetails> viewAllOrders(Customer customer);
	public List<OrderDetails> viewAllOrders(Restaurant res);
	
}