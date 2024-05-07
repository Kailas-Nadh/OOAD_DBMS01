package com.ilp03.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Account;
import com.ilp03.entity.RuralAccount;
import com.ilp03.entity.SalaryAccount;

public class AccountServices {

	public static Account createAccount(int choice) {

		Account account = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		String accountNumber = scanner.nextLine();
		System.out.println("Enter Account Type:");
		String accountType = scanner.nextLine();
		System.out.println("Enter date of creation:");
		String creationDate = scanner.nextLine();
		System.out.println("Enter account balance:");
		double accountBalance = scanner.nextDouble();

		if (choice == 1) {
			account = new SalaryAccount(accountNumber, accountType, creationDate, accountBalance);

		} else if (choice == 2) {
			account = new RuralAccount(accountNumber, accountType, creationDate, accountBalance);
		}
		return account;

	}

	public static void displayAllAccount(ArrayList<Account> accountList) {

		for (Account account : accountList) {
			if (account instanceof SalaryAccount) {
				SalaryAccount salaryAccount = (SalaryAccount) account;
				displayAccount(account);
				account.getAccountMinimumBalance();
				account.getATMDetails();
			} else if (account instanceof RuralAccount) {
				RuralAccount ruralAccount = (RuralAccount) account;
				displayAccount(account);
				account.getAccountMinimumBalance();
				account.getATMDetails();
			}

		}
	}

	public static void displayAccount(Account account) {
		System.out.println("Account Name:" + account.getAccountNumber());
		System.out.println("Account Type:" + account.getAccountType());
		System.out.println("Creation Date:" + account.getCreationDate());
		System.out.println("Account Balance:" + account.getAccountBalance());

	}

}
