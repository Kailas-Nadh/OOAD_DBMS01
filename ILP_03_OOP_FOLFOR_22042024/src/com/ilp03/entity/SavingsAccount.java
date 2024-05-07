package com.ilp03.entity;

public class SavingsAccount extends Account {

	public SavingsAccount(String accountCode, String accountName,double accountBalance) {
		super(accountCode, accountName,accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal of savings account.");

		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit of savings account.");

		
	}
	

}
