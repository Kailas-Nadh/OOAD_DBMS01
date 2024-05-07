package com.ilp03.entity;

public class SavingsAccount extends Account {
	
	private String roi;
	

	public SavingsAccount(String accountCode, String accountName, String roi) {
		super(accountCode, accountName);
		this.roi = roi;
	}

	public String getRoi() {
		return roi;
	}

	public void setRoi(String roi) {
		this.roi = roi;
	}
	
	

}
