package com.carpackage;

import java.util.Scanner;

public class Validator {
	
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min || i > max)
				System.out.print("\nThat number is out of bounds. Please try again. ");
			else
				isValid = true;
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.print("\nError! Invalid integer value. Try again. ");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
	
	public static String getYesOrNo(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.printf(prompt);
			s = sc.next(); // read user entry
			if (s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")) {
				return "y";
			} else if (s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n")) {
				return "n";
			} else {
				System.out.print("\nInput not recognized. ");
				prompt = "(enter \"y\" or \"n\"): ";
			}
			
		}
		return s;
		
	}
	
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}
	
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}
}
