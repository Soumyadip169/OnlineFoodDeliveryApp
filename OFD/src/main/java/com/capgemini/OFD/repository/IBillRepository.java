package com.capgemini.OFD.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.OFD.domain.Bill;

public interface IBillRepository extends CrudRepository<Bill, String> {
	
	// TODO : No need to implement methods
	
	/**
	 * This method is used to view a bills from a particular startDate to a endDate
	 * @param bill
	 * @return
	 */
	List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	/**
	 * This method is used to view a bills of a particular customer by using customer Id
	 * @param bill
	 * @return
	 */
	List<Bill> viewBills(String custId);
	/**
	 * This method is used to calculate total cost of the ordered items
	 * @param bill
	 * @return
	 */
	double calculateTotalCost(Bill bill);
}
