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

			System.out.println(
					"1.Fixed Deposit  2.Recurring Deposit  3.Display  4.Calculate interest  5.Calculate Amount");
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

			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');
		
		System.out.println("----------Thank you for banking with us----------");

	}

}
