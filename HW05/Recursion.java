
/**
 * Recursion.java - This program provides a menu for the user to select which recursive method they would like to run. Then, it executes whatever the user's choice was. 
 *
 *
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @Homework HW 05 - Recursion
 * @date 4 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
import java.util.Scanner;

public class Recursion {
	/**
	 * Entry point to program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // user input
		// menu
		System.out.println(
				"Please choose which recursive method you would like to execute: \n countBinary \n printSquares \n isBackwards");
		String answer = input.nextLine();

		/*
		 * if the user answers countBinary, it executes that method if the user
		 * answers printSquares, it executes that method if the user answers
		 * isBackwards, it executes that method
		 */
		if (answer.equals("countBinary")) {
			System.out.println("What is the length of the binary string you wish to use?");
			// String answer = input.nextInt();
			input.nextLine();
			// countBinary(number);
		} else if (answer.equals("printSquares")) {

		} else if (answer.equals("isBackwards")) {

		} else {
			System.out.println("Invalid input. Please try again.");
		}

	}

	/**
	 * This method has one integer parameter n and returns the number of binary
	 * strings of length n that do not have two consecutive 0's.
	 * 
	 * @param n
	 *            integer
	 * @return the number of binary strings of length n
	 */
	public static int countBinary(int n) {
		int max = n;

		for (int i = 0; i < n; i++) {

		}

		return 0;
	}

	/**
	 * Write a method printSquares that has an integer parameter n, and prints
	 * the squares of the integers from 1 to n, separated by commas. It should
	 * print the squares of the odd integers in descending order first and then
	 * following with the squares of the even integers in ascending order. It
	 * does not print a newline character. It should throw an
	 * IllegalArgumntException if the specified integer is less than 1.
	 * 
	 * @param n
	 *            integer
	 * @throws IllegalArgumentException
	 *             if the specified integer is less than 1
	 */
	public static void printSquares(int n) throws IllegalArgumentException {

	}

	/**
	 * Write a method isBackwards that has two String parameters and returns
	 * true i the two strings have the same sequence of characters but in the
	 * opposite order (ignoring white space and capitalization), and returns
	 * false otherwise. The method should throw an IllegalArgumentException if
	 * either string is null.
	 * 
	 * @param a
	 *            string value
	 * @param b
	 *            string value
	 * @return true if the two strings have the same sequence of characters
	 * @throws IllegalArgumentException
	 *             if either string is null
	 */
	public static String isBackwards(String a, String b) throws IllegalArgumentException {

		return " ";
	}

}
