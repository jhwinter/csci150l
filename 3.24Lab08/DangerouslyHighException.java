/**
 * DangerouslyHighException.java - creates an exception
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab 08 Temperature Stabilizer
 * @date 24 March 2016
 * @email jtwinters@g.coastal.edu
 *
 */
public class DangerouslyHighException extends Exception {

	/**
	 * default constructor that prints out an error message if the user enters a
	 * temperature that is too high
	 */
	public DangerouslyHighException() {
		// TODO Auto-generated constructor stub
		super("RED Alert! Temperature is dangerously high... System proceeding to shutdown...");
	}

	/**
	 * overloaded constructor that prints an error message
	 * 
	 * @param message
	 *            error message that is printed to the console
	 */
	public DangerouslyHighException(String message) {
		super(message);
	}
}
