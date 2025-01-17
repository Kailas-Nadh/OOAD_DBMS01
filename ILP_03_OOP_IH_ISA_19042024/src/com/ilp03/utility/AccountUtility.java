package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.entity.Account;
import com.ilp03.entity.CurrentAccount;
import com.ilp03.entity.SavingsAccount;
import com.ilp03.service.AccountService;

public class AccountUtility {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		SavingsAccount savingsAccount = null;
		CurrentAccount currentAccount = null;
		System.out.println("1. Savings Account  2. Current Account");
		
		Account account = AccountService.createAccount();

		System.out.println("Enter your choice:");
		int accountChoice = scanner.nextInt();
		switch(accountChoice) {
		    case 1: savingsAccount = AccountService.createSavingsAccount();
			        AccountService.displayAccount(savingsAccount);
		            break;
		    case 2: currentAccount = AccountService.createCurrentAccount();
	                AccountService.displayAccount(currentAccount);
		            break;
		    default: System.out.println("Invalid Choice");
		
		}
		//AccountService.displayAccount(account);
		

	}

}
