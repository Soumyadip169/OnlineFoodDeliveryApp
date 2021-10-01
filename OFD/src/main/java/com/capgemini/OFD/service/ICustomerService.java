package com.capgemini.OFD.service;

import java.util.List;

import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.Restaurant;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer viewCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public List<Customer> viewAllCustomers(Restaurant res);

}
