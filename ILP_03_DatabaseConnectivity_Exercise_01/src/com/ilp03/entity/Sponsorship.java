package com.ilp03.entity;

public class Sponsorship {
	private int id;
	private String collegeName;
	private String collegePlace;
	private long phNumber;
	private int sponsorshipAmount;

	public Sponsorship(int id, String collegeName, String collegePlace, long phNumber, int sponsorshipAmount) {
		super();
		this.id = id;
		this.collegeName = collegeName;
		this.collegePlace = collegePlace;
		this.phNumber = phNumber;
		this.sponsorshipAmount = sponsorshipAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegePlace() {
		return collegePlace;
	}

	public void setCollegePlace(String collegePlace) {
		this.collegePlace = collegePlace;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}

	public int getSponsorshipAmount() {
		return sponsorshipAmount;
	}

	public void setSponsorshipAmount(int sponsorshipAmount) {
		this.sponsorshipAmount = sponsorshipAmount;
	}

}
