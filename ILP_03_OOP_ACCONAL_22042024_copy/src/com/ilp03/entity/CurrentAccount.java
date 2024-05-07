package com.ilp03.entity;

public class CurrentAccount extends Account {
	
	private String gstNo;

	public CurrentAccount(String accountCode, String accountName, String gstNo) {
		super(accountCode, accountName);
		this.gstNo = gstNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	
	
}
