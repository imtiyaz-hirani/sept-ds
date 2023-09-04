package com.singleton;

public class CSVConvertorUtility {  //singleton class
	/* 
	 * Make this class as Singleton so that 
	 * no one should be able to create a second object of this class. 
	 * Through out the app only one OBJECT will be used. 
	 */
	static CSVConvertorUtility utility;
	
	static {
		synchronized ("") {
			if(utility == null) {
				utility = new CSVConvertorUtility(); 
			}
		}
	} 
	private CSVConvertorUtility(){ //Only I, in this class, will be creating the object.
	}
	
	public static CSVConvertorUtility getInstance(){ //Thread Safe
		
		return utility;   
	}
	
	public Customer convertCsvTextToCustomerObject(String input) {
		String[] sarry = input.split(",");
		Customer c = new Customer();
		c.setId(Integer.parseInt(sarry[0]));
		c.setName(sarry[1].trim());
		c.setCity(sarry[2]);
		c.setPan(sarry[3]);
		c.setContact(sarry[4]);
		return c;
	}
	
	public static String convertCsvTextToNameValue(String input){
		
		return null; 
	}

}
