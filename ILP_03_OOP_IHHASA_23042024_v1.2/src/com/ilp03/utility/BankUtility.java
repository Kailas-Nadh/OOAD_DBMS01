package com.ilp03.utility;
 
 
import java.util.ArrayList;

import com.ilp03.entity.Account;
import com.ilp03.entity.Card;
import com.ilp03.entity.Services;
import com.ilp03.service.ProductService;
 
public class BankUtility {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = ProductService.createAccount();
			System.out.println(account.getAccountCode());
			System.out.println(account.getProductID());
			System.out.println(account.getProductName());
			ArrayList<Services> serviceList = new ArrayList<Services>();
			serviceList = account.getServiceList();
			for(Services service: serviceList)
			{
				System.out.println(service.getServiceName());
			}
			
			Card card = ProductService.issueCard();
			System.out.println(card.getCardName());
			System.out.println(card.getProductID());
			System.out.println(card.getProductName());
			//ArrayList<Services> serviceList = new ArrayList<Services>();
			serviceList = card.getServiceList();
			for(Services service: serviceList)
			{
				System.out.println(service.getServiceName());
			}
			
		
 
	}
 
}