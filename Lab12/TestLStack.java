
//--------------------------------------------------------------------
//
//  Laboratory 11                                      TestLStack.java
//
//  Test program for the operations in the AStack ADT
//  With slight modifications can be used to also test the LStack ADT
//  and the AStackDwn ADT
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

import java.io.*;

// Driver class for Stack implementation tests
class TestLStack {
	// Main routine for Stack implementation tests
	public static void main(String args[]) throws IOException {
		Stack testStack = new LStack(8); // Test stack
		Stack assignStack = new LStack(8); // Destination for assignment
		char testElement = 'x'; // Stack element
		char cmd = 'w'; // Input command

		System.out.println("Commands:");
		System.out.println("  +x : Push x");
		System.out.println("  -  : Pop");
		System.out.println("  C  : Clear");
		System.out.println("  E  : Empty stack?");
		System.out.println("  F  : Full stack?");
		System.out.println("  !  : Copy constructor   (Inactive : In-lab Exercise 2)");
		System.out.println("  Q  : Quit the test program");
		System.out.println();

		do {
			testStack.showStructure(); // Output stack

			System.out.print("Command: "); // Read command
			cmd = (char) System.in.read();
			while (Character.isWhitespace(cmd)) // ignore whitespace
				cmd = (char) System.in.read();
			if (cmd == '+') {
				testElement = (char) System.in.read();
				if (Character.isWhitespace(testElement)) // testElement is
															// whitespace
					System.out.print("Element to add: ");
				while (Character.isWhitespace(testElement))
					testElement = (char) System.in.read(); // get valid
															// testElement
			}

			switch (cmd) {
			case '+': // push
				System.out.println("Push " + testElement);
				testStack.push(new Character(testElement));
				break;

			case '-': // pop
				System.out.println("Popped " + testStack.pop());
				break;

			case 'C':
			case 'c': // clear
				System.out.println("Clear the stack");
				testStack.clear();
				break;

			case 'E':
			case 'e': // empty
				if (testStack.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Stack is NOT empty");
				break;

			case 'F':
			case 'f': // full
				if (testStack.isFull())
					System.out.println("Stack is full");
				else
					System.out.println("Stack is NOT full");
				break;

			/*
			 * ! case '!' : // In-lab Exercise 2 System.out.println(
			 * "Copy using a Copy Constructor"); assignStack = new
			 * LStack(testStack); dummy(assignStack); System.out.println(
			 * "Original Stack is:"); testStack.showStructure();
			 * 
			 * System.out.println("\nversus Cloning"); assignStack =
			 * (LStack)testStack.clone(); dummy(assignStack);
			 * System.out.println("Original Stack is:");
			 * testStack.showStructure();
			 * 
			 * System.out.println("\nversus Copy by Assignment"); assignStack =
			 * testStack; dummy(assignStack); System.out.println(
			 * "Original Stack is:"); break; !
			 */

			case 'Q':
			case 'q': // Quit test program
				break;

			default: // Invalid command
				if (!(Character.isWhitespace(cmd)))
					System.out.println("Inactive or invalid command");
			} // switch
		} while (cmd != 'Q' && cmd != 'q');

	} // main

	/*
	 * ! static void dummy ( LStack copyStack ) // Dummy routine that is passed
	 * a stack which (preferably) should not // change the original stack. //
	 * Outputs copyStack and clears it. { System.out.print("Copy of stack:  ");
	 * copyStack.showStructure(); copyStack.clear(); System.out.print(
	 * "Copy cleared:   "); copyStack.showStructure(); System.out.println(); }
	 * //dummy !
	 */

} // class TestAStack
