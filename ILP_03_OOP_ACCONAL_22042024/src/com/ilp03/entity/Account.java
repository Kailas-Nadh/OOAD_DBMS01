package com.ilp03.entity;

public abstract class Account {
	private String accountCode;
	private String accountName;
	private double accountBalance;
	//private double withdrawAmount;
	//private double depositAmount;
	
	

	public Account(String accountCode, String accountName, double accountBalance) {
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

	/*public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}*/
	
	

}
