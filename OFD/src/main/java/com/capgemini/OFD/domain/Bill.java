package com.capgemini.OFD.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
/**
 * Bill class consisting of parameters like billId,billDate,totalItem
 * @author Srivathsa H
 *
 */
@Entity
public class Bill {
	/**
	 * Bill id for a particular bill
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank(message = "Bill Id is required")
	private String billId;
	/**
	 * The date and time when the bill is created
	 */
	private LocalDateTime billDate;
	/**
	 * total number of items ordered by the customer
	 */
	private int totalItem;
	/**
	 * total cost for the ordered items
	 */
	private double totalCost;
	/**
	 * Order Details class, to get the details of a particular order
	 */
	private OrderDetails orderDetails;
	/**
	 * Default Constructor for the Bill Class
	 */
	public Bill() {
		super();
	}
	/**
	 * Getters and Setters
	 */
	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public LocalDateTime getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
}
