package com.ilp03.service;

import java.util.Scanner;

import com.ilp03.entity.FixedDeposit;

public class FixedDepositService {
	
	public static FixedDeposit createFixedDeposit() {
		
		Scanner scanner = new Scanner (System.in);
		FixedDeposit fixedDeposit = new FixedDeposit();
		
		System.out.println("-----ENTER THE DETAILS OF THE FIXED DEPOSIT-----");
		System.out.println("Enter the Fixed Deposit ID: ");
		String fixedDepositID = scanner.nextLine(); 
		System.out.println("Enter the Account Number: ");
		String accountNumber = scanner.nextLine(); 
		System.out.println("Enter the FD Amount: ");
		double fixedDepositAmount = scanner.nextDouble(); 
		System.out.println("Enter the Mature Period: ");
		double maturePeriod = scanner.nextDouble(); 
		System.out.println("Enter the Interest Rate: ");
		double interestRate = scanner.nextDouble(); 
		
		fixedDeposit.setFixedDepositID(fixedDepositID);
		fixedDeposit.setAccountNumber(accountNumber);
		
		if(fixedDepositAmount<100000) {
			fixedDeposit.setFixedDepositAmount(100000);
		}
		else {
			fixedDeposit.setFixedDepositAmount(fixedDepositAmount);
		}

		fixedDeposit.setMaturePeriod(maturePeriod);
		fixedDeposit.setInterestRate(interestRate);
		
		return(fixedDeposit);
	}
	
	public static void displayFixedDepositDetails(FixedDeposit fixedDeposit) {
		
		System.out.println("Fixed Deposit ID:"+"         "+"Account Number:"+"         "+"FD Amount:"+"         "+"Mature Period:"+"          "+"Interest Rate:"+"        ");
		System.out.println(fixedDeposit.getFixedDepositID()+"                   "+fixedDeposit.getAccountNumber()+"                "+fixedDeposit.getFixedDepositAmount()+"              "+fixedDeposit.getMaturePeriod()+"               "+fixedDeposit.getInterestRate());

	}

}
