package com.ilp03.entity;

public class Customer {
	private int id;
	private String customerFirstName;
	private String customerLastName;
	private String address;
	private long phNumber;
	
	public Customer(int id, String customerFirstName, String customerLastName, String address, long phNumber) {
		super();
		this.id = id;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.address = address;
		this.phNumber = phNumber;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	
	public String getCustomerLastName() {
		return customerLastName;
	}
	
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getPhNumber() {
		return phNumber;
	}
	
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	
}
