package com.ilp03.entity;

public abstract class Deposit {

	private int depositID;
	private double rateOfInterest;
	private int maturePeriodYears;
	private int totalAmount;

	public abstract void calculateAmount(double principal, double interest);

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

	public double calculateInterest(double principal, double rateOfInterest, int maturePeriod) {
		double interest = (principal * rateOfInterest * maturePeriod) / 100;
		return interest;

	}

	public double calculateInterest(double installmentAmount, int frequencyOfPayment, double rateOfInterest,
			int maturePeriod) {

		int totalInstallments = frequencyOfPayment * maturePeriod;
		rateOfInterest = rateOfInterest / 100 / 4;
		double amount = installmentAmount * ((Math.pow(1 + rateOfInterest, totalInstallments) - 1) / rateOfInterest)
				* (1 + rateOfInterest);
		double interest = amount - (installmentAmount * totalInstallments);
		return interest;

	}
}
