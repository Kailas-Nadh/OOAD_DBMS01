package com.ilpbankadmin.entity;

public class LowestSponsorship {

	public static int lowestSponsorshipAmount(double[] array) {

		double min = array[0];
		int position = 0;
		for (int index = 1; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
				position = index;
			}
		}
		return position;
	}

	public static void main(String[] args) {
		double[] sponsorshipAmount = { 18000, 100000, 80000, 4000, 3000, 20050, 9000, 1800 };
		String[] collegeName = { "CET", "IIT", "IIM", "AIIMS", "NIT", "CEAL", "MEC", "VIT" };
		int position = lowestSponsorshipAmount(sponsorshipAmount);
		System.out.println("College with the Lowest Sponsorship Amount:" + collegeName[position] + " with INR "
				+ sponsorshipAmount[position]);
	}

}
