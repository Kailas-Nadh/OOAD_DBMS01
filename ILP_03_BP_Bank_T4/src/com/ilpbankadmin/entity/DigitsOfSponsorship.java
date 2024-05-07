package com.ilpbankadmin.entity;

import java.util.Scanner;

public class DigitsOfSponsorship {

	public static int numberOfDigits(double sponsorshipAmount) {
		int numberOfDigits = 0;
		while (sponsorshipAmount >= 1) {
			sponsorshipAmount = sponsorshipAmount / 10;
			numberOfDigits++;
		}

		return numberOfDigits;

	}

	public static void main(String[] args) {

		String sponsorshipCollegeList[] = new String [5];
		double sponsorshipAmountList[] = new double[5];
		double numberofDigitsList[] = new double[5];
		int countFrequency = 0;
		//String sponsorshipCollegeList[] = {"CET","IIT","NIT","CEAL","IIM"};
		//double sponsorshipAmountList [] = {100000.0,200000.0,2000.0,100.0,1200.0};
		Scanner scanner = new Scanner(System.in);
		//scanner.nextLine();
		for (int index = 0; index < 5; index++) {
			System.out.println("Enter the College Name:");
			sponsorshipCollegeList[index] = scanner.nextLine();
			System.out.println("Enter the sponsorship Amounts:");
			sponsorshipAmountList[index] = scanner.nextDouble();
			scanner.nextLine();
			}
		
		for (int index = 0; index < 5; index++) {
			numberofDigitsList[index] = DigitsOfSponsorship.numberOfDigits(sponsorshipAmountList[index]);
		}
		for (int index = 0; index < 5; index++) {
			if (numberofDigitsList[index] == 6) {
				System.out.println("College Name: "+sponsorshipCollegeList[index]+" Sponsorship amount: "+sponsorshipAmountList[index]);
				countFrequency++;
			}
		}
		System.out.println("Number of 6-digit sponsorships:" + countFrequency);
	}
}
