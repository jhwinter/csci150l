
/**
 * PostfixEvaluator.java - This program takes an expression entered by the user from the command line, prints out the equation as an infix expression along with the result.
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Lab 10 - Selection Sort
 * @date 12 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
import java.util.Scanner;

public class PostfixEvaluator {
	/**
	 * Entry point to the program
	 * @param args  Command lin arguments
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Postfix Evaluator! \n");
		String answer = "yes"; // loop condition
		// int i = 0;
		Scanner input = new Scanner(System.in);
		Stack testStack = new LStack();
		/*
		 * This loop will continue until the user enters something that is not a "yes"
		 */
		do {
			System.out.print("Please enter a postfix expression to evaluate: ");
			// if (input.nextLine() != null) {
			String everything = input.nextLine(); // reads in user input as a String
			String printStatement = " ";
			/*
			 * for (int j = 0; j < everything.length(); j++) { if
			 * (Character.isWhitespace(everything.charAt(j)) == true) { char
			 * noSpace = everything.charAt(j); } }
			 */
			
			/*
			 * This loops through the string determining all of the operators and numbers.
			 */
			for (int i = 0; i < everything.length(); i++) {
				// if (Character.isWhitespace(everything.charAt(i))) {
				// i++;
				// } else
				/*
				 * if the user enters in a + sign, the last two things pushed on the stack are added and the new value is pushed on the stack.
				 * And adds the element to a print statement
				 */
				if (everything.charAt(i) == '+') {
					// int value1 = (int) testStack.pop();
					// int value2 = (int) testStack.pop();
					StackNode value1 = (StackNode) testStack.pop();
					StackNode value2 = (StackNode) testStack.pop();
					int sum = (int) value2.element + (int) value1.element;
					testStack.push(sum);
					// System.out.println("Sum: " + sum);
					printStatement = value2.element + " + " + value1.element;
					// System.out.println(printStatement);
					i++;
				} /*
				 * if the user enters in a - sign, the last two things popped off of the stack are subtracted and the new value is pushed on the stack.
				 * And adds the element to a print statement
				 */
				else if (everything.charAt(i) == '-') {
					// if (testStack.pop() != null) {
					// int value1 = (int) testStack.pop();
					// int value2 = (int) testStack.pop();
					StackNode value1 = (StackNode) testStack.pop();
					StackNode value2 = (StackNode) testStack.pop();
					// String value2 = testStack.pop().toString()
					// }
					int newValue = (int) value2.element - (int) value1.element;
					testStack.push(newValue);
					printStatement = value2.element + " - " + value1.element;
					// System.out.println("New value: " + newValue);
					// printStatement =
					i++;
				} /*
				 * if the user enters in a * sign, the last two things popped off of the stack are multiplied and the new value is pushed on the stack.
				 * And adds the element to a print statement
				 */
				else if (everything.charAt(i) == '*') {
					// int value1 = (int) testStack.pop();
					// int value2 = (int) testStack.pop();
					StackNode value1 = (StackNode) testStack.pop();
					StackNode value2 = (StackNode) testStack.pop();
					int product = (int) value2.element * (int) value1.element;
					testStack.push(product);
					printStatement = value2.element + " * " + value1.element;
					// System.out.println("Product: " + product);
					i++;
				}  /*
				 * if the user enters in a % sign, the last two things are popped off of the stack and are modded and the new value is pushed on the stack.
				 * And adds the element to a print statement
				 */
				else if (everything.charAt(i) == '/') {
					// int value1 = (int) testStack.pop();
					// int value2 = (int) testStack.pop();
					StackNode value1 = (StackNode) testStack.pop();
					StackNode value2 = (StackNode) testStack.pop();
					int newValue = (int) value2.element / (int) value1.element;
					testStack.push(newValue);
					printStatement = value2.element + " / " + value1.element;
					// System.out.println("New value: " + newValue);
					i++;
				} /*
				 * if the user enters in a % sign, the last two things are popped off of the stack and are modded and the new value is pushed on the stack.
				 * And adds the element to a print statement
				 */
				else if (everything.charAt(i) == '%') {
					// int value1 = (int) testStack.pop();
					// int value2 = (int) testStack.pop();
					StackNode value1 = (StackNode) testStack.pop();
					StackNode value2 = (StackNode) testStack.pop();
					int newValue = (int) value2.element % (int) value1.element;
					testStack.push(newValue);
					printStatement = value2.element + " % " + value1.element;
					// System.out.println("New value: " + newValue);
					i++;
				} /*
				 * if the user enters in an integer, the integer is pushed on to the stack
				 */
				else if (Character.isDigit(everything.charAt(i))) {
					int value = Integer.parseInt("" + everything.charAt(i));
					testStack.push(value);
					// testStack.showStructure();
					i++;
				} /*
				 * if the user enters in something is not an integer or an operator,
				 * the program provides an error message and shuts down
				 */
				else {
					System.out.println("Invalid input. Program is shutting down.");
					System.exit(1);
				}

			}
			StackNode finValue = (StackNode) testStack.pop();

			System.out.println(printStatement + " = " + finValue.element);
			// }
			System.out.print("Would you like to evaluate another postfix expression (yes/no): ");
			answer = input.nextLine();
			if (!answer.equals("yes") && (!answer.equals("no"))) {
				System.out.println("Invalid input. Program is shutting down.");
			}
			/*
			 * for (i = 0; i < ) char value = input.charAt(i); if
			 * (Character.isDigit(value)) {
			 * 
			 * 
			 * 
			 * }
			 */

		} while (answer.equals("yes"));
		testStack.showStructure();
		System.out.println("Thank you for using the program. ");
		input.close();
	}

}
