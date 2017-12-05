
/**
 * MobileDeviceManager.java - this class interacts with the user to acquire input for the MobileDevice class
 * the methods should be static because they are standalone methods, they do not require anything from other methods
 * 
 * @author Jonathan Winters
 * @class CSCI 150
 * @labTest 01 - MobileDeviceManager
 * @date  2-25-16
 * @email jtwinters@g.coastal.edu
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class MobileDeviceManager {

	// default device
	private static MobileDevice aDevice = new MobileDevice();
	// array of mobile devices
	private static MobileDevice[] manager;
	private static Scanner in = new Scanner(System.in);
	// variables
	private static String brand = "no brand yet";
	private static String model = "no model yet";
	private static int weight = 0;
	private static String choice = "no choice yet";
	/*
	 * private final static String CHOICEBRAND = "Brand"; private final static
	 * String CHOICEMAX = "Max"; private final static String CHOICEWRITE =
	 * "Write"; private final static String CHOICEEXIT = "Exit";
	 */

	/**
	 * Entry point to the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		// TODO auto-generated method stub

		// MobileDevice device1 = new MobileDevice();
		// Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mobile Device Manager");
		int deviceCount = loadDevices(aDevice);
		// choice = "no choice yet";
		do {
			// System.out.print("Enter choice (" + CHOICEBRAND + ", " +
			// CHOICEMAX + ", " + CHOICEWRITE + ", "
			// + CHOICEWRITE + ", " + CHOICEEXIT + "): ");
			System.out.print("\nEnter choice(\"Brand\", \"Max\", \"Write\", or \"Exit\"): ");
			if (in.hasNextLine()) {
				choice = in.nextLine();
			}
			if (choice.equalsIgnoreCase("Brand")) {
				System.out.print("\nEnter Brand: ");
				if (in.hasNextLine()) {
					brand = in.nextLine();
				}
				printByBrand(manager, brand);
			} else if (choice.equalsIgnoreCase("Max")) {
				printMaxWeight(manager, deviceCount);
			} else if (choice.equalsIgnoreCase("Write")) {
				writeDevices(manager);
			}
		} while (!choice.equalsIgnoreCase("Exit"));
		System.out.println("\nThanks for using the Mobile Device Manager. Have a nice day!");
		// in.close();
	}

	public static int loadDevices(MobileDevice aDevice) {

		// variables
		Scanner in = new Scanner(System.in);
		int deviceNo = 0;
		int count = 0;
		// 1. asks the user for the number of devices that they would like to
		// create
		System.out.print("Please enter the number of devices: ");
		if (in.hasNextInt()){
			deviceNo = in.nextInt();
			in.nextLine();
		}
		
		// 1a. sets the size of the manager array to user input
		manager = new MobileDevice[deviceNo];
		/*
		 * 2. loop 2a. ask the user for all of the details about all of the
		 * devices that they just created 2b. creates the device with the user's
		 * specifications and stores it in the manager array
		 */
		for (int i = 0; i < manager.length; i++) {
			System.out.print("\nData for Device " + (i + 1));
			System.out.print("\nEnter Brand Name: ");
			if (in.hasNextLine()) {
				brand = in.nextLine();
				// aDevice.setBrand(brand);
			}
			// brand = in.nextLine();
			System.out.print("Enter Model Name: ");
			if (in.hasNextLine()) {
				model = in.nextLine();
				// aDevice.setModel(model);
			}
			System.out.print("Enter Weight (in grams): ");
			if (in.hasNextInt()) {
				weight = in.nextInt();
				in.nextLine();
				// aDevice.setWeight(weight);
			}
			MobileDevice device2 = new MobileDevice(brand, model, weight);
			if (manager[i] == null) {
				manager[i] = device2;
				// manager[i] = aDevice;
			}
		}

		// 3. loops through the array and counts how many mobile devices are in
		// it
		for (int i = 0; i < manager.length; i++) {
			if (manager[i] != null) {
				count++;
			}
		}

		System.out.println("\nLoad complete...");
		// return the number of mobile devices in the array
		return count;
	}

	/**
	 * this method loops through the array and finds all of the devices that are
	 * made by a specified brand and prints the info of those devices
	 * 
	 * @param aManager
	 *            the array of mobile devices
	 * @param aBrand
	 *            the device brand that is being searched for
	 */
	public static void printByBrand(MobileDevice[] aManager, String aBrand) {
		// in = new Scanner(System.in);
		// System.out.print("Enter Brand: ");
		// String brand = aBrand;
		for (int i = 0; i < aManager.length; i++) {
			if (aManager[i] != null && aManager[i].getBrand().equalsIgnoreCase(aBrand)) {
				aManager[i].printInfo();
			}
		}
		return;
	}

	/**
	 * this method searches through the array to find the heaviest mobile device
	 * and then prints the weight of that device to the console
	 * 
	 * @param aManager
	 *            the array of mobile devices
	 * @param aDeviceCount
	 *            the number of devices in the array
	 */
	public static void printMaxWeight(MobileDevice[] aManager, int aDeviceCount) {

		int maxWeight = 0;
		for (int i = 0; i < aManager.length; i++) {
			if (i == 0) {
				maxWeight = aManager[0].getWeight();
			} else if (i > 0) {
				if (aManager[i].getWeight() > aManager[i - 1].getWeight()) {
					maxWeight = aManager[i].getWeight();
				}
			}
		}
		System.out.println(
				"The max weight of " + aDeviceCount + " device(s) has been determined to be " + maxWeight + " grams.");

	}

	public static void writeDevices(MobileDevice[] aManager) {
		File aFile = new File("Devices.txt");

		try {
			PrintWriter writer = new PrintWriter(aFile);

			for (int i = 0; i < aManager.length; i++) {
				if (aManager[i] != null) {
					brand = aManager[i].getBrand();
					model = aManager[i].getModel();
					weight = aManager[i].getWeight();
					writer.println(brand);
					writer.println(model);
					writer.println(weight);
					writer.println();
				}
			}
			writer.close();
			System.out.println("The devices have been written to Devices.txt");

		} catch (FileNotFoundException fnfe) {
			System.out.println("FileNotFoundException caught: " + fnfe.getMessage());
			fnfe.printStackTrace();
		}
	}
}
