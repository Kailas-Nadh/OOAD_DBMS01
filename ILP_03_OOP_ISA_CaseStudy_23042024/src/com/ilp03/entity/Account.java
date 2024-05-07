package com.ilp03.entity;

public abstract class Account {
	
	private String accountNumber;
	private String accountType;
	private String creationDate;
	private double accountBalance;
	
	public abstract void getAccountMinimumBalance();
	public abstract void getATMDetails();
	
	public Account(String accountNumber, String accountType, String creationDate, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.creationDate = creationDate;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	

}
