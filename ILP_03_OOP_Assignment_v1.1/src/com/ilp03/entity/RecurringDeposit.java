package com.ilp03.entity;

public class RecurringDeposit extends Deposit implements FineRD {

	private double installmentAmount;
	private int frequencyOfPayment;

	public RecurringDeposit(int depositID, double rateOfInterest, int maturePeriodYears, double installmentAmount,
			int frequencyOfPayment) {
		super(depositID, rateOfInterest, maturePeriodYears);
		this.installmentAmount = installmentAmount;
		this.frequencyOfPayment = frequencyOfPayment;
	}

	public double getInstallmentAmount() {
		return installmentAmount;
	}

	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public int getFrequencyOfPayment() {
		return frequencyOfPayment;
	}

	public void setFrequencyOfPayment(int frequencyOfPayment) {
		this.frequencyOfPayment = frequencyOfPayment;
	}

	@Override
	public double calculateInterest(double principal, double rateOfInterest, int maturePeriod) {
		return 0.0;
		// TODO Auto-generated method stub

	}

	@Override
	public double calculateInterest(double installmentAmount, int frequencyOfPayment, double rateOfInterest,
			int maturePeriod) {

		int totalInstallments = frequencyOfPayment * maturePeriod;
		rateOfInterest = rateOfInterest / 100 / 4;
		double amount = installmentAmount * ((Math.pow(1 + rateOfInterest, totalInstallments) - 1) / rateOfInterest)
				* (1 + rateOfInterest);
		double interest = amount - (installmentAmount * totalInstallments);
		return interest;

	}

	@Override
	public void calculateAmount(double principal, double interest) {
		System.out.println("The amount is:"+(principal+interest));

	}

	@Override
	public double calculateRDFineAmount(double installmentAmount,int failedInstallments) {
		double fine=(installmentAmount/25)*failedInstallments;
		return fine;
		
	}

}
