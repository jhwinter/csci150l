/**
 * Circle.java - This is the child class of the Figure object. It defines the
 * radius of a Circle and then uses the inherited methods to find the area and
 * perimeter of the circle.
 * 
 * 
 * @author Jonathan Winters
 * @course CSCI 150
 * @lab 07 Circle.java
 * @version 1.0
 * @email jtwinters@g.coastal.edu
 * @date 17 March 2016
 *
 */
public class Circle extends Figure {
	
	/**
	 * member variable of the class
	 * radius of the circle
	 */
	private double radius = 0;

	// CONSTRUCTORS //

	/**
	 * default constructor
	 */
	public Circle() {
		this(0.0);
	}

	/**
	 * overloaded constructor that sets the radius of the circle and updates the
	 * area and perimeter based on that number
	 * 
	 * @param aRadius
	 *            radius of the circle
	 */
	public Circle(double aRadius) {
		super();
		setRadius(aRadius);
		updateArea();
		updatePerimeter();
	}

	// SETTERS //

	/**
	 * sets the radius of the circle
	 * 
	 * @param r
	 *            the radius of the circle
	 */
	public void setRadius(double r) {
		radius = r;
	}

	// GETTERS //

	/**
	 * gets the radius of the circle
	 * 
	 * @return returns the radius of the circle
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * calculates the area of the circle and sets the area for the circle
	 */
	public void updateArea() {
		double area = Math.PI * Math.pow(radius, 2);
		super.setArea(area);
	}

	/**
	 * calculates the perimeter for the circle and sets the perimeter for the
	 * circle
	 */
	public void updatePerimeter() {
		double perimeter = Math.PI * 2 * radius;
		super.setPerimeter(perimeter);

	}

}
