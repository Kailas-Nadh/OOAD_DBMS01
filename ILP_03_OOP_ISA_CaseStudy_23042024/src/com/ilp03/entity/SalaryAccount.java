package com.ilp03.entity;

public class SalaryAccount extends SavingsAccount {

	public SalaryAccount(String accountNumber, String accountType, String creationDate, double accountBalance) {
		super(accountNumber, accountType, creationDate, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAccountMinimumBalance() {
		System.out.println("Your Account Minimum Balance should be :1000.0");

	}

	@Override
	public void getATMDetails() {
		System.out.println("You will be charged for an ATM Card!");

	}

}
