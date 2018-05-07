package com.carpackage;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			
			
			cont = Validator.getYesOrNo(scan, "Would you like to continue (y/n)? ");
		}
		
		System.out.println("\nThank you!\nGoodbye! :)");
		
		scan.close();
	}

}
