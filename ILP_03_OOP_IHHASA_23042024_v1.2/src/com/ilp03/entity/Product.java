package com.ilp03.entity;
 
public class Product {
	private String productName;
	private String productID;
	public Product(String productName, String productID) {
		super();
		this.productName = productName;
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	
}