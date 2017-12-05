
/**
 * CDLibrary.java - This program takes in user input for CD objects and uses the CDCatalog program to store them in an array
 * 
 * @author Jonathan Winters
 * @course CSCI 150
 * @lab 6 CDLibrary
 * @email jtwinters@g.coastal.edu
 * @date 18 February 2016
 *
 */

import java.util.Scanner;

public class CDLibrary {

	// global constants
	public static final int DEFAULT_SIZE = 25;
	public static final String ADD = "add";
	public static final String REMOVE = "remove";
	public static final String SHOW_ALL = "show all";
	public static final String ARTIST = "artist";

	/**
	 * Entry point to the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables
		CDCatalog myCatalog = new CDCatalog();
		CD CD1 = new CD();
		String artistA = "no artist yet";
		String titleA = "no title yet";
		String labelA = "no label yet";
		String choice = "no choice yet";
		int noneCount = 0;
		Scanner in = new Scanner(System.in);
		String catalogName = "no name yet";
		System.out.println("Welcome to the CD catalog. Please give a name for your catalog: ");
		System.out.println();
		if (in.hasNextLine()) {
			catalogName = in.nextLine();
			myCatalog.setCDCatalogName(catalogName);
		}

		// loop
		// while the user does not enter "quit", the program will continue to
		// run
		do {
			choice = printMenu(catalogName, in);
			/*
			 * if the user enters "add", they are then prompted for the
			 * information that they would like to add and then the CD is added
			 * to the array
			 */
			if (choice.equals(ADD)) {
				System.out.println("\nEnter information to add: ");
				System.out.print("\nArtist: ");
				if (in.hasNextLine()) {
					artistA = in.nextLine();
				}
				System.out.print("\nTitle: ");
				if (in.hasNextLine()) {
					titleA = in.nextLine();
				}
				System.out.print("\nLabel: ");
				if (in.hasNextLine()) {
					labelA = in.nextLine();
				}
				myCatalog.add(new CD(titleA, artistA, labelA));
				// System.out.println("\nAdded.");
			}
			/*
			 * if the user enters "remove", the if statement first checks to
			 * make sure that there are CD's in the catalog to remove, the user
			 * is then prompted for the information about the CD they would like
			 * to remove and then, if the CD is in the catalog, it is removed
			 * from the catalog.
			 */
			else if (choice.equals(REMOVE)) {
				noneCount = myCatalog.countNonCDs();
				if (noneCount == DEFAULT_SIZE) {
					System.out.println("\nThere's nothing to remove!");
				} else {
					// myCatalog.remove(CD1);
					System.out.println("\nEnter information to remove: ");
					System.out.print("\nArtist: ");
					if (in.hasNextLine()) {
						artistA = in.nextLine();
					}
					System.out.print("\nTitle: ");
					if (in.hasNextLine()) {
						titleA = in.nextLine();
					}
					System.out.print("\nLabel: ");
					if (in.hasNextLine()) {
						labelA = in.nextLine();
					}
					myCatalog.remove(new CD(titleA, artistA, labelA));
				}
				// myCatalog.remove(CD1);

			}
			/*
			 * if the user enters "show all", the if statement checks to make
			 * sure that there are CD's stored in the array before executing the
			 * printAll method
			 */
			else if (choice.equals(SHOW_ALL)) {
				noneCount = myCatalog.countNonCDs();
				if (noneCount == DEFAULT_SIZE) {
					System.out.println("\nThere's nothing in your catalog!");
				} else {
					myCatalog.printAll();
				}
			}
			/*
			 * if the user enters "artist", the if statement checks to make sure
			 * that there are CD's stored in the array before executing the
			 * printAllArtist method
			 */
			else if (choice.equals(ARTIST)) {
				noneCount = myCatalog.countNonCDs();
				if (noneCount == DEFAULT_SIZE) {
					System.out.println("\nThere's nothing from that artist in your catalog!");
				} else {
					System.out.print("\nArtist: ");
					if (in.hasNextLine()) {
						CD1.setArtist(in.nextLine());
					}
					myCatalog.printAllArtist(CD1);
				}
			}
		} while (!choice.equals("quit"));
		in.close();
		System.out.println("\nThanks for using the CD catalog!");

	}

	/**
	 * this method prints out the menu and reads in the user's selection
	 * 
	 * @param catalogName
	 *            the name of the catalog that the user entered in
	 * @param in
	 *            a scanner
	 * @return returns the user's selection
	 */
	public static String printMenu(String catalogName, Scanner in) {
		String menu = "\nSelect an option for " + catalogName + ": Type " + "\"add\" to add,"
				+ "\n \"remove\" to remove, " + "\n \"show all\" to display the contents of the CD catalog, \n"
				+ "\"artist\"" + " to show all CDs from a particular artist," + "or " + "\n \"quit\" to quit: ";
		System.out.print(menu);
		String selection = in.nextLine();
		return selection;
	}
}
