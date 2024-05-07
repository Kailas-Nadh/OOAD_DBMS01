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
		Account accountList[] = new Account[5];
		int numberOfAccounts = 0;
		char createNewAccount = 's';

		do {
			System.out.println("1. Savings Account  2. Current Account 3. Display");
			System.out.println("Enter your choice:");
			int accountChoice = scanner.nextInt();
			switch (accountChoice) {
			case 1:
				accountList[numberOfAccounts] = AccountService.createSavingsAccount();
				// savingsAccount = AccountService.createSavingsAccount();
				numberOfAccounts++;
				// AccountService.displayAccount(savingsAccount);
				break;
			case 2:
				accountList[numberOfAccounts] = AccountService.createCurrentAccount();
				// currentAccount = AccountService.createCurrentAccount();
				numberOfAccounts++;
				// AccountService.displayAccount(currentAccount);
				break;
			case 3:
				for (int index = 0; index < numberOfAccounts; index++) {
					AccountService.displayAccount(accountList[index]);
				}
				break;
			default:
				System.out.println("Invalid Choice");

			}

			if (numberOfAccounts < 2) {
				createNewAccount = 'y';

			}

			else if (numberOfAccounts >= 2 && numberOfAccounts < 5) {
				System.out.println("Do you want to continue.? (Enter y/n):");
				createNewAccount = scanner.next().charAt(0);

			}

			else if (numberOfAccounts == 5) {
				System.out.println("Maximum number of accounts created..!!!");
				createNewAccount = 'n';
			}

		} while (createNewAccount == 'y');
		
		if(numberOfAccounts==5) {
			for (int index = 0; index < numberOfAccounts; index++) {
				AccountService.displayAccount(accountList[index]);
			}
		}
			

	}

}
