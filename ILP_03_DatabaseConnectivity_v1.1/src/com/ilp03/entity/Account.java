package com.ilp03.entity;

public class Account {
	
	private int accountID;
	private String accountNumber;
	private Customer customer;
	private Product product;
	
	public Account(int accountID, String accountNumber, Customer customer, Product product) {
		this.accountID = accountID;
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.product = product;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}
