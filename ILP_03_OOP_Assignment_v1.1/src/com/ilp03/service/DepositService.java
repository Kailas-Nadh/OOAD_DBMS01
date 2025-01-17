package com.ilp03.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Deposit;
import com.ilp03.entity.FixedDeposit;
import com.ilp03.entity.RecurringDeposit;

public class DepositService {

	public static Deposit createDeposit(int choice) {

		Deposit deposit = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Deposit ID:");
		int depositID = scanner.nextInt();
		System.out.println("Enter Rate of Interest:");
		double rateOfInterest = scanner.nextDouble();
		System.out.println("Enter Mature Period:");
		int maturePeriodYears = scanner.nextInt();

		if (choice == 1) {
			System.out.println("Enter Principal Amount:");
			double principal = scanner.nextDouble();
			deposit = new FixedDeposit(depositID, rateOfInterest, maturePeriodYears, principal);
			// deposit.withdraw();
			// deposit.deposit();

		} else if (choice == 2) {
			System.out.println("Enter installment amount:");
			double installmentAmount = scanner.nextDouble();
			System.out.println("Enter number of payments to be done in a year:");
			int frequencyOfPayment = scanner.nextInt();
			deposit = new RecurringDeposit(depositID, rateOfInterest, maturePeriodYears, installmentAmount,
					frequencyOfPayment);
		}

		return deposit;
	}

	public static void displayAllDeposit(ArrayList<Deposit> depositList) {

		for (Deposit deposit : depositList) {
			if (deposit instanceof FixedDeposit) {
				FixedDeposit fixedDeposit = (FixedDeposit) deposit;
				System.out.println("Deposit Type:" + "\t" + "Deposit ID:" + "\t" + "Principal Amount" + "\t"
						+ "Rate of Interest:" + "\t" + "Mature Period:");
				System.out.println(
						"Fixed Deposit" + "\t\t" + deposit.getDepositID() + "\t\t" + fixedDeposit.getPrincipalAmount()
								+ "\t\t" + deposit.getRateOfInterest() + "\t\t" + deposit.getMaturePeriodYears());
				System.out.println("");
			} else if (deposit instanceof RecurringDeposit) {
				RecurringDeposit recurringDeposit = (RecurringDeposit) deposit;
				System.out.println("Deposit Type:" + "\t" + "Deposit ID:" + "\t" + "Installment Amount" + "\t"
						+ "Rate of Interest:" + "\t" + "Mature Period:" + "\t" + "Frequency of Payment:");
				System.out.println("Recurring Deposit" + "\t\t" + deposit.getDepositID() + "\t\t"
						+ recurringDeposit.getInstallmentAmount() + "\t\t" + deposit.getRateOfInterest() + "\t\t"
						+ deposit.getMaturePeriodYears() + "\t\t" + recurringDeposit.getFrequencyOfPayment()
						+ " months annually");
				System.out.println("");
			}

		}
	}

	public static Deposit searchDeposit(ArrayList<Deposit> depositList) {
		Deposit searchDeposit = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your deposit ID:");
		int depositID = scanner.nextInt();
		for (Deposit deposit : depositList) {
			if (depositID == deposit.getDepositID()) {
				searchDeposit = deposit;
			}
		}
		return searchDeposit;
	}

	public static double interestCalculation(Deposit deposit) {
		Scanner scanner = new Scanner(System.in);
		int maturePeriod = deposit.getMaturePeriodYears();
		double rateOfInterest = deposit.getRateOfInterest();
		double interest = 0.0;
		if (deposit instanceof FixedDeposit) {
			FixedDeposit fixedDeposit = (FixedDeposit) deposit;
			double principal = fixedDeposit.getPrincipalAmount();
			interest = deposit.calculateInterest(principal, rateOfInterest, maturePeriod);
			System.out.println(
					"The interest amount is:" + deposit.calculateInterest(principal, rateOfInterest, maturePeriod));
		}
		if (deposit instanceof RecurringDeposit) {
			RecurringDeposit recurringDeposit = (RecurringDeposit) deposit;
			double installmentAmount = recurringDeposit.getInstallmentAmount();
			int frequencyOfPayment = recurringDeposit.getFrequencyOfPayment();
			interest = deposit.calculateInterest(installmentAmount, frequencyOfPayment, rateOfInterest, maturePeriod);
			System.out.println("The interest amount is:"
					+ deposit.calculateInterest(installmentAmount, frequencyOfPayment, rateOfInterest, maturePeriod));
		}

		return interest;

		// double amount = scanner.nextDouble();
		// account.setAccountBalance(account.getAccountBalance()-amount);
	}

	public static void amountCalculation(Deposit deposit) {
		int maturePeriod = deposit.getMaturePeriodYears();
		double rateOfInterest = deposit.getRateOfInterest();
		if (deposit instanceof FixedDeposit) {
			FixedDeposit fixedDeposit = (FixedDeposit) deposit;
			double principal = fixedDeposit.getPrincipalAmount();
			double interest = deposit.calculateInterest(principal, rateOfInterest, maturePeriod);
			fixedDeposit.calculateAmount(principal, interest);
		}
		if (deposit instanceof RecurringDeposit) {
			RecurringDeposit recurringDeposit = (RecurringDeposit) deposit;
			double installmentAmount = recurringDeposit.getInstallmentAmount();
			int frequencyOfPayment = recurringDeposit.getFrequencyOfPayment();
			double principal = installmentAmount*(frequencyOfPayment*maturePeriod);
			double interest = deposit.calculateInterest(installmentAmount, frequencyOfPayment, rateOfInterest, maturePeriod);
			recurringDeposit.calculateAmount(principal,interest);
		}

		
	}
	
	public static void fineCalculation(Deposit deposit) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of failed installments:");
		int failedInstallments = scanner.nextInt();
		if (deposit instanceof FixedDeposit) {
			System.out.println("It is a fixed deposit...");
		}
		if (deposit instanceof RecurringDeposit) {
			RecurringDeposit recurringDeposit = (RecurringDeposit) deposit;
			double installmentAmount = recurringDeposit.getInstallmentAmount();
			double fine = recurringDeposit.calculateRDFineAmount(installmentAmount,failedInstallments);
			System.out.println("The fine amount is: INR "+fine);
			}

		
	}


}
