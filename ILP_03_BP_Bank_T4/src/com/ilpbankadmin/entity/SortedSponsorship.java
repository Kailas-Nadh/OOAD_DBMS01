package com.ilpbankadmin.entity;

import java.util.Scanner;

public class SortedSponsorship {

	public static double[] inputValue() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of sponsorship amounts :");
		int noOfColleges = scanner.nextInt();
		double sponsorshipAmount[] = new double[noOfColleges];
		System.out.println("Enter the amounts of sponsorship :");
		int index = 0;
		while (index < noOfColleges) {

			sponsorshipAmount[index] = scanner.nextInt();
			index++;

		}
		return sponsorshipAmount;
	}

	public static double[] secondLowest(double sponsorshipAmount[]) {

		for (int i = 0; i < sponsorshipAmount.length; i++) {
			for (int j = 0; j < sponsorshipAmount.length - i - 1; j++) {
				if (sponsorshipAmount[j] < sponsorshipAmount[j + 1]) {
					double temp = sponsorshipAmount[j];
					sponsorshipAmount[j] = sponsorshipAmount[j + 1];
					sponsorshipAmount[j + 1] = temp;
				}
			}
		}
		return sponsorshipAmount;
	}

	public static void main(String[] args) {
		double sponsorshipAmount[] = SortedSponsorship.inputValue();
		double sortedSponsorship[] = SortedSponsorship.secondLowest(sponsorshipAmount);
		System.out.println("The Sorted List of Sponsorship Amounts: ");
		for (int index = 0; index < sponsorshipAmount.length; index++) {
			System.out.println(sponsorshipAmount[index]);
		}
	}

}
