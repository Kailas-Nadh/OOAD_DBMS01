package com.ilp03.entity;

public class Events {
	
	private int eventID;
	private String eventName;
	private Branch branch;
	private Sponsorship sponsorship;
	
	public Events(int eventID, String eventName, Branch branch, Sponsorship sponsorship) {
		this.eventID = eventID;
		this.eventName = eventName;
		this.branch = branch;
		this.sponsorship = sponsorship;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Sponsorship getSponsorship() {
		return sponsorship;
	}

	public void setSponsorship(Sponsorship sponsorship) {
		this.sponsorship = sponsorship;
	}
	
	
	

}
