/**
 * Rectangle.java - This is the child class of the Figure object. It defines the
 * length and width of the rectangle. It uses the inherited methods from the
 * Figure class to calculate the area and method of the rectangle.
 * 
 * 
 * @author Jonathan Winters
 * @course CSCI 150
 * @lab 07 Rectangle.java
 * @version 1.0
 * @email jtwinters@g.coastal.edu
 * @date 17 March 2016
 *
 */
public class Rectangle extends Figure {

	/**
	 * member variable of this class
	 * length of the rectangle
	 */
	private double length = 0;
	
	/**
	 * member variable of this class
	 * width of the rectangle
	 */
	private double width = 0;
	
	// CONSTRUCTORS //
	
	/**
	 * default constructor
	 */
	Rectangle() {
		this(0.0, 0.0);
	}

	/**
	 * overloaded constructor that sets the length and width of the rectangle
	 * and then updates the area and perimeter based on those numbers
	 * 
	 * 
	 * @param length
	 *            length of the rectangle
	 * @param width
	 *            width of the rectangle
	 */
	Rectangle(double length, double width) {
		super();
		setLength(length);
		setWidth(width);
		updateArea();
		updatePerimeter();
	}

	// SETTERS //

	/**
	 * sets the length of the rectangle
	 * 
	 * @param l
	 *            length that is passed in to the method
	 */
	public void setLength(double l) {
		length = l;
	}

	/**
	 * sets the width of the rectangle
	 * 
	 * @param w
	 *            width that is passed in to the method
	 */
	public void setWidth(double w) {
		width = w;
	}

	// GETTERS //

	/**
	 * gets the length of the rectangle
	 * 
	 * @return returns the length of the rectangle
	 */
	public double getLength() {
		return length;
	}

	/**
	 * gets the width of the rectangle
	 * 
	 * @return returns the width of the rectangle
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * calculates the formula for the area of a rectangle and sets the Area for
	 * the rectangle
	 */
	public void updateArea() {
		double area = length * width;
		super.setArea(area);
	}

	/**
	 * calculates the formula for the perimeter of a rectangle and sets the
	 * perimeter for the rectangle
	 */
	public void updatePerimeter() {
		double perimeter = 2 * length + 2 * width;
		super.setPerimeter(perimeter);
	}

}
