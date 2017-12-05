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
public class Warehouse extends Building {

	/**
	 * square footage of the warehouse
	 */
	private int squareFootage = 0;

	public Warehouse() {
		// TODO Auto-generated constructor stub
		this("no name yet", " no city yet", 0, 0);
	}

	public Warehouse(String aName, String aCity, int floors, int footage) {
		// super();
		setName(aName);
		setCity(aCity);
		setNumberOfFloors(floors);
		setSquareFootage(footage);
	}

	// SETTERS //

	public void setSquareFootage(int footage) {
		squareFootage = footage;
	}

	// GETTERS //

	public int getSquareFootage() {
		return squareFootage;
	}

}
