package com.capgemini.OFD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.Restaurant;
/**
 * The ICustomerrRepository class is a repository,to implement the CRUD operations on order
 * @author Subhasree
 *
 */

@Repository
public interface ICustomerRepository  extends JpaRepository<Customer, Integer> {
	/**
	 * This addCustomer method will add the customer
	 * @param customer 
	 * @return Customer 
	 */
	public Customer addCustomer(Customer customer);
	/**
	 * This updateCustomer method will update the customer
	 * @param customer 
	 * @return Customer 
	 */
	public Customer updateCustomer(Customer customer);
	/**
	 * This removeCustomer method will remove the customer
	 * @param customer 
	 * @return Customer 
	 */
	public Customer removeCustomer(Customer customer);
	/**
	 * This viewCustomer method will view the customer
	 * @param cutomer 
	 * @return Customer 
	 */
	public Customer viewCustomer(Customer customer);
	/**
	 * This viewAllCustomer method will view List of customers by restaurant
	 * @param customer
	 * @return Customer
	 */
	public List<Customer> viewAllCustomers(Restaurant rest);

}
