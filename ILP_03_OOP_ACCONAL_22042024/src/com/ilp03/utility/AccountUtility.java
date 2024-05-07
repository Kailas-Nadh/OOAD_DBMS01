package com.ilp03.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Account;
import com.ilp03.service.AccountService;

public class AccountUtility {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		char goToMainMenu = 'y';
		int choice;
		do {

			System.out.println("1.Savings Account 2.Current Account 3.Display 4.Withdraw 5.Deposit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
			case 2:
				accountList.add(AccountService.createAccount(choice));
				break;
			case 3:
				AccountService.displayAllAccount(accountList);
				break;
			case 4:
			case 5:
			default: 
				System.out.println("Invalid key..!!!");
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');

	}

}
