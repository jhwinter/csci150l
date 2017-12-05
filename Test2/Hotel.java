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
public class Hotel extends Building {

	/**
	 * number of suites the hotel has
	 */
	private int numberOfSuites = 0;

	public Hotel() {
		// TODO Auto-generated constructor stub
		this("no name yet", "no city yet", 0, 0);
	}

	public Hotel(String aName, String aCity, int floors, int suites) {
		// super();
		setName(aName);
		setCity(aCity);
		setNumberOfFloors(floors);
		setNumberOfSuites(suites);
	}

	// SETTERS //

	public void setNumberOfSuites(int suites) {
		numberOfSuites = 0;
	}

	/*
	 * public void setName(String aName) {
	 * 
	 * }
	 */

	// GETTERS //

	public int getNumberOfSuites() {
		return numberOfSuites;
	}

}
