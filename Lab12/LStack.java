//--------------------------------------------------------------------
//
//  Laboratory 11                                            LStack
//
//  Definitions for the Linked List implementation of the Stack ADT
//
//  The student is to complete all missing or incomplete method 
//     implementations for this class
//
//--------------------------------------------------------------------

/**
 * 
 * @author Clint Fuchs
 * @modifiedby Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab 11 - LStack
 * @date 7 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
class LStack implements Stack // Linked stack class
{
	// Data member
	private StackNode top; // Reference to top of stack

	// Constructors and helper method setup
	public LStack() // Default Constructor1
	{
		// top = null;
		setup(); // this method does the top = null stuff

	}

	public LStack(int size) // Constructor2: ignore size
							// for compatibility with AStack
	{
		// top = null;
		setup(); // this method does the top = null stuff
	}

	// Class Methods
	private void setup() // Called by Constructors only
	{
		top = null;
	}

	// In-lab2 operation
	// Creates a duplicate copy of valueStack
	LStack(LStack valueStack) // Copy constructor
	{
		setup();
	}

	// Insert method clone( ) here

	// ----- Insert method implementations for the interface Stack here -----//

	public void push(Object newElement) {
		// 1 create new node
		StackNode tempStackNode = new StackNode(newElement);
		// 2 case where stack is empty
		if (isEmpty()) {
			top = tempStackNode;
		}
		// 3 case where stack is not empty
		else {
			tempStackNode.next = top; // connect temp to the existing stack
			top = tempStackNode; // move top to the new top of the stack
		}
	}

	/**
	 * Pops Object from top of stack
	 */
	public Object pop() {
		// Object obj = null;
		/*
		 * if the stack is empty, set the temporary stack node = temp set top
		 * equal to the next element, then return the temporary stack node else
		 * return null
		 */
		if (!this.isEmpty()) {
			StackNode tempStackNode = top;
			
			top = top.next;
			return tempStackNode;
		} else {
			return null;
		}
		// return obj;
	}

	/**
	 * Remove all Objects from stack
	 */
	public void clear() {
		setup();
	}

	/**
	 * Check to see if the stack is empty
	 */
	public boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * The stack can never be full.
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * 
	 */
	public void showStructure()
	// Linked list implementation. Outputs the elements in a stack. If
	// the stack is empty, outputs "Empty stack". This operation is
	// intended for testing and debugging purposes only.
	{
		StackNode iterator = top; // Iterates through the stack

		if (isEmpty()){
			//System.out.println("Stack is empty");
		}
		else {
			//System.out.print("top ");
			// add code to iterate through your list and print the contents

			//StackNode iterator = top;
			while (iterator.next != null) {
				StackNode temp = iterator;
				iterator = iterator.next;
				System.out.println(temp.element);
			}
			System.out.println(iterator.element);

			//System.out.println("bottom");

		}
	} // showStructure for LStack
} // class LStack
