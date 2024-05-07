package com.ilpbankadmin.entity;

public class HighestSponsorship {

	public static int highestSponsorshipAmount(double[] array) {

		double max = array[0];
		int position = 0;
		for (int index = 1; index < array.length; index++) {
			if (array[index] > max) {
				max = array[index];
				position = index;
			}
		}
		return position;
	}

	public static void main(String[] args) {
		double[] sponsorshipAmount = { 1000, 100000, 80000, 4000, 3000, 20050, 900, 180 };
		String[] collegeName = { "CET", "IIT", "IIM", "AIIMS", "NIT", "CEAL", "MEC", "VIT" };
		int position = highestSponsorshipAmount(sponsorshipAmount);
		System.out.println("College with the Highest Sponsorship Amount:" + collegeName[position] + " with INR "
				+ sponsorshipAmount[position]);
	}

}
