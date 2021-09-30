package com.capgemini.OFD.service;

import java.util.List;
import com.capgemini.OFD.domain.Customer;

public interface ICustomerService {

	/* definition of addCustomer method for adding new customer */
	Customer addCustomer(Customer customer); 

	/* definition of updateCustomer method for updating customer */
	Customer updateCustomer(Customer customer);

	/* definition of removeCustomer method for removing customer */
	public Customer removeCustomer(Customer customer); 

	/* definition of viewCustomer method for viewing particular customer */
	public Customer findCustomer(Customer customer);

	/* definition of viewAllCustomer method for viewing all customers */
	public List<Customer> findAllCustomer();

}
