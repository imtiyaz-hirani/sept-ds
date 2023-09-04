package com.factory;

public abstract class Account {
	private String accountNumber;
	private double rateOfInterest;
	private double annualCharges;

	public abstract String getAccountNumber();

	public abstract double getRateOfInterest();

	public abstract double getAnnualCharges();

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public void setAnnualCharges(double annualCharges) {
		this.annualCharges = annualCharges;
	}

}
