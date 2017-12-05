/**
 * Temperature.java - The class file that handles the temperature that is input
 * by the user
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab08 - TemperatureStabilizer
 * @date 24 March 2016
 * @email jtwinters@g.coastal.edu
 */
public class Temperature {

	/**
	 * temperature variable
	 */
	private int temp = 0;
	/**
	 * this variable will hold whichever temperature is the highest one that was
	 * recorded
	 */
	private int high = -999;
	/**
	 * this variable will hold whichever temperature is the lowest one that was
	 * recorded
	 */
	private int low = 999;
	/**
	 * the maximum temperature that the user can enter
	 */
	public static final int MAX = 300;
	/**
	 * the minimum temperature that the user can enter
	 */
	public static final int MIN = 200;

	// CONSTRUCTORS //

	/**
	 * default constructor
	 */
	public Temperature() {
		temp = 0;
		high = -999;
		low = 999;
	}

	/**
	 * overloaded constructor
	 * 
	 * @param tempA
	 *            must be an integer value, temperature that is entered in by
	 *            the user
	 * @throws DangerouslyHighException
	 *             exception that is thrown if the user enters a number that is
	 *             too high
	 * @throws DangerouslyLowException
	 *             exception that is thrown if the user enters a number that is
	 *             too low
	 */
	public Temperature(int tempA) throws DangerouslyHighException, DangerouslyLowException {
		setTemp(tempA); // set the temperature that the user enters
		setHigh(tempA); // set the highest temperature that the user enters
		setLow(tempA); // set the lowest temperature that the user enters
	}

	// SETTERS //

	/**
	 * sets the temperature variable = to the value input by the user
	 * 
	 * @param tempA
	 *            integer variable input by the user
	 * @throws DangerouslyHighException
	 *             exception that is thrown if the user enters a number that is
	 *             too high
	 * @throws DangerouslyLowException
	 *             exception that is thrown if the user enters a number that is
	 *             too low
	 */
	public void setTemp(int tempA) throws DangerouslyHighException, DangerouslyLowException {
		/*
		 * if the user enters a value that is less than or equal to the MIN + 10
		 * and greater than or equal to the MIN, then set the temperature
		 * variable equal to the user input and throw the
		 * DangerouslyLowException with an error message. check if the user
		 * input is the new lowest or highest temperature recorded
		 */
		if (tempA <= MIN + 10 && tempA >= MIN) {
			temp = tempA; // set the temp variable = to the user input
			setLow(tempA); // set the lowest temperature that the user enters
			setHigh(tempA); // set the highest temperature that the user enters
			throw new DangerouslyLowException("Warning! Temperature nearing lower limit.");
		}
		/*
		 * if the user enters a value that is greater than or equal to the MAX -
		 * 10 and less than or equal to the MAX, then set the temperature
		 * variable equal to the user input and throw the
		 * DangerouslyHighException with an error message. check if the
		 * userinput is the new lowest or highest temperature recorded
		 */
		else if (tempA >= MAX - 10 && tempA <= MAX) {
			temp = tempA; // set the temp variable = to the user input
			setLow(tempA); // set the lowest temperature that the user enters
			setHigh(tempA); // set the highest temperature that the user enters
			throw new DangerouslyHighException("Warning! Temperature nearing upper limit.");
		}
		/*
		 * if the user enters a value that is less than the MIN, then throw the
		 * default DangerouslyLowException
		 */
		else if (tempA < MIN) {
			throw new DangerouslyLowException();
		}
		/*
		 * if the user enters a value that is greater than the MAX, then throw
		 * the default DangerouslyHighException
		 */
		else if (tempA > MAX) {
			throw new DangerouslyHighException();
		}
		/*
		 * if the user inputted temperature does not meet any of the above
		 * conditions, then set the temp = to the user input. check if the user
		 * input is the new highest or lowest temperature recorded
		 */
		else {
			temp = tempA; // set the temp variable = to the user input
			setLow(tempA); // set the lowest temperature that the user enters
			setHigh(tempA); // set the highest temperature that the user enters
		}
	}

	/**
	 * set high variable = to the user inputted temperature variable if it is
	 * greater than the current value but less than MAX
	 * 
	 * @param tempA
	 *            integer variable that the user input
	 */
	public void setHigh(int tempA) {
		if (high <= tempA && tempA <= MAX) {
			high = tempA;
		}
	}

	/**
	 * set low variable = to the user inputted temperature variable if it is
	 * less than the current value but less than MIN
	 * 
	 * @param tempA
	 *            integer variable that the user input
	 */
	public void setLow(int tempA) {
		if (low >= tempA && tempA >= MIN) {
			low = tempA;
		}
	}

	// GETTERS //

	/**
	 * gets the value of the temperature variable
	 * 
	 * @return returns the value in the temperature variable
	 */
	public int getTemp() {
		return temp;
	}

	/**
	 * gets the value of the current highest temperature variable
	 * 
	 * @return returns the value in the high variable
	 */
	public int getHigh() {
		return high;
	}

	/**
	 * gets the value of the current lowest temperature variable
	 * 
	 * @return returns the value in the low variable
	 */
	public int getLow() {
		return low;
	}

}
