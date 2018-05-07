package com.carpackage;

import java.util.ArrayList;

/*
 * Tim pieniazek, Julhasur chowdhury, Anthony reakoff
 * 05.07.2018
 * 
 */

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!\n");

		// partOneCode(scan);

		ArrayList<Car> cars = partTwoCode();
		
		
		
		for (int i = 1; i <= cars.size(); i++) {
			System.out.println(i + "." + cars.get(i - 1));
		}
		
		
//		// Outputs Car information with overridden toString()
//		System.out.println("Current Inventory:");
//		for (int j = 0; j < cars.length; j++) {
//			System.out.println(cars[j]);
//		}

		// String cont = "y";
		// while (cont.equalsIgnoreCase("y")) {
		//
		// cont = Validator.getYesOrNo(scan, "Would you like to continue (y/n)? ");
		// }

		System.out.println("\nThank you!\nGoodbye! :)");

		scan.close();
	}

	// User input code from part 1
	public static void partOneCode(Scanner scan) {
		int count;
		// Populates a null array of Car objects, asking the user how many elements to
		// create
		count = Validator.getInt(scan, "How many cars would you like to enter? ");
		Car[] cars = new Car[count];

		// Holder variables for user input
		String ma;
		String mo;
		int ye;
		double pr;

		// Takes in user input and creates the Car objects with parameters
		for (int i = 0; i < count; i++) {
			ma = Validator.getString(scan, "Enter Car #" + (i + 1) + " Make: ");
			// cars[i].setMake(ma);

			mo = Validator.getString(scan, "Enter Car #" + (i + 1) + " Model: ");
			// cars[i].setModel(mo);

			ye = Validator.getInt(scan, "Enter Car #" + (i + 1) + " Year: ");
			// cars[i].setYear(ye);

			pr = Validator.getDouble(scan, "Enter Car #" + (i + 1) + " Price: ");
			// cars[i].setPrice(pr);

			cars[i] = new Car(ma, mo, ye, pr);

			System.out.println();

		}
	}
	
	// Builds a ArrayList of new and used cars for part 2
	public static ArrayList<Car> partTwoCode() {
		ArrayList<Car> cars = new ArrayList<>();
		
		cars.add(new Car("a","1",0,0.0));
		cars.add(new Car("b","2",0,0.0));
		cars.add(new Car("c","3",0,0.0));
		cars.add(new UsedCar("d", "4", 0, 0.0, 0.0));
		cars.add(new UsedCar("e", "5", 0, 0.0, 0.0));
		cars.add(new UsedCar("f", "6", 0, 0.0, 0.0));
		
		return cars;
	}

}
