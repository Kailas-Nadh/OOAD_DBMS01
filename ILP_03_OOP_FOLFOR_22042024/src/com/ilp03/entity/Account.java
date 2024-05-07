package com.ilp03.entity;

public abstract class Account {
	private String accountCode;
	private String accountName;
	private double accountBalance;
	
	public abstract void withdraw();
	public abstract void deposit();
	
	

	public Account(String accountCode, String accountName,double accountBalance) {
		this.accountCode = accountCode;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
