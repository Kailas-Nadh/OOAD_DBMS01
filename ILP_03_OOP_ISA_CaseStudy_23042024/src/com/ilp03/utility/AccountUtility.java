package com.ilp03.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Account;
import com.ilp03.service.AccountServices;

public class AccountUtility {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		char goToMainMenu = 'y';
		do {
			System.out.println("Welcome to ABC Bank\r\n" + "\r\n" + "***************************");
			System.out.println("1. Savings Account  2. Current Account");
			int firstChoice = scanner.nextInt();
			switch (firstChoice) {
			case 1:
				System.out.println("1. Salary Account  2. Rural Account");
				int secondChoice = scanner.nextInt();
				switch (secondChoice) {
				case 1:
					accountList.add(AccountServices.createAccount(secondChoice));
					AccountServices.displayAllAccount(accountList);
					break;
				case 2:
					accountList.add(AccountServices.createAccount(secondChoice));
					AccountServices.displayAllAccount(accountList);
					break;
				default:
					System.out.println("Invalid option..!");
					break;

				}
				break;

			case 2:
				System.out.println("Cannot create current account at the moment..!");
				break;

			default:
				System.out.println("Invalid option..!");
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');

		System.out.println("----------------Have a Nice Day --------------------");

	}

}
