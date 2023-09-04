package com.factory;

public class Controller {
	public static void main(String[] args) {
		 Account account = AccountFactory.getAccount(AccountType.SAVINGS,"ACCT586768" );
		 System.out.println(account);
		 
		 Account account1 = AccountFactory.getAccount(AccountType.BUSINESS,"ACCT586768" );
		 System.out.println(account1);
		 
		 Account account2 = AccountFactory.getAccount(AccountType.DMAT,"ACCT586768" );
		 System.out.println(account2);

	}

}

/* 
 * Factory Method uses Layer of Abstraction and hides class structures from Controller. 
 * ADV 1: Controller remains clean 
 * ADV2: Class structure underneath the factory can be scalable. 	 
 * */
