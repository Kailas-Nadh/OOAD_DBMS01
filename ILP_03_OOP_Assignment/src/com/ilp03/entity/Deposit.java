package com.ilp03.entity;

public abstract class Deposit {
	
	private int depositID;
	private double rateOfInterest;
	private int maturePeriodYears;
	private int totalAmount;
	
	public abstract double calculateInterest(double principal,double rateOfInterest,int maturePeriod);
	public abstract double calculateInterest(double installmentAmount,int frequencyOfPayment,double rateOfInterest,int maturePeriod);
	
	public Deposit(int depositID, double rateOfInterest, int maturePeriodYears) {
		this.depositID = depositID;
		this.rateOfInterest = rateOfInterest;
		this.maturePeriodYears = maturePeriodYears;
	}
	
	public int getDepositID() {
		return depositID;
	}
	
	public void setDepositID(int depositID) {
		this.depositID = depositID;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	public int getMaturePeriodYears() {
		return maturePeriodYears;
	}
	
	public void setMaturePeriodYears(int maturePeriodYears) {
		this.maturePeriodYears = maturePeriodYears;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
	

}
