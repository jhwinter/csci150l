/**
 * Amoeba.java - Amoeba object for the PetriDish class, inherits methods from
 * Organism The Amoeba behave accordingly: move: every time step, randomly try
 * to move up, down, left, or right. If the neighboring cell in the selected
 * direction is occupied or would move the amoeba off of the grid, then the
 * amoeba stays in its current cell. spawn: if an amoeba survives for four time
 * steps, then at the end of the step (after attempting to move) the amoeba will
 * reproduce by fission (splitting into two daughter amoebas). This is simulated
 * by creating a new amoeba in an adjacent cell (up, down, left, or right) that
 * is empty. If there is no cell available, then fission can not occur. Once the
 * amoeba has split, neither of the daughter amoebas can go through the fission
 * process until four more time steps have elapsed.
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @Homework HW 04 - Simulation
 * @date 27 March 2016
 * @email jtwinters@g.coastal.edu
 */

// import java.awt.Point;
import java.util.Random;

public class Amoeba extends Organism {

	// CONSTANTS //

	/**
	 * Constant variable for the maximum number of steps an amoeba can take
	 * until it spawns a child
	 */
	public static final int MAX_STEPS_TILL_SPAWN = 4;

	// CONSTRUCTORS //
	/**
	 * default constructor
	 */
	public Amoeba() {
		super();
		// setStepsToSpawn(0);
		setSymbol('@');
	}

	/**
	 * overloaded constructor
	 * 
	 * @param row1
	 *            integer variable, row the amoeba is being stored in
	 * @param col1
	 *            integer variable, column the amoeba is being stored in
	 */
	public Amoeba(int row1, int col1) {
		super();
		// setStepsToSpawn(0);
		setRow(row1);
		setCol(col1);
		setSymbol('@');
	}

	// OTHER INHERITED METHODS //
	/**
	 * sets the hasMoved variable to true. increments the stepsToSpawn variable.
	 * and return a random number.
	 */
	public int move() {
		// int direction = (int) Math.random() * 4;
		setHasMoved(true);
		setStepsToSpawn(getStepsToSpawn() + 1);
		// setStepsToSpawn(stepsToSpawn--);
		return new Random().nextInt(4);
	}

	/**
	 * sets the stepsToSpawn variable to 0. returns an Amoeba with the specified
	 * row and column it's being stored to in the array
	 */
	@Override
	public void spawnChild() {
		setStepsToSpawn(0);
	}

	public Amoeba spawnChild(int row1, int col1) {
		setStepsToSpawn(0);
		return new Amoeba(row1, col1);
	}

	/*
	 * public void draw() {
	 * 
	 * }
	 */
}
