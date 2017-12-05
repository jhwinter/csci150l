
/**
 * Building.java - 
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Test2 - Building
 * @date 21 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
import java.util.Scanner;

public class BuildingManager {

	public static void main(String[] args) {

		BuildingDatabase database = new BuildingDatabase();
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		System.out.println("Welcome to the Building Manager. \n");
		System.out.print("Please enter your name: ");
		String name = input.nextLine();

		while (exit != true) {
			System.out.print("\n***************************************\n");
			System.out.println("\nEnter \"Add\" to add a Building");
			System.out.println("Enter \"Remove\" to remove a Building");
			System.out.println("Enter \"Show All\" to show all Buildings");
			System.out.println("Enter \"Find\" to search for a Building");
			System.out.println("Enter \"Most\" to display the name of the Building with the most floors");
			System.out.println("Enter \"Quit\" to exit the program");
			System.out.print("\n***************************************\n");

			System.out.println(name + ", please enter your selection here: ");
			String selection = input.nextLine();
			if (selection.equalsIgnoreCase("Quit")) {
				exit = true;
			} else if (selection.equalsIgnoreCase("Add")) {
				System.out.print("Type of Building (Hotel/Warehouse)? ");
				String buildingType = input.nextLine();
				if (buildingType.equalsIgnoreCase("Hotel")) {
					System.out.print("Enter the Hotel's name: ");
					String hotelName = input.nextLine();
					System.out.print("Enter Hotel's city: ");
					String hotelCity = input.nextLine();
					System.out.print("Enter the " + hotelName + " number of floors: ");
					int numberOfFloors = input.nextInt();
					input.nextLine();
					System.out.print("Enter the " + hotelName + " number of suites: ");
					int numberOfSuites = input.nextInt();
					input.nextLine();
					Hotel hotel1 = new Hotel(hotelName, hotelCity, numberOfFloors, numberOfSuites);
					database.addBuilding(hotel1);
					System.out.println("Added " + hotelName + "...");
				} else if (buildingType.equalsIgnoreCase("Warehouse")) {
					System.out.print("Enter the Warehouse's name: ");
					String warehouseName = input.nextLine();
					System.out.print("Enter Warehouse's city: ");
					String warehouseCity = input.nextLine();
					System.out.print("Enter the " + warehouseName + " number of floors: ");
					int numberOfFloors = input.nextInt();
					input.nextLine();
					System.out.print("Enter the " + warehouseName + " square footage: ");
					int squareFootage = input.nextInt();
					input.nextLine();
					Warehouse warehouse1 = new Warehouse(warehouseName, warehouseCity, numberOfFloors, squareFootage);
					database.addBuilding(warehouse1);
					System.out.println("Added" + warehouseName + "...");
				} else {
					System.out.println("Invalid building type. Please try again.");
				}
			} else if (selection.equalsIgnoreCase("Remove")) {
				System.out.println("Type of Building (Hotel/Warehouse)? ");
				String buildingType = input.nextLine();
				if (buildingType.equalsIgnoreCase("Hotel")) {
					System.out.print("Enter the Hotel's name: ");
					String hotelName = input.nextLine();
					System.out.print("Enter Hotel's city: ");
					String hotelCity = input.nextLine();
					System.out.print("Enter the " + hotelName + " number of floors: ");
					int numberOfFloors = input.nextInt();
					input.nextLine();
					System.out.print("Enter the " + hotelName + " number of suites: ");
					int numberOfSuites = input.nextInt();
					input.nextLine();
					Hotel hotel1 = new Hotel(hotelName, hotelCity, numberOfFloors, numberOfSuites);
					try {
						// database.removeBuilding(hotel1);
						System.out.println("Removed " + database.removeBuilding(hotel1).getName() + "...");
					} catch (EmptyDatabaseException ede) {
						// TODO Auto-generated catch block
						ede.getMessage();
					}
				} else if (buildingType.equalsIgnoreCase("Warehouse")) {
					System.out.print("Enter the Warehouse's name: ");
					String warehouseName = input.nextLine();
					System.out.print("Enter Warehouse's city: ");
					String warehouseCity = input.nextLine();
					System.out.print("Enter the " + warehouseName + " number of floors: ");
					int numberOfFloors = input.nextInt();
					input.nextLine();
					System.out.print("Enter the " + warehouseName + " square footage: ");
					int squareFootage = input.nextInt();
					input.nextLine();
					Warehouse warehouse1 = new Warehouse(warehouseName, warehouseCity, numberOfFloors, squareFootage);
					try {
						// database.removeBuilding(warehouse1);
						System.out.println("Removed " + database.removeBuilding(warehouse1).getName() + "...");
					} catch (EmptyDatabaseException ede) {
						// TODO Auto-generated catch block
						ede.getMessage();
					}
				} else {
					System.out.println("Invalid building type. Please try again.");
				}
			} else if (selection.equalsIgnoreCase("Show All")) {

			} else if (selection.equalsIgnoreCase("Find")) {
				System.out.println("Enter Building name: ");
				String buildingName = input.nextLine();
				try {
					System.out.print("Info found was: ");
					database.showBuildingInfo(buildingName);
				} catch (EmptyDatabaseException ede) {
					// TODO Auto-generated catch block
					ede.getMessage();
				}
			} else if (selection.equalsIgnoreCase("Most")) {

			} else {
				System.out.println("Invalid input. Please try again.");
			}
		}

		System.out.println("Thank you for using the program, have a nice day " + name + "!");

	}

}
