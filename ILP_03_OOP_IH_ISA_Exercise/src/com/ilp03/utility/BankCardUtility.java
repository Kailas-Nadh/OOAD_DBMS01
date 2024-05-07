package com.ilp03.utility;

import java.util.Scanner;
import com.ilp03.entity.CreditCard;
import com.ilp03.entity.DebitCard;
import com.ilp03.service.BankCardService;

public class BankCardUtility {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CreditCard creditCard = null;
		DebitCard debitCard = null;
		System.out.println("*****BANK CARDS*****");
		System.out.println("1. Issue Credit Card  2. Issue Debit Card");
		System.out.println("Choose your option: ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			creditCard = BankCardService.issueCreditCard();
			BankCardService.displayCard(creditCard);
			break;
		case 2:
			debitCard = BankCardService.issueDebitCard();
			BankCardService.displayCard(debitCard);
			break;
		default:
			System.out.println("Invalid option. Quitting...");
			break;
		}
	}
}
