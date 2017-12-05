/**
 * GroceryItem.java - This class stores information about an item placed into a
 * shopper's GroceryQueue.
 *
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework 06 - GroceryQueue
 * @date 25 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */

public class GroceryItem {

	/**
	 * name of an item
	 */
	private String itemName = "no item name yet";

	/**
	 * price of an item
	 */
	private double itemPrice = 0.0;

	/**
	 * quantity of an item
	 */
	private int quantity = 0;

	/**
	 * default constructor
	 */
	public GroceryItem() {
		this("no name yet", 0.0);
	}

	/**
	 * overloaded constructor
	 * 
	 * @param aName
	 *            String variable that's the name of the item
	 * @param aPrice
	 *            double variable that's the price of the item
	 */
	public GroceryItem(String aName, double aPrice) {
		setItemName(aName);
		setItemPrice(aPrice);
	}

	// SETTERS //

	/**
	 * sets the item name
	 * 
	 * @param aName
	 *            String variable that's the name of the item
	 */
	public void setItemName(String aName) {
		itemName = aName;
	}

	/**
	 * sets the item price
	 * 
	 * @param aPrice
	 *            double variable that's the price of the item
	 */
	public void setItemPrice(double aPrice) {
		itemPrice = aPrice;
	}

	// GETTERS //
	/**
	 * gets the item name
	 * 
	 * @return String variable that's the name of the item
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * gets the item price
	 * 
	 * @return double variable that's the price of the item
	 */
	public double getItemPrice() {
		return itemPrice;
	}

	/**
	 * gets the quantity of the specific item
	 * 
	 * @return int value that's the quantity of a specific item
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * increments the quantity variable
	 */
	public void quantityPlusPlus() {
		this.quantity++;
	}
}