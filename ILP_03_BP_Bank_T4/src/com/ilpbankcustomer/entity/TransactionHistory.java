package com.ilpbankcustomer.entity;

import java.util.Scanner;

public class TransactionHistory {

	// Fetching the overall transaction data
	public double[] fetchTransaction() {

		Scanner scanner = new Scanner(System.in);
		double fetchedtransactionLogs[] = new double[10];
		System.out.println("All transactions of user (fetched from database):");
		for (int index = 0; index < fetchedtransactionLogs.length; index++) {
			fetchedtransactionLogs[index] = scanner.nextDouble();
		}
		return fetchedtransactionLogs;
	}

	// Display the last 5 transactions
	public double printTransactionHistory(double transactionLogs[]) {
		System.out.println("The last 5 transactions are:");
		for (int index = transactionLogs.length - 1; index > transactionLogs.length - 6; index--) {
			System.out.println(transactionLogs[index]);
		}
		return 0;
	}

	// Calculate bank balance and, total withdrawal and deposits

	public double printBankBalance(double transactionLogs[]) {
		double bankBalance = 0.0;

		for (int index = 0; index < transactionLogs.length; index++) {
			bankBalance = bankBalance + transactionLogs[index];
		}
		System.out.println("Bank balance:" + bankBalance);
		if (bankBalance < 0) {
			System.out.println("Low balance..!!! Cannot do any debits right now.");
		}
		return 0;
	}

	public double totalWithdrawAndDeposit(double transactionLogs[]) {
		double totalWithdraw = 0.0;
		double totalDeposit = 0.0;

		for (int index = 0; index < transactionLogs.length; index++) {
			if (transactionLogs[index] < 0) {
				totalWithdraw = totalWithdraw + transactionLogs[index];
			}

			else {
				totalDeposit = totalDeposit + transactionLogs[index];
			}
		}
		System.out.println("Total Deposited:" + totalDeposit);
		System.out.println("Total Withdrawn:" + totalWithdraw);
		return 0;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double transactionLogs[] = new double[10];

		TransactionHistory transactionHistory = new TransactionHistory();
		transactionLogs = transactionHistory.fetchTransaction();

		System.out.println("***********BANK TRANSACTION HISTORY**********");
		System.out.println(
				"1.Find Bank Balance  2.List five recent transactions  3.Total amount incurred in withdraw and deposit");
		System.out.println("Choose an option:");
		// Ask the choice of the user
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			transactionHistory.printBankBalance(transactionLogs);
			break;
		case 2:
			transactionHistory.printTransactionHistory(transactionLogs);
			break;
		case 3:
			transactionHistory.totalWithdrawAndDeposit(transactionLogs);
			System.exit(0);
		default:
			System.out.println("Invalid key");

		}
	}

}
