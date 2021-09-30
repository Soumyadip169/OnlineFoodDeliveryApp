package com.capgemini.OFD.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.OFD.domain.Bill;

/**
 * This IBillService interface will hold the functionality for Bill Related
 * Business logic
 * @author Srivathsa H
 *
 */
public interface IBillService {
	/**
	 * This method is used to add bill to the database
	 * @param bill
	 * @return
	 */
	public Bill addBill(Bill bill);
	/**
	 * This method is used to update a bill 
	 * @param bill
	 * @return
	 */
	public Bill updateBill(Bill bill);
	/**
	 * This method is used to remove a bill 
	 * @param bill
	 * @return
	 */
	public Bill removeBill(Bill bill);
	/**
	 * This method is used to retrieve a bill from database
	 * @param bill
	 * @return
	 */
	public Bill viewBill(Bill bill);
	/**
	 * This method is used to view a bills from a particular startDate to a endDate
	 * @param bill
	 * @return
	 */
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	/**
	 * This method is used to view a bills of a particular customer by using customer Id
	 * @param bill
	 * @return
	 */
	public List<Bill> viewBills(String custId);
	/**
	 * This method is used to calculate total cost of the ordered items
	 * @param bill
	 * @return
	 */
	public double calculateTotalCost(Bill bill);
}
