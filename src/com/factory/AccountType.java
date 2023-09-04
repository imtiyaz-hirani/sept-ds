package com.factory;

public enum AccountType {
	SAVINGS(4.0, 1500), BUSINESS(0.0, 5000), DMAT(0.0, 10000);

	AccountType(double rateOfInterest, double accountCharges) {
		this.rateOfInterest = rateOfInterest;
		this.accountCharges = accountCharges;
	}

	private double rateOfInterest;
	private double accountCharges;

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public double getAccountCharges() {
		return accountCharges;
	}

}
