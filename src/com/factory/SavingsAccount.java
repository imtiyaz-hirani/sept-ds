package com.factory;

public class SavingsAccount extends Account{
	private String accountNumber;
	private double rateOfInterest;
	private double annualCharges;
	
	public SavingsAccount(String accountNumber, double rateOfInterest, double accountCharges) {
		this.accountNumber = accountNumber;
		this.rateOfInterest = rateOfInterest;
		this.annualCharges = accountCharges;
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return this.accountNumber;
	}

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return this.rateOfInterest;
	}

	@Override
	public double getAnnualCharges() {
		// TODO Auto-generated method stub
		return this.annualCharges;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", rateOfInterest=" + rateOfInterest
				+ ", annualCharges=" + annualCharges + "]";
	}

	
}
