package com.ilp03.service;

import java.util.Scanner;

import com.ilp03.entity.Account;

public class AccountService {
	
	public static Account createAccount() {
		
		Account account = new Account ();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------Enter Account Details-------------");
		System.out.println("Account code: ");
		String accountCode = scanner.nextLine();
		System.out.println("Account Name: ");
		String accountName = scanner.nextLine();
		System.out.println("Opening Date: ");
		String openingDate = scanner.nextLine();
		System.out.println("Closing date: ");
		String closingDate = scanner.nextLine();
		System.out.println("Account Balance: ");
		double accountBalance = scanner.nextDouble();
		
		account.setAccountCode(accountCode);
		account.setAccountName(accountName);
		account.setOpeningDate(openingDate);
		account.setClosingDate(closingDate);
		
		if(accountBalance < 1000) {
			account.setAccountBalance(1000.0);
		}
		else {
			account.setAccountBalance(accountBalance);
		}
		
		return account;
	}
	
	public static void displayAccount(Account account) {
		System.out.println("Account Code:"+"         "+"Account Name:"+"         "+"Opening Date:"+"         "+"Closing Date:"+"          "+"Account Balance:"+"        ");
		System.out.println(account.getAccountCode()+"                   "+account.getAccountName()+"                "+account.getOpeningDate()+"              "+account.getClosingDate()+"               "+account.getAccountBalance());

	}

}
