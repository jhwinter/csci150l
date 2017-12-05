/**
 * EmptyDatabaseException.java -
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Test2 - EmptyDatabaseException
 * @date 21 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
public class EmptyDatabaseException extends Exception {

	public EmptyDatabaseException() {
		// TODO Auto-generated constructor stub
		super("Error: Database is empty");
	}

	public EmptyDatabaseException(String message) {
		super(message);
	}

}
