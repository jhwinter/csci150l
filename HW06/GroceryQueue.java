import java.text.DecimalFormat;

/**
 * GroceryQueue.java - This program holds a list of grocery nodes
 *
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework 06 - GroceryQueue
 * @date 25 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */

public class GroceryQueue implements Queue {

	/**
	 * reference to head of queue
	 */
	private GroceryNode head;

	/**
	 * Default constructor
	 */
	public GroceryQueue() {
		setup();
	}

	/**
	 * Overloaded constructor
	 * 
	 * @param size
	 *            integer variable that's the size of the queue
	 *
	 *            public GroceryQueue(int size) { setup(); }
	 */

	/**
	 * resets head = null Called only by Constructors
	 */
	private void setup() {
		head = null;
	}

	/**
	 * Processes all of the items in the queue, printing each items info, price
	 * and quantity to the console, and printing the total price of all items
	 * that were in the queue
	 * 
	 * @return double value that's the total price
	 */
	public double checkout() {
		double totalPrice = 0.0;
		double itemPrice = 0.0;
		int quantity = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		GroceryNode iterator = head;

		while (iterator.getLink() != null) {

			System.out.println("Item: " + iterator.getItem().getItemName());
			System.out.printf("Price: " + df.format(iterator.getItem().getItemPrice()));
			System.out.println("Quantity: " + iterator.getItem().getQuantity());

			itemPrice = iterator.getItem().getItemPrice();
			quantity = iterator.getItem().getQuantity();
			totalPrice = totalPrice + (itemPrice * quantity);
			iterator = iterator.getLink();
		}

		System.out.println("Item: " + iterator.getItem().getItemName());
		System.out.println("Price: " + df.format(iterator.getItem().getItemPrice()));
		System.out.println("Quantity: " + iterator.getItem().getQuantity());

		itemPrice = iterator.getItem().getItemPrice();
		quantity = iterator.getItem().getQuantity();
		totalPrice = totalPrice + (itemPrice * quantity);
		iterator = iterator.getLink();

		return totalPrice;
	}

	/**
	 * Counts the number of items in the GroceryQueue
	 * 
	 * @return integer value that's the number of items
	 */
	public int getTotalItems() {
		int index = 0;
		GroceryNode iterator = head;

		// GroceryNode temp = new GroceryNode(newItem);
		if (iterator == null) {
			return 0;
		}
		while (iterator.getLink() != null) {
			iterator = iterator.getLink();
			index++;
		}
		index++;
		return index;
		/*
		 * for (int i = 0; i < new GroceryQueue().length(); i++) {
		 * 
		 * }
		 */
	}

	/**
	 * Adds items to the end of the queue
	 */
	@Override
	public void enqueue(GroceryItem newItem) {
		// TODO Auto-generated method stub
		// 1. create new node
		GroceryNode tempGroceryNode = new GroceryNode(newItem);
		// 2. case where queue is empty
		// if queue is empty add the tempGroceryNode
		if (isEmpty()) {
			head = tempGroceryNode;
		} else {
			/*
			 * if the queue is not empty, iterate through the queue until you
			 * find an empty spot and add the new node to that spot
			 */
			GroceryNode iterator = head;
			while (iterator.getLink() != null) {
				iterator = iterator.getLink();
			}
			iterator.setLink(tempGroceryNode);
		}
	}

	/**
	 * Removes items from the end of the queue
	 */
	@Override
	public GroceryItem dequeue() {
		// TODO Auto-generated method stub
		/*
		 * if the queue is empty, return the item that
		 */
		if (!this.isEmpty()) {
			GroceryNode tempGroceryNode = head;
			return tempGroceryNode.getItem();
		} else {
			return null;
		}
	}

	/**
	 * Remove all objects from queue
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		setup();
	}

	/**
	 * Checks if queue is empty.
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * The queue can never be full.
	 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Outputs the elements in a queue. If the queue is empty, outputs
	 * "Empty Queue". This operation intended for testing and debugging purposes
	 * only.
	 */
	@Override
	public void showStructure() {
		// TODO Auto-generated method stub
		GroceryNode iterator = head;
		DecimalFormat df = new DecimalFormat("0.00");
		
		if (this.isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			while (iterator.getLink() != null) {
				GroceryNode tempGroceryNode = iterator;
				iterator = iterator.getLink();
				System.out.println("Item: " + tempGroceryNode.getItem().getItemName());
				System.out.println("Price: $" + df.format(tempGroceryNode.getItem().getItemPrice()));
			}
			System.out.println("Item: " + iterator.getItem().getItemName());
			System.out.println("Price: $" + df.format(iterator.getItem().getItemPrice()));
		}

	}

}
