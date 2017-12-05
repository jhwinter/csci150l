/**
 * Lab5Test.java
 * 
 * A test harness for the CD class to be completed in lab.
 *
 * @author Clint
 * @modified by: Jonathan Winters
 * @course CSCI 150
 * @lab5 Lab5Test
 * @email jtwinters@g.coastal.edu
 * @date 16 February 2016
 */

public class Lab5Test {

	/**
	 * Note the overloaded checkEqualsMethods here
	 */

	/**
	 * @return expectedResult is compared with the actualResult and a message is
	 *         printed indicating the testName and if the comparison was passed
	 *         or failed.
	 */
	public static void checkEquals(String testName, String expectedResult, String actualResult) {
		// add your code here
		/*
		 * if the expected result is the same as the actual result, print out
		 * that the test passed. if they do not equal to each other, print out
		 * that the test failed
		 */
		if (expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println(testName + " Test passed!");
		} else {
			System.out.println("Test Failed: " + actualResult + "does not equal to " + expectedResult);
		}

	}

	/**
	 * @return expectedResult is compared with the actualResult and a message is
	 *         printed indicating the testName and if the comparison was passed
	 *         or failed.
	 */
	public static void checkEquals(String testName, boolean expectedResult, boolean actualResult) {
		// add your code here

		/*
		 * if the expected result is the same as the actual result, print out
		 * that the test passed. if they do not equal to each other, print out
		 * that the test failed
		 */
		if (expectedResult == actualResult) {
			System.out.println(testName + " Test passed!");
		} else {
			System.out.println("Test Failed: " + actualResult + "does not equal to " + expectedResult);
		}

	}

	/**
	 * Entry point into the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		CD cd1 = new CD("Gleesh", "Fat Trel", "Atlantic");
		//CD cd2 = new CD("She Knows", "Ne-Yo", "Motown Records");
		CD cd2 = new CD("She Knows", "Fat Trel", "Atlantic");
		
		// Step 1: Testing accessors
		System.out.println("Testing the accessor methods:");
		Lab5Test.checkEquals("getArtist", "Fat Trel", cd1.getArtist());
		Lab5Test.checkEquals("getTitle", "Gleesh", cd1.getTitle());
		Lab5Test.checkEquals("getRecordLabel", "Atlantic", cd1.getRecordLabel());
		
		// Step 2: Testing the equals method and the mutators
		System.out.println("Testing equals method and mutators:");
			// Step 2a: only testing different title names
		Lab5Test.checkEquals("Only different titles", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Only different titles", false, cd2.equals(cd1));
		
			// Step 2b: only testing different artists
		cd1.setTitle("Gleesh");
		cd1.setArtist("Ne-Yo");
		Lab5Test.checkEquals("Only different artist", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Only different artist", false, cd2.equals(cd1));
			// Step 2c: only testing different labels
		cd1.setArtist("Fat Trel");
		cd1.setRecordLabel("Atlantic");
		cd2.setRecordLabel("Motown Records");
		Lab5Test.checkEquals("Only different label", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Only different label", false, cd2.equals(cd1));
			// Step 2d: testing a different artist and title
		cd1.setRecordLabel("Motown Records");
		cd1.setArtist("Fat Trel");
		cd1.setTitle("Gleesh");
		Lab5Test.checkEquals("Different artist and title", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Different artist and title", false, cd2.equals(cd1));
			// Step 2e: testing a different artist and label
		cd1.setRecordLabel("Elektra");
		cd1.setArtist("Metallica");
		cd1.setTitle("The Black Album");
		cd2.setArtist("Jay-Z");
		cd2.setTitle("The Black Album");
		cd2.setRecordLabel("Def Jam");
		Lab5Test.checkEquals("Different artist and label", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Different artist and label", false, cd2.equals(cd1));
			// Step 2f: testing a different title and label
		cd1.setTitle("Master of Puppets");
		cd2.setRecordLabel("Megaforce");
		cd2.setTitle("Kill 'Em All");
		cd2.setArtist("Metallica");
		Lab5Test.checkEquals("Different title and label", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Different title and label", false, cd2.equals(cd1));
		// Step 3: testing a different title, artist, and label
		cd1.setTitle("Gleesh");
		cd1.setArtist("Fat Trel");
		cd1.setRecordLabel("Atlantic");
		Lab5Test.checkEquals("Different everything", false, cd1.equals(cd2));
		Lab5Test.checkEquals("Different everything", false, cd2.equals(cd1));
		// Step 4: testing the same title, artist, and label
		cd2.setTitle("Gleesh");
		cd2.setArtist("Fat Trel");
		cd2.setRecordLabel("Atlantic");
		Lab5Test.checkEquals("Same everything", true, cd1.equals(cd2));
		Lab5Test.checkEquals("Same everything", true, cd2.equals(cd1));
	}
}
