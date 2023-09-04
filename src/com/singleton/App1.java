package com.singleton;

public class App1 {
	public static void main(String[] args) {
		//CSVConvertorUtility utility = new CSVConvertorUtility(); -- This cannot be done
		System.out.println(CSVConvertorUtility.getInstance());

		//CSVConvertorUtility.convertCsvTextToCustomerObject(input)
	}
}
