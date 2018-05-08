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
		int menuNum;
		int userInput;
		String cont = "y";
		System.out.println("Welcome to the Grand Circus Motors admin console!\n");

		// partOneCode(scan); user manually entering cars not used

		// Initializes ArrayList of cars
		ArrayList<Car> cars = partTwoCode();
		
		ArrayList<Car> order = new ArrayList<>();

		do {
			// Displays car menu
			menuNum = 1;
			for (int i = 0; i < cars.size(); i++) {
				System.out.println(menuNum + "." + cars.get(i));
				menuNum++;
			}
			System.out.println(menuNum + ". Quit.\n");

			userInput = Validator.getInt(scan, "Which car would you like? ", 1, menuNum);

			// int menuNum represents the last menu choice, which is Quit
			if (userInput < menuNum) {
				System.out.println(cars.get(userInput - 1));

				cont = Validator.getYesOrNo(scan, "Would you like to buy this car? ");

				if (cont.equalsIgnoreCase("y")) {
					
					System.out.println("Excellent! Our finance department will be in touch shortly.\n");

					order.add(cars.remove(userInput - 1));

				}

			}

		} while (userInput < menuNum);
		//
		// cont = Validator.getYesOrNo(scan, "Would you like to continue (y/n)? ");
		// }

		// // Outputs Car information with overridden toString()
		// System.out.println("Current Inventory:");
		// for (int j = 0; j < cars.length; j++) {
		// System.out.println(cars[j]);
		// }
		
		long total = 0;
		System.out.println("\nYou've ordered:%n");
		for (int i = 0; i < order.size(); i++) {
			System.out.println(order.get(i));
			total += (long) order.get(i).getPrice();
		}
		System.out.printf("%nTotal price: $%s%n", total);

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

		cars.add(new Car("Jeep", "Renegade", 2018, 27500.99));
		cars.add(new Car("DeLorean", "DMC-X", 2040, 250000.0));
		cars.add(new Car("Telsa", "Mars Rover", 2099, 15000000.0));
		cars.add(new UsedCar("Ford", "Focus", 2002, 2000.00, 158000.0));
		cars.add(new UsedCar("Subaru", "Forester", 2004, 4000.0, 121000.0));
		cars.add(new UsedCar("Chrysler", "PT-Cruiser", 2001, 12.0, 12558932.12));

		return cars;
	}

}
