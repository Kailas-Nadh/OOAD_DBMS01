package com.ilp03.service;

import com.ilp03.entity.Account;
import com.ilp03.entity.Customer;

public class AccountCustomerServices {
	public static Customer createCustomer() {
		Account account = new Account("SA100");
		Customer customer = new Customer("CUS100","Kailas",account);
		return customer;
	}

}
