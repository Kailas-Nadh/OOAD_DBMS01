package com.ilp03.entity;
 
import java.util.ArrayList;
 
public class Account extends Product {
	private String accountCode;
	private ArrayList<Services> serviceList;
 
	public ArrayList<Services> getServiceList() {
		return serviceList;
	}
 
	public void setServiceList(ArrayList<Services> serviceList) {
		this.serviceList = serviceList;
	}
 
	public String getAccountCode() {
		return accountCode;
	}
 
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
 
	public Account(String productName, String productID, String accountCode, ArrayList<Services> serviceList) {
		super(productName, productID);
		this.accountCode = accountCode;
		this.serviceList = serviceList;
	}
	
 
}