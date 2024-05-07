package com.ilp03.entity;

public class FixedDeposit {
	
	private String fixedDepositID;
	private String accountNumber;
	private double fixedDepositAmount;
	private double maturePeriod;
	private double interestRate;
	
	public String getFixedDepositID() {
		return fixedDepositID;
	}
	
	public void setFixedDepositID(String fixedDepositID) {
		this.fixedDepositID = fixedDepositID;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getFixedDepositAmount() {
		return fixedDepositAmount;
	}
	
	public void setFixedDepositAmount(double fixedDepositAmount) {
		this.fixedDepositAmount = fixedDepositAmount;
	}
	
	public double getMaturePeriod() {
		return maturePeriod;
	}
	
	public void setMaturePeriod(double maturePeriod) {
		this.maturePeriod = maturePeriod;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
