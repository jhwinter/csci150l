
/**
 * Shopping.java - This program tests the other class files
 *
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework 06 - GroceryQueue
 * @date 25 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {

		GroceryQueue queue = new GroceryQueue();
		Scanner input = new Scanner(System.in);
		String userAnswer = "no answer yet";
		while (!userAnswer.equalsIgnoreCase("e")) {
			printMenu();
			System.out.print("\nPlease enter your selection: ");
			userAnswer = input.nextLine().toLowerCase();

			switch (userAnswer) {
			case "a":
				add(queue, input);
				input.nextLine();
				break;
			case "b":
				clearAll(queue);
				// input.nextLine();
				break;
			case "c":
				checkOut(queue);
				// input.nextLine();
				break;
			case "d":
				displayAll(queue);
				// input.nextLine();
				break;
			case "e":// after it displays total number of items, program just
						// hangs there
				// FIX THIS
				displayTotalNumber(queue);
				// input.nextLine();
				break;
			case "f":
				exit(queue, input);
				input.nextLine();
				break;
			default:
				System.out.println("Invalid input. Please try again.");
			}

			/*
			 * if (userAnswer.equalsIgnoreCase("a")) { add(); }
			 */

		}
		input.close();
	}

	/**
	 * Displays options for the user to add an item, clear all, check out,
	 * display all items, display the total number of items in the queue, and
	 * check out.
	 */
	public static void printMenu() {
		String menu = "Menu: \n a) Add a Grocery Item \n b) Clear All \n c) Check Out \n d) Display All Items \n e) Display Total Number of Items \n f) Exit";
		System.out.println(menu);
	}

	/**
	 * Prompts the user for both the name of the grocery item and the price, and
	 * then you will construct a GroceryItem object with those values. Next, you
	 * will have to create a GroceryNode object that contains your newly created
	 * GroceryItem. After that, it will be time to add the new GroceryNode to
	 * your GroceryQueue. (note: you should scan the queue to see if an item
	 * with the specified name and price is already present, if so, just
	 * increment the quantity)
	 * 
	 * @param queue1
	 *            GroceryQueue that holds the list of items
	 * @param input1
	 *            Scanner object that reads in user input
	 */
	public static void add(GroceryQueue queue1, Scanner input1) {
		String itemName = "no name yet";
		double itemPrice = 0.0;
		System.out.print("\nItem Name: ");
		itemName = input1.nextLine();
		if (!itemName.isEmpty()) {
			System.out.print("\nItem Price: $");
			itemPrice = input1.nextDouble();

			GroceryItem item1 = new GroceryItem(itemName, itemPrice);
			GroceryNode node1 = new GroceryNode(item1);

			if (node1.findEqualItem(item1) == true) {
				item1.quantityPlusPlus();
				System.out.println("Quantity of " + item1.getItemName() + "increased.");
			} else {
				queue1.enqueue(item1);
				item1.quantityPlusPlus();
				System.out.println("Item added.");
			}
		}

	}

	/**
	 * Removes all of the items from the queue.
	 * 
	 * @param queue1
	 *            GroceryQueue object that holds a list of items
	 */
	public static void clearAll(GroceryQueue queue1) {
		queue1.clear();
		System.out.println("Queue cleared.");
	}

	/**
	 * Processes all of the items in the queue, printing each items info, price
	 * and quantity to the console, and printing the total price of all items
	 * that were in the queue (note: at the end of this operation, the queue
	 * should be empty without exiting the shopping program).
	 * 
	 * @param queue1
	 *            GroceryQueue object that holds a list of items
	 */
	public static void checkOut(GroceryQueue queue1) {
		if (!queue1.isEmpty()) {
			queue1.checkout();
			queue1.clear();
			System.out.println("Queue cleared.");
		}

	}

	/**
	 * Loops through the queue printing each item out to the console.
	 * 
	 * @param queue1
	 *            GroceryQueue object that holds a list of items
	 */
	public static void displayAll(GroceryQueue queue1) {
		queue1.showStructure();
	}

	/**
	 * Loops through the queue counting the number of items and then prints out
	 * that number to the console
	 * 
	 * @param queue1
	 *            GroceryQueue object that holds a list of items
	 */
	public static void displayTotalNumber(GroceryQueue queue1) {
		System.out.println("Total Number of Items: " + queue1.getTotalItems());
		return;
	}

	/**
	 * Prints a message indicating the total number of items that are currently
	 * in the queue, ask the user if they are sure they wish to exit the program
	 * – yes returns to the main menu, while no exists the program gracefully.
	 * 
	 * @param queue1
	 *            GroceryQueue object that holds a list of items
	 * @param input1
	 *            Scanner object that prompts the user for input
	 * 
	 */
	public static void exit(GroceryQueue queue1, Scanner input1) {
		String userAnswer = "no answer yet";
		System.out.println("Total Number of Items: " + queue1.getTotalItems());
		System.out.println("Are you certain that you would like to exit the program (Yes/No)?");
		userAnswer = input1.nextLine();
		if (!userAnswer.equalsIgnoreCase("yes")) {
			System.out.println("Thank you for using this program and have a wonderful day!");
			System.exit(1);
		} else {
			return;
		}
	}

}
