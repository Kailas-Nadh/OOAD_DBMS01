package com.ilp03.entity;

public class SavingsAccount extends Account implements Roi {

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

	@Override
	public void withdraw(String chequeNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String DD, double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount, String DD) {
		// TODO Auto-generated method stub
		
	}
	
	public static void calculateROI() {
		
		
	}

	@Override
	public void calculateRoi() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
