package com.ilp03.service;

import java.util.Scanner;

import com.ilp03.entity.Account;
import com.ilp03.entity.CurrentAccount;
import com.ilp03.entity.SavingsAccount;

public class AccountService {
	
	public static Account createAccount() {
		
		Account account = new Account ();
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("------------Enter Account Details-------------");
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
		}*/
		
		return account;
	}

	public static SavingsAccount createSavingsAccount() {
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
		System.out.println("ROI:");
		scanner.nextLine();
		String roi = scanner.nextLine();
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountCode(accountCode);
		savingsAccount.setAccountName(accountName);
		savingsAccount.setOpeningDate(openingDate);
		savingsAccount.setClosingDate(closingDate);
		savingsAccount.setAccountBalance(accountBalance);
		savingsAccount.setRoi(roi);
		
		
		// TODO Auto-generated method stub
		return savingsAccount;
	}

	public static CurrentAccount createCurrentAccount() {
		
		Account account = new Account ();
		CurrentAccount currentAccount = new CurrentAccount();
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
		System.out.println("GST No:");
		String gstNo = scanner.nextLine();
		
		currentAccount.setAccountCode(accountCode);
		currentAccount.setAccountName(accountName);
		currentAccount.setOpeningDate(openingDate);
		currentAccount.setClosingDate(closingDate);
		currentAccount.setAccountBalance(accountBalance);
		currentAccount.setGstNo(gstNo);
		// TODO Auto-generated method stub
		return currentAccount;
	}
	
public static void displayAccount(Account account) {
		
	    //Account account = new Account()
		SavingsAccount savingsAccount = null;
		CurrentAccount currentAccount = null;
		String roi = "NA";
		String gstNo="NA";

		
		if(account instanceof SavingsAccount) {
			savingsAccount =(SavingsAccount)account;
			roi = savingsAccount.getRoi();
		}
		
		if(account instanceof CurrentAccount) {
			currentAccount =(CurrentAccount)account;
			gstNo = currentAccount.getGstNo();
		}
		System.out.println("Account Code:"+"         "+"Account Name:"+"         "+"Opening Date:"+"         "+"Closing Date:"+"          "+"Account Balance:"+"        "+"ROI:"+"       "+"GST No.");
		System.out.println(account.getAccountCode()+"                   "+account.getAccountName()+"                "+account.getOpeningDate()+"              "+account.getClosingDate()+"               "+account.getAccountBalance()+"    "+roi+"   "+gstNo);

	}

}
