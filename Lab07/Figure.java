/**
 * Figure.java - This is the abstract object of a Figure. It is the parent class
 * to the Rectangle and Circle objects. The Rectangle and Circle inherit the
 * Area and Perimeter methods from this class.
 * 
 * 
 * 
 * @author Jonathan Winters
 * @course CSCI 150
 * @lab 07 Figure.java
 * @version 1.0
 * @email jtwinters@g.coastal.edu
 * @date 17 March 2016
 *
 */

public abstract class Figure {

	/**
	 * member variable of the class
	 * area of the object
	 */
	private double area = 0;
	
	/**
	 * member variable of the class
	 * perimeter of the object
	 */
	private double perimeter = 0;

	// CONSTRUCTORS //

	/**
	 * default constructor
	 */
	public Figure() {
		this(0.0, 0.0);
	}

	/**
	 * overloaded constructor
	 * 
	 * @param area
	 *            area of the object, must be a double
	 * @param perimeter
	 *            perimeter of the object, must be a double
	 */
	public Figure(double area, double perimeter) {
		this.area = area;
		this.perimeter = perimeter;
	}

	// SETTERS //

	/**
	 * sets the area of the object
	 * 
	 * @param area
	 *            area of the object, must be a double
	 */
	protected void setArea(double area) {
		this.area = area;
	}

	/**
	 * sets the perimeter of the object
	 * 
	 * @param perimeter
	 *            perimeter of the object, must be a double
	 */
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	// GETTERS //

	/**
	 * gets the area of the object
	 * 
	 * @return returns the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * gets the perimeter of the object
	 * 
	 * @return returns the perimeter
	 */
	public double getPerimeter() {
		return perimeter;
	}

	/**
	 * updates the area of the object
	 */
	public abstract void updateArea();

	/**
	 * updates the perimeter of the object
	 */
	public abstract void updatePerimeter();

}
