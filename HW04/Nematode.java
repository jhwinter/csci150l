
/**
 * Nematode.java - Nematode object for the PetriDish class, inherits methods
 * from Organism class The Nematodes behave accordingly: move: every time step,
 * if there is an adjacent cell with an amoeba (up, down, left, or right), then
 * the nematode will move to that cell and consume the amoeba. Otherwise
 * nematodes move according to the same rules as the amoebas. spawn: if a
 * nematode survives for ten time steps, then at the end of the time step it
 * will spawn a new nematode in the same manner as the amoeba. starve: if a
 * nematode has not eaten an amoeba within the last four time steps, the
 * nematode will starve and die, at which time the dead nematode should be
 * removed from the grid.
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework Homework 04 - Simulation
 * @date 27 March 2016
 * @email jtwinters@g.coastal.edu
 */
// import java.awt.Point;
import java.util.Random;

public class Nematode extends Organism {

	// VARIABLES //
	private int stepsToStarve = 0;
	public static final int MAX_STEPS_TILL_SPAWN = 10;
	public static final int MAX_STEPS_TILL_STARVE = 4;

	// CONSTRUCTORS //
	/**
	 * default constructor
	 */
	public Nematode() {
		super();
		// setStepsToSpawn(0);
		setStepsToStarve(0);
		setSymbol('N');
	}

	/**
	 * overloaded constructor
	 * 
	 * @param row1
	 *            integer variable, row the nematode is being stored in
	 * @param col1
	 *            integer variable, column the nematode is being stored in
	 */
	public Nematode(int row1, int col1) {
		super();
		// setStepsToSpawn(0);
		setStepsToStarve(0);
		setRow(row1);
		setCol(col1);
		setSymbol('N');
	}

	// SETTERS //
	/*
	 * sets the stepsToStarve variable to the value being passed in
	 * 
	 * @param stepsToStarve1 integer value
	 */
	public void setStepsToStarve(int stepsToStarve1) {
		stepsToStarve = stepsToStarve1;
	}

	// GETTERS //
	/*
	 * gets the stepsToStarve variable
	 */
	public int getStepsToStarve() {
		return stepsToStarve;
	}

	/*
	 * resets the stepsToStarve variable to 0. increments stepsToSpawn and gets
	 * the new value for stepsToSpawn. sets the hasMoved variable to true.
	 */
	public void consume(int row1, int col1) {
		setStepsToStarve(0);
		setStepsToSpawn(getStepsToSpawn() + 1);
		setRow(row1);
		setCol(col1);
		// setStepsToSpawn(stepsToSpawn--);
		setHasMoved(true);
	}

	/**
	 * if the stepsToStarve variable is greater than or equal to the
	 * MAX_STEPS_TILL_STARVE constant, return true
	 * 
	 */
	public boolean starve() {
		if (getStepsToStarve() >= MAX_STEPS_TILL_STARVE) {
			return true;
		} else {
			return false;
		}
	}

	// INHERITED METHODS //
	/*
	 * sets the hasMoved variable to true. increments the stepsToSpawn variable
	 * and gets the new stepsToSpawn variable. increments the stepsToStarve
	 * variable and gets the new stepsToStarve variable. returns a random
	 * integer
	 */
	public int move() {
		// int direction = (int) Math.random() * 4;
		setHasMoved(true);
		setStepsToSpawn(getStepsToSpawn() + 1);
		// setStepsToSpawn(stepsToSpawn--);
		setStepsToStarve(getStepsToStarve() + 1);
		// setStepsToStarve(stepsToStarve--);
		return new Random().nextInt(4);
	}

	/*
	 * resets the counter for stepsToSpawn to 0. returns a nematode at the
	 * specified row and column
	 */
	@Override
	public void spawnChild() {
		setStepsToSpawn(0);
	}

	public Nematode spawnChild(int row1, int col1) {
		// TODO Auto-generated method stub
		setStepsToSpawn(0);
		return new Nematode(row1, col1);
	}

	/*
	 * public void draw() {
	 * 
	 * }
	 */

}
