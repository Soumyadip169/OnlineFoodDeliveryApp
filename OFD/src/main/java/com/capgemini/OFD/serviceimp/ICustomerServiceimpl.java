package com.capgemini.OFD.serviceimp;

import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.OFD.repository.ICustomerRepository;
import com.capgemini.OFD.service.ICustomerService;
import com.capgemini.OFD.domain.Customer;
import com.capgemini.OFD.domain.Restaurant;
@Service
@Transactional
public class ICustomerServiceimpl implements ICustomerService{

	@Autowired
	ICustomerRepository iRep;
	@Override
	public Customer addCustomer(Customer customer) {
		
		return iRep.save(customer);
	}


	public Customer viewCustomer(Customer customer) {
		
	return iRep.findById(customer.getCustomerId()).orElseThrow(()->new EntityNotFoundException("No details!"));
	
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		
		 Customer cust=iRep.findById(customer.getCustomerId()).orElseThrow(()-> new
		  EntityNotFoundException("No customer found!"));
		cust.setFirstName(cust.getFirstName()); return iRep.save(cust);
	}

	@Override
	public Customer removeCustomer(Customer customer) {
		
		iRep.delete(customer);
		return null;
	}


	@Override
	public List<Customer> viewAllCustomers(Restaurant res) {
		//return (List<Customer>) iRep.findAll();
		
		return iRep.findAll();
	}


	
	  public List<Customer> viewAllCus(Customer customer1) {
	  
	  return iRep.findAll(); }
	 
}
