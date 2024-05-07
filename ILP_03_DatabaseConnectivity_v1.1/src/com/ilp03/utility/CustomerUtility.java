package com.ilp03.utility;

import com.ilp03.service.AccountService;
import com.ilp03.service.AccountServiceImpl;
import com.ilp03.service.CustomerService;
import com.ilp03.service.CustomerServiceImpl;

public class CustomerUtility {

	public static void main(String[] args) {
		//CustomerService customerService = new CustomerServiceImpl();
		//customerService.getAllCustomers();
		AccountService accountService = new AccountServiceImpl();
		accountService.getAccountsBasedOnProductName();
		
	}

}
