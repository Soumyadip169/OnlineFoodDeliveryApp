package com.capgemini.OFD.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OFD.domain.Customer;

@Repository
public interface ICustomerRepository  extends CrudRepository<Customer, String> {

}
