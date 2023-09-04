package com.singleton;

public class App {
	public static void main(String[] args) {
		String input = "1, harry potter, london, AEGHJ6879M, 9700897089";
		
		//convert this input into a customer object and give to service. 
		//CSVConvertorUtility utility = new CSVConvertorUtility(); -- this cannot be done
		
		Thread t1 = new Thread("MyThread-1") {
			public void run() {
				System.out.println("Run by: " + Thread.currentThread().getName());
				System.out.println(CSVConvertorUtility.getInstance());
				Customer customer = CSVConvertorUtility.getInstance().convertCsvTextToCustomerObject(input); 
				System.out.println(customer);
				
			}
		};
		t1.start();
		
		Thread t2 = new Thread("MyThread-2") {
			public void run() {
				System.out.println("Run by: " + Thread.currentThread().getName());
				System.out.println(CSVConvertorUtility.getInstance());
				Customer customer = CSVConvertorUtility.getInstance().convertCsvTextToCustomerObject(input); 
				System.out.println(customer);
				
			}
		};
		t2.start();
		//https://github.com/imtiyaz-hirani/sept-ds
		 
		/* System.out.println(Thread.currentThread().getName());
		 * Java always starts a default thread called as main thread. 
		 * what ever tasks are performed in the program, they are done in sequence by main.
		 */
	}
}
