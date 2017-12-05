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
public abstract class Building {

	/**
	 * name of the building
	 */
	private String name = "no name yet";
	/**
	 * the city the building is located in
	 */
	private String city = "no city yet";
	/**
	 * the number of floors the building has
	 */
	private int numberOfFloors = 0;

	/**
	 * default constructor
	 */
	public Building() {
		// TODO Auto-generated constructor stub
		this("no name yet", "no city yet", 0);
	}

	/**
	 * overloaded constructor
	 * 
	 * @param aName
	 * @param aCity
	 * @param floors
	 */
	public Building(String aName, String aCity, int floors) {
		name = aName;
		city = aCity;
		numberOfFloors = floors;
	}

	// SETTERS //

	public void setName(String aName) {
		name = aName;
	}

	public void setCity(String aCity) {
		city = aCity;
	}

	public void setNumberOfFloors(int floors) {
		numberOfFloors = floors;
	}

	// GETTERS //

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
	// OVERRIDING METHOD //
	/* public String toString() {
		
		return "no string yet";
	} */
}
