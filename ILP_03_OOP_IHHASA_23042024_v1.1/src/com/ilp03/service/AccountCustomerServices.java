package com.ilp03.service;

import java.util.ArrayList;

import com.ilp03.entity.Account;
import com.ilp03.entity.Customer;

public class AccountCustomerServices {
	public static Customer createCustomer() {
		ArrayList<Account> accountList = new ArrayList();
		accountList.add(new Account("SA100"));
		accountList.add(new Account("LA100"));
		accountList.add(new Account("CA100"));
		Customer customer = new Customer("CUS100","Kailas",accountList);
		return customer;
	}

}
