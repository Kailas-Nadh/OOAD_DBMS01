package com.ilp03.service;
 
import java.util.ArrayList;
 
import com.ilp03.entity.Account;
import com.ilp03.entity.Card;
import com.ilp03.entity.Services;
 
public class ProductService {
	public static Account createAccount(){
		ArrayList<Services> serviceList = new ArrayList<Services>();
		serviceList.add(new Services("Deposit"));
		serviceList.add(new Services("Withdraw"));
		serviceList.add(new Services("CloseAccount"));
		Account account = new Account("AC100","Kailas","AC100",serviceList);
		return account;
	}
	
	public static Card issueCard(){
		ArrayList<Services> serviceList = new ArrayList<Services>();
		serviceList.add(new Services("RenewCard"));
		serviceList.add(new Services("Change Number"));
		serviceList.add(new Services("Block Card"));
		Card card = new Card("Debit Card","C100","Platinum",serviceList);
		return card;
	}
 
}