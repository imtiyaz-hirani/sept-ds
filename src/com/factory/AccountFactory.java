package com.factory;

public class AccountFactory {

	public static Account getAccount(AccountType accountType, String accountNumber ) {
		
		/* Depending on the AccountType factory needs to pass the object of 
		 * savings || business || dmat
		*/
		
		switch(accountType.toString()) {
			case "SAVINGS":
				return new SavingsAccount(accountNumber,
							AccountType.SAVINGS.getRateOfInterest(),
							AccountType.SAVINGS.getAccountCharges()); 
				 
			case "BUSINESS":
				return new BusinessAccount(accountNumber,
						AccountType.BUSINESS.getRateOfInterest(),
						AccountType.BUSINESS.getAccountCharges()); 
			
			case "DMAT":
				return new DMatAccount(accountNumber,
						AccountType.DMAT.getRateOfInterest(),
						AccountType.DMAT.getAccountCharges()); 
			
		}
		return null;
	}
}
