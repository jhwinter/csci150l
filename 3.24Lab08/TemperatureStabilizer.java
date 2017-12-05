
/**
 * TemperatureStabilizer.java - simulates the working of a Temperature Stabilizer in a critical, potentially hazardous thermo-sensitive environment.
 * This class file tests the Temperature, DangerouslyHighException, and DangerouslyLowException classes. 
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab08 - TemperatureStabilizer
 * @date 24 March 2016
 * @email jtwinters@g.coastal.edu
 */
import java.util.Scanner;

public class TemperatureStabilizer {

	/**
	 * Entry point to the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		/**
		 * user input
		 */
		Scanner input = new Scanner(System.in);
		/**
		 * Temperature object
		 */
		Temperature temp = new Temperature();
		/**
		 * variable that determines whether or not the loop will continue
		 */
		boolean cont = true;
		/**
		 * variable for the temperature
		 */
		int tempA = 0;

		System.out.println("Temperature Stabilizer ready to read temperature (normal 200-300k): ");
		/**
		 * while cont is true, the loop will continue to prompt the use for more
		 * input temperatures
		 */
		while (cont) {
			/**
			 * tries to read in the user input and catches the
			 * DangerouslyHighException and DangerouslyLowException
			 */
			try {
				System.out.println();
				System.out.print("Enter: ");
				/**
				 * user input is set to variable tempA
				 */
				tempA = input.nextInt();
				input.nextLine(); // get rid of the newline character
				temp.setTemp(tempA); // set the temperature in the temperature
										// class
				// temp.setHigh(tempA);
				// input.nextLine();
				/// temp.setLow(tempA);
				// input.nextLine();
				/*
				 * if the user input is greater than the MIN +10 and less than
				 * Max - 10, then print that the temperature is in an acceptable
				 * range
				 */
				if (tempA > Temperature.MIN + 10 && tempA < Temperature.MAX - 10) {
					System.out.println();
					System.out.println("Temperature is in acceptable range.");
				}
				/*
				 * catch the DangerouslyHighException and provide an error
				 * message, if the user inputted temperature is greater than the
				 * MAX, exit the program
				 */
			} catch (DangerouslyHighException dhe) {
				System.out.println();
				System.out.println(dhe.getMessage());
				if (tempA > Temperature.MAX) {
					cont = false;
				}
				/*
				 * catch the DangerouslyLowException and provide an error
				 * message, if the user inputted temperature is less than the
				 * MIN, exit the program
				 */
			} catch (DangerouslyLowException dle) {
				System.out.println();
				System.out.println(dle.getMessage());
				if (tempA < Temperature.MIN) {
					cont = false;
				}
			}
		}

		System.out.println();
		/*
		 * print the highest temperature that was entered
		 */
		System.out.println("Highest temperature recorded: " + temp.getHigh());
		System.out.println();
		/*
		 * print the lowest temperature that was entered
		 */
		System.out.println("Lowest temperature recorded: " + temp.getLow());
		input.close(); // close the scanner
		System.exit(1); // exit the program
	}

}
