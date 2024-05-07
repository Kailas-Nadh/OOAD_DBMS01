package com.ilp03.entity;

public class CurrentAccount extends Account {

	public CurrentAccount(String accountCode, String accountName,double accountBalance) {
		super(accountCode, accountName,accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal of current account.");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit of current account.");
		
	}

}
