/**
 * Queue.java - will allow declaration of any kind of queue object as long as the queue variant class 'implements stack'
 * 
 */

/**
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework 06 - GroceryQueue
 * @date 25 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */

public interface Queue {
	// Default maximum stack size
	public static final int DEF_MAX_QUEUE_SIZE = 10;

	// Stack manipulation operations
	/**
	 * Push GroceryItem onto stack
	 * 
	 * @param newItem
	 *            new GroceryItem object
	 */
	public void enqueue(GroceryItem newItem);

	/**
	 * Pop GroceryItem object from top of stack
	 * 
	 * @return GroceryItem object
	 */
	public GroceryItem dequeue();

	/**
	 * Removes all GroceryItem objects from stack
	 */
	public void clear();

	// Stack status operations
	/**
	 * Checks if stack is empty
	 * 
	 * @return true if stack is empty
	 */
	public boolean isEmpty();

	/**
	 * Checks if stack is full
	 * 
	 * @return true if stack is full
	 */
	public boolean isFull();

	/**
	 * Outputs the elements in the stack for testing/debugging purposes
	 */
	public void showStructure();
}
