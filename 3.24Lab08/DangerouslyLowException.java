/**
 * DangerouslyLowException.java - creates an exception if the the user enters a
 * number that is too low
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab08 - Temperature Stabilizer
 * @date 24 March 2016
 * @email jtwinters@g.coastal.edu
 *
 */
public class DangerouslyLowException extends Exception {

	/**
	 * default constructor that prints an error to the console if the user
	 * enters a number that is too low
	 */
	public DangerouslyLowException() {
		// TODO Auto-generated constructor stub
		super("RED Alert! Temperature is dangerously low... System proceeding to shutdown...");
	}

	/**
	 * overloaded constructor that prints an error message
	 * 
	 * @param message
	 *            error message that is printed to the console
	 */
	public DangerouslyLowException(String message) {
		super(message);
	}

}
