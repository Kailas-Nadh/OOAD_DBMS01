package com.ilp03.entity;
 
import java.util.ArrayList;
 
public class Card extends Product {
 
 
	public String cardName;
	private ArrayList<Services> serviceList;
	public Card(String productName, String productID, String cardName, ArrayList<Services> serviceList) {
		super(productName, productID);
		this.cardName = cardName;
		this.serviceList = serviceList;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public ArrayList<Services> getServiceList() {
		return serviceList;
	}
	public void setServiceList(ArrayList<Services> serviceList) {
		this.serviceList = serviceList;
	}
	
	
	
}
 
 