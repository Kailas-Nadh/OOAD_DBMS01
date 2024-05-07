package com.ilp03.entity;

public class RuralAccount extends SavingsAccount {

	public RuralAccount(String accountNumber, String accountType, String creationDate, double accountBalance) {
		super(accountNumber, accountType, creationDate, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAccountMinimumBalance() {
		System.out.println("Your Account Minimum Balance should be :500.0");

	}

	@Override
	public void getATMDetails() {
		System.out.println("You Have FREE ATM Card!!!!!!!!!!!!!!!");
	}

}
