package com.ilp03.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Deposit;
import com.ilp03.service.DepositService;

public class DepositUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Deposit> depositList = new ArrayList<Deposit>();
		char goToMainMenu = 'y';
		int choice;
		do {

			System.out.println("*****TEAM 4 BANK*****");
			System.out.println("");
			System.out.println(
					"1.Fixed Deposit\n2.Recurring Deposit\n3.Display\n4.Calculate interest\n5.Calculate Amount\n6.Calculate RD fine\n");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
			case 2:
				depositList.add(DepositService.createDeposit(choice));
				break;
			case 3:
				DepositService.displayAllDeposit(depositList);
				break;
			case 4:
				Deposit deposit = DepositService.searchDeposit(depositList);
				DepositService.interestCalculation(deposit);
				break;
			case 5:
				deposit = DepositService.searchDeposit(depositList);
				DepositService.amountCalculation(deposit);
				break;
			case 6:
				deposit = DepositService.searchDeposit(depositList);
				DepositService.fineCalculation(deposit);
				break;
			default:
				System.out.println("Invalid key..!!!");

			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');

		System.out.println("----------Thank you for banking with us----------");

	}

}
