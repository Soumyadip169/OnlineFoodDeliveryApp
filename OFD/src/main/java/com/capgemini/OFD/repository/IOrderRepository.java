package com.capgemini.OFD.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.OrderDetails;
import com.capgemini.OFD.domain.Restaurant;

/**
 * The IOrderRepository class is a repository,to implement the CRUD operations on order
 * @author Sreeraj R
 *
 */
@Repository
public interface IOrderRepository extends CrudRepository<OrderDetails, Integer> {
	/**
	 * This addOrder method wil add the order
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
	public List<OrderDetails> viewAllOrders(Restaurant rest);
	/**
	 * This viewAllOrder method will view List of orders by customer
	 * @param order details
	 * @return Order details
	 */
	public List<OrderDetails> viewAllOrders(Customer customer);

}
