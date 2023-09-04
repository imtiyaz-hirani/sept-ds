package com.factory;

public class BusinessAccount extends Account{

	private String accountNumber;
	private double rateOfInterest;
	private double annualCharges;
	
	
	public BusinessAccount(String accountNumber, double rateOfInterest, double annualCharges) {
		super();
		this.accountNumber = accountNumber;
		this.rateOfInterest = rateOfInterest;
		this.annualCharges = annualCharges;
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return rateOfInterest;
	}

	@Override
	public double getAnnualCharges() {
		// TODO Auto-generated method stub
		return annualCharges;
	}

	@Override
	public String toString() {
		return "BusinessAccount [accountNumber=" + accountNumber + ", rateOfInterest=" + rateOfInterest
				+ ", annualCharges=" + annualCharges + "]";
	}
	
	

	
}
