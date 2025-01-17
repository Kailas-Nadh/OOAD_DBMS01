package com.ilp03.entity;

public class FixedDeposit extends Deposit{
	
	private double principalAmount;

	public FixedDeposit(int depositID, double rateOfInterest, int maturePeriodYears,
			double principalAmount) {
		super(depositID, rateOfInterest, maturePeriodYears);
		this.principalAmount = principalAmount;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}



	public void PrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}



	@Override
	public double calculateInterest(double principal, double rateOfInterest, int maturePeriod) {
		double interest = (principal*rateOfInterest*maturePeriod)/100;
		return interest;

	}

	@Override
	public double calculateInterest(double installmentAmount, int frequencyOfPayment, double rateOfInterest,
			int maturePeriod) {
				return 0.0;
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateAmount(double principal, double interest) {
		System.out.println("The amount is:"+(principal+interest));
	}

}
