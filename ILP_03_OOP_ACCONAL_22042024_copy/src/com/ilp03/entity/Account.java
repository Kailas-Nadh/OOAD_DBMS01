package com.ilp03.entity;

public abstract class Account {
	private String accountCode;
	private String accountName;
	
	

	public Account(String accountCode, String accountName) {
		this.accountCode = accountCode;
		this.accountName = accountName;
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

}
