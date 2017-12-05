/**
 * StopWatch.java - A stopwatch accumulates time when it is running. You can
 * repeatedly start and stop the stopwatch. You can use a stopwatch to measure
 * the running time of a program.
 * 
* @author Jonathan Winters
* @course CSCI 150/L
* @lab Lab 10 - Selection Sort
* @date 5 April 2016
* @email jtwinters@g.coastal.edu
*
*/
public class StopWatch {

	private long elapsedTime;
	private long startTime;
	private boolean isRunning;

	/**
	 * Constructs a stopwatch that is in the stopped state and has no time
	 * accumulated.
	 */
	public StopWatch() {
		// TODO Auto-generated constructor stub
		reset();
	}

	/**
	 * Starts the stopwatch. Time starts accumulating now.
	 */
	public void start() {
		if (isRunning) {
			return;
		}
		isRunning = true;
		startTime = System.currentTimeMillis();

	}

	/**
	 * Stops the stopwatch. Time stops accumulating and is added to the elapsed
	 * time.
	 */
	public void stop() {
		if (!isRunning) {
			return;
		}
		isRunning = false;
		long endTime = System.currentTimeMillis();
		elapsedTime = elapsedTime + endTime - startTime;
	}

	/**
	 * Returns the total elapsed time.
	 * 
	 * @return the total elapsed time
	 */
	public long getElapsedTime() {
		if (isRunning) {
			long endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		} else {
			return elapsedTime;
		}
	}

	/**
	 * Stops the watch and resets the elapsed time to 0.
	 */
	public void reset() {
		elapsedTime = 0;
		isRunning = false;
	}

}
