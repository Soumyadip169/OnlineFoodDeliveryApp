package com.capgemini.OFD.service;

import java.util.List;

import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.OrderDetails;
import com.capgemini.OFD.domain.Restaurant;

/**
 * The IOrderService interface is a service, which is used to implement the business Logic of order
 * @author Sreeraj R
 *
 */

public interface IOrderService {
	/**
	 * This addOrder method will save the order
	 * @param order details
	 * @return Order details
	 */
	public OrderDetails addOrder(OrderDetails order);
	/**
	 * This updateOrder method will update the order
	 * @param order details
	 * @return Order details
	 */
	public OrderDetails updateOrder(OrderDetails order);
	/**
	 * This removeOrder method will remove the order
	 * @param order details
	 * @return Order details
	 */
	public OrderDetails removeOrder(OrderDetails order);
	/**
	 * This viewOrder method will view the order
	 * @param order details
	 * @return Order details
	 */
	public OrderDetails viewOrder(OrderDetails order);
	/**
	 * This viewAllOrder method will view List of orders by restaurant
	 * @param order details
	 * @return Order details
	 */
	public List<OrderDetails> viewAllOrder(Restaurant res);
	/**
	 * This viewAllOrder method will view List of orders by customer
	 * @param order details
	 * @return Order details
	 */
	public List<OrderDetails> viewAllOrders(Customer customer);
}
