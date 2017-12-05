/**
 * NamesDescending.java - Sorts an array of names in descending order.
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab 10 - Selection Sort
 * @date 5 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
public class NamesDescending {
	/**
	 * Entry point to the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		// array of names
		String[] names = { "Bob", "Andrew", "Elon", "Zach", "Peter", "Charlie", "Tyler", "Parker", "Steven", "Rachel",
				"David", "John", "Billy", "Jacob", "Sharkeisha", "Deadpool", "Tony", "Stark", "Darth Maul", "Skywalker",
				"Batman", "Oliver", "Queen" };
		StopWatch timer = new StopWatch();
		timer.start(); // starts the timer
		nameSwap(names);
		timer.stop(); // stops the timer
		System.out.println("\nElapsed time: " + timer.getElapsedTime() + " milliseconds");
		// System.out.println(names);
	}

	/**
	 * Loops through the array of names trying to find the greatest
	 * lexicographal value and sorts the array in descending order
	 * 
	 * @param names1
	 *            array of names
	 */
	public static void nameSwap(String[] names1) {
		// String tempName = " ";
		// int nameVal = 0;
		String lowest = null;
		// int minPos = 0;
		boolean cont = true;
		/*
		 * while the cont is true, the loop will continue to run
		 */
		while (cont == true) {
			/*
			 * Loops through the array and finds the names that are
			 * lexicographically greater than the name at the ith position in
			 * the array. Then, stores the lowest variable in the lowest
			 * variable and swaps positions.
			 */
			for (int i = 0; i < names1.length - 1; i++) {
				for (int j = i + 1; j < names1.length; j++) {
					if (names1[i].compareToIgnoreCase(names1[j]) < 0) {
						lowest = names1[j];
						// minPos = j;
						names1[j] = names1[i];
						names1[i] = lowest;
					}
					/*
					 * if (lowest != null) {
					 * 
					 * tempName = names1[i]; System.out.println("tempName" +
					 * tempName); names1[i] = lowest;
					 * System.out.println("names[i]" + names1[i]);
					 * names1[minPos] = tempName; System.out.println("minPos" +
					 * names1[minPos]); }
					 */
				}
				cont = false;
			}

		}
		/*
		 * if cont equals false, the program loops through the array printing
		 * all of the names
		 */
		if (cont == false) {
			for (int a = 0; a < names1.length; a++) {
				System.out.println(names1[a]);
			}
		}

		/*
		 * String nameA = names1[i]; int nameVal = 0; while (nameVal < 1) { if
		 * (nameA.compareTo(names1[i + 1]) > 0) { nameVal = 1; } } }
		 */
		/*
		 * for (int j = 0; j < names1.length; j++) {
		 * System.out.println(names1[j]); }
		 */

	}
}
