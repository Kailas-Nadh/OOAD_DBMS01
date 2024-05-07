package com.ilpbankadmin.entity;

import java.util.Scanner;

public class FindSponsorshipValue {

	public static int searchValue(String collegeName[], String searchKey) {
		int flag = -1;
		for (int index = 0; index < collegeName.length; index++) {
			if (collegeName[index].equals(searchKey)) {
				flag = index;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] sponsorshipAmount = { 1000, 100000, 80000, 4000, 3000, 20050, 900, 180 };
		String[] collegeName = { "CET", "IIT", "IIM", "AIIMS", "NIT", "CEAL", "MEC", "VIT" };
		System.out.println("Enter the college name:");
		String searchKey = scanner.nextLine();
		int searchResult = FindSponsorshipValue.searchValue(collegeName, searchKey);
		if (searchResult > -1) {
			System.out.println("The sponsorship amount is INR " + sponsorshipAmount[searchResult]);

		} else {
			System.out.println("College not found");
		}
	}
}
