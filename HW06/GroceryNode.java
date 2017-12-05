/**
 * GroceryNode.java - This program houses the GroceryItems
 *
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework 06 - GroceryQueue
 * @date 25 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */

public class GroceryNode {

	/**
	 * item object
	 */
	private GroceryItem item;
	/**
	 * Reference to next node in list
	 */
	private GroceryNode link;

	/**
	 * Constructor
	 * 
	 * @param aItem
	 *            Grocery Item object
	 */
	public GroceryNode(GroceryItem aItem) {
		setItem(aItem);
		this.link = null;
	}

	// SETTERS //
	/**
	 * Sets the item equal to the
	 * 
	 * @param aItem
	 *            Groceryitem object
	 */
	public void setItem(GroceryItem aItem) {
		this.item = aItem;
	}

	/**
	 * Sets the link
	 * 
	 * @param aNode
	 *            GroceryNode object
	 */
	public void setLink(GroceryNode aNode) {
		this.link = aNode;
	}

	// GETTERS //
	/**
	 * Gets the item
	 * 
	 * @return GroceryItem object
	 */
	public GroceryItem getItem() {
		return item;
	}

	/**
	 * Gets the link
	 * 
	 * @return GroceryNode object
	 */
	public GroceryNode getLink() {
		return link;
	}

	/**
	 * Loops through the GroceryQueue looking for another instance of a specific
	 * item. If the item is found, the quantity of that item is incremented and
	 * the method returns true.
	 * 
	 * @param aItem
	 *            GroceryItem object
	 * @return true if the item is found
	 */
	public boolean findEqualItem(GroceryItem aItem) {

		if (this.item == null) {
			return false;
		}

		GroceryNode temp = new GroceryNode(aItem);

		while (temp.getLink() != null) {
			if (aItem.getItemName().equals(this.item.getItemName())
					&& aItem.getItemPrice() == this.item.getItemPrice()) {
				return true;
			}
			
		}

		return false;
	}
}