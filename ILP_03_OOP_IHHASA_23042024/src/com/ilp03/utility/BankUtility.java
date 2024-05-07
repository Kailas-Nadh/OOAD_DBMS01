package com.ilp03.utility;

import com.ilp03.entity.Customer;
import com.ilp03.service.AccountCustomerServices;

public class BankUtility {

	public static void main(String[] args) {
		
		Customer customer =	AccountCustomerServices.createCustomer();
		System.out.println(customer.getCustomerCode());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getAccount().getAccountCode());

	}

}
