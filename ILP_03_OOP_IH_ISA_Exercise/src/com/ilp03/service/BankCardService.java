package com.ilp03.service;

import java.util.Scanner;

import com.ilp03.entity.BankCard;
import com.ilp03.entity.CreditCard;
import com.ilp03.entity.DebitCard;

public class BankCardService {

	public static BankCard issueCard() {
		BankCard bankCard = new BankCard();
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("------------Enter Card Details-------------");
		System.out.println("Card Number: ");
		long cardNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Account Holder: ");
		String accountHolderName = scanner.nextLine();
		System.out.println("Account Number: ");
		String accountNumber = scanner.nextLine();
		System.out.println("Issue Date: ");
		String issueDate = scanner.nextLine();
		System.out.println("Expiry Date: ");
		String expiryDate = scanner.nextLine();
		System.out.println("Credit Card Limit:");
		double cardLimit = scanner.nextDouble();
		bankCard.setCardNumber(cardNumber);
		bankCard.setAccountHolderName(accountHolderName);
		bankCard.setAccountNumber(accountNumber);
		bankCard.setIssueDate(issueDate);
		bankCard.setExpiryDate(expiryDate);*/
		return bankCard;
	}

	public static CreditCard issueCreditCard() {
		CreditCard creditCard = new CreditCard();
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------Enter Card Details-------------");
		System.out.println("Card Number: ");
		long cardNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Account Holder: ");
		String accountHolderName = scanner.nextLine();
		System.out.println("Account Number: ");
		String accountNumber = scanner.nextLine();
		System.out.println("Issue Date: ");
		String issueDate = scanner.nextLine();
		System.out.println("Expiry Date: ");
		String expiryDate = scanner.nextLine();
		System.out.println("Credit Card Limit:");
		double cardLimit = scanner.nextDouble();
		creditCard.setCardNumber(cardNumber);
		creditCard.setAccountHolderName(accountHolderName);
		creditCard.setAccountNumber(accountNumber);
		creditCard.setIssueDate(issueDate);
		creditCard.setExpiryDate(expiryDate);
		creditCard.setCardLimit(cardLimit);
		return creditCard;
	}

	public static DebitCard issueDebitCard() {
		DebitCard debitCard = new DebitCard();
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------Enter Card Details-------------");
		System.out.println("Card Number: ");
		long cardNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Account Holder: ");
		String accountHolderName = scanner.nextLine();
		System.out.println("Account Number: ");
		String accountNumber = scanner.nextLine();
		System.out.println("Issue Date: ");
		String issueDate = scanner.nextLine();
		System.out.println("Expiry Date: ");
		String expiryDate = scanner.nextLine();
		System.out.println("Account Balance:");
		double accountBalance = scanner.nextDouble();
		debitCard.setCardNumber(cardNumber);
		debitCard.setAccountHolderName(accountHolderName);
		debitCard.setAccountNumber(accountNumber);
		debitCard.setIssueDate(issueDate);
		debitCard.setExpiryDate(expiryDate);
		debitCard.setAccountBalance(accountBalance);
		return debitCard;
	}

	public static void displayCard(BankCard bankCard) {

		CreditCard creditCard = null;
		DebitCard debitCard = null;
		double cardLimit = 0.0;
		double accountBalance = 0.0;

		if (bankCard instanceof CreditCard) {
			creditCard = (CreditCard) bankCard;
			cardLimit = creditCard.getCardLimit();
			System.out.println("Card Number:" + "         " + "Account Holder:" + "         " + "Account Number:"
					+ "         " + "Issue Date: " + "          " + "Expiry Date:" + "        " + "Credit Card Limit:");
			System.out.println(bankCard.getCardNumber() + "                   " + bankCard.getAccountHolderName()
					+ "                " + bankCard.getAccountNumber() + "                  " + bankCard.getIssueDate()
					+ "                  " + bankCard.getExpiryDate() + "          " + cardLimit);

		}

		if (bankCard instanceof DebitCard) {
			debitCard = (DebitCard) bankCard;
			accountBalance = debitCard.getAccountBalance();
			System.out.println("Card Number:" + "         " + "Account Holder:" + "         " + "Account Number:"
					+ "         " + "Issue Date: " + "          " + "Expiry Date:" + "        " + "Credit Card Limit:");
			System.out.println(bankCard.getCardNumber() + "                   " + bankCard.getAccountHolderName()
					+ "                " + bankCard.getAccountNumber() + "                  " + bankCard.getIssueDate()
					+ "                   " + bankCard.getExpiryDate() + "          " + accountBalance);
		}
	}
}
