package com.theWorldOfLife.utils;

public class LifeProjectUtils {

	public static int validateEntryCount(String x) {
		int y = 0;

		if (x.equalsIgnoreCase("exit")) {
			System.out.println("Exiting The Life Project Database Entry System.");
			System.exit(0);

		} else {
			try {
				y = Integer.parseInt(x);

			} catch (NumberFormatException e) {
				System.out.println("I'm sorry that is not a number.");
				System.out.println("\nPlease enter a valid number of entries to add");
			}
		}

		return y;
	}
	
	public static String tOF(String x) {
		String y = null;
		
		if (x == "1"){
			y = "true";
			
		} else if (x == "2") {
			y = "false";
			
		} 
		
		return y;
		
	}
}
