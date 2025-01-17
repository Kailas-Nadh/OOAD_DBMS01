package com.ilp03.entity;

public class FixedDeposit extends Deposit {

	private double principalAmount;

	public FixedDeposit(int depositID, double rateOfInterest, int maturePeriodYears, double principalAmount) {
		super(depositID, rateOfInterest, maturePeriodYears);
		this.principalAmount = principalAmount;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	@Override
	public void calculateAmount(double principal, double interest) {
		System.out.println("The amount is:" + (principal + interest));
	}

}
