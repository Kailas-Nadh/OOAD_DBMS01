package com.ilp03.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Account;
import com.ilp03.entity.CurrentAccount;
import com.ilp03.entity.SavingsAccount;

public class AccountService {
	
	public static Account createAccount(int choice) {
		
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Code:");
		String accountCode =scanner.nextLine();
		System.out.println("Enter Account Name:");
		String accountName =scanner.nextLine();
		System.out.println("Enter Account Balance:");
		double accountBalance =scanner.nextDouble();
		
		
		if(choice==1) {
			//System.out.println("Enter ROI:");
			//String roi =scanner.nextLine();
			account = new SavingsAccount(accountCode,accountName,accountBalance);
			
		}
		else if(choice==2) {
			//System.out.println("Enter GST Number:");
			//String gstNo =scanner.nextLine();
			account = new CurrentAccount(accountCode,accountName,accountBalance);
		}
		
		return account;
	}
	
	public static void displayAllAccount(ArrayList<Account> accountList) {
		
		for(Account account : accountList) {
			String roi = "NA";
			String gstNo = "NA";
			if(account instanceof SavingsAccount) {
				SavingsAccount savingsAccount = (SavingsAccount)account;
				//roi = savingsAccount.getRoi();
				displayAccount(account,roi,gstNo);
			}
			else if(account instanceof CurrentAccount) {
				CurrentAccount currentAccount = (CurrentAccount)account;
				//gstNo = currentAccount.getGstNo();
				displayAccount(account,roi,gstNo);
			}
			
		}
	}
	
	public static Account searchAccount(ArrayList<Account> accountList) {
		Account searchAccount = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your account holder name:");
		String accountNumber=scanner.nextLine();
		for(Account account : accountList) {
			if(accountNumber.equals(account.getAccountCode())) {
				searchAccount=account;
			}
		}
		return searchAccount;
	}
	
	public static void withdraw (Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount needed to be withdrawn:");
		double amount = scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()-amount);
	}
	
	public static void deposit (Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount needed to be withdrawn:");
		double amount = scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+amount);
	}
	
	public static void displayAccount(Account account,String roi,String gstNo) {
		System.out.println("Account Code"+"     "+"Account Name"+"     "+"Account Balance");
		System.out.println(account.getAccountCode()+"       "+account.getAccountName()+"        "+account.getAccountBalance());
		
	}

}
