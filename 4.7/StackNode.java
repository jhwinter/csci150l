//--------------------------------------------------------------------
//
//  Laboratory 5                                       StackNode.jshl
//
//  Class definition for a linked list implementation
//  
//  The student is to complete all missing or incomplete method 
//     implementations for this class
//
//--------------------------------------------------------------------

/** 
 * @author Clint Fuchs
 * @modifiedby Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab 11 - LStack
 * @date 7 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
//Facilitator class for the Stack class
class StackNode // A singly linked list node
{
	// Data members
	public Object element; // Object for this node
	public StackNode next; // Reference to next node in list

	public StackNode(Object newElement) // Constructor
	{
		this.element = newElement;
		this.next = null;
	}

	// Class methods
	// You must acceess the member variables directly - no other methods exist

} // class StackNode
