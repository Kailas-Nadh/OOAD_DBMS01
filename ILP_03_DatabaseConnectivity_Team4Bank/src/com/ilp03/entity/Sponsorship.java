package com.ilp03.entity;

public class Sponsorship {
	
	private int sponsorshipID;
	private String sponsorshipType;
	private int sponsorshipAmount;
	
	public Sponsorship(int sponsorshipID, String sponsorshipType, int sponsorshipAmount) {
		this.sponsorshipID = sponsorshipID;
		this.sponsorshipType = sponsorshipType;
		this.sponsorshipAmount = sponsorshipAmount;
	}

	public int getSponsorshipID() {
		return sponsorshipID;
	}

	public void setSponsorshipID(int sponsorshipID) {
		this.sponsorshipID = sponsorshipID;
	}

	public String getSponsorshipType() {
		return sponsorshipType;
	}

	public void setSponsorshipType(String sponsorshipType) {
		this.sponsorshipType = sponsorshipType;
	}

	public int getSponsorshipAmount() {
		return sponsorshipAmount;
	}

	public void setSponsorshipAmount(int sponsorshipAmount) {
		this.sponsorshipAmount = sponsorshipAmount;
	}
	
	
	
	
	

}
