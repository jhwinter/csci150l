/**
 * Organism.java - Create a base or parent class named Organism that
 * encapsulates basic data that is common to both amoebas and nematodes. This
 * class should have abstract methods for common behaviors that are redefined in
 * the derived classes Amoeba and Nematode.
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework Homework 04 - Simulation
 * @date 27 March 2016
 * @email jtwinters@g.coastal.edu
 */
// import java.awt.Point;

abstract class Organism {

	// VARIABLES //
	/**
	 * boolean variable of whether or not an organism is alive
	 */
	private boolean alive;
	/**
	 * integer variable that keeps track of the number of steps
	 */
	protected int stepsToSpawn;
	/**
	 * integer variable that keeps track of the row
	 */
	protected int row;
	/**
	 * integer variable that keeps track of the column
	 */
	protected int col;
	/**
	 * character symbol for the organism
	 */
	protected char symbol;
	/**
	 * boolean that stores whether or not the organism has moved
	 */
	protected boolean hasMoved;

	// CONSTRUCTORS //

	/**
	 * default constructor
	 */
	public Organism() {
		setAlive(true);
		setStepsToSpawn(0);
		setRow(0);
		setCol(0);
		setSymbol('-');
		setHasMoved(false);
	}

	/**
	 * overloaded constructor
	 * 
	 * @param row1
	 *            integer variable, row the amoeba is being stored in
	 * @param col1
	 *            integer variable, column the amoeba is being stored in
	 * @param symbol1
	 *            character variable, represents the organism
	 * 
	 */
	public Organism(int row1, int col1, char symbol1) {
		setAlive(true);
		setStepsToSpawn(0);
		setRow(row1);
		setCol(col1);
		setSymbol(symbol1);
		setHasMoved(false);

	}

	// ABSTRACT METHODS //
	/**
	 * abstract method that will determine a direction for an organism to move
	 * 
	 * @return returns an integer value
	 */
	abstract int move();

	/**
	 * abstract method that will spawn a child
	 */
	abstract void spawnChild();

	// abstract void draw();

	// SETTERS //

	/**
	 * sets the row = to the value passed in
	 * 
	 * @param row1
	 *            integer value, row the organism will be stored in
	 */
	public void setRow(int row1) {
		row = row1;
	}

	/**
	 * sets the column = to the value passed in
	 * 
	 * @param col1
	 *            integer value, column the organism will be stored in
	 */
	public void setCol(int col1) {
		col = col1;
	}

	/**
	 * sets the stepsToSpawn variable = to the value passed in
	 * 
	 * @param stepsToSpawn1
	 *            integer value, number of time steps that have passed for an
	 *            organism so far until it can spawn
	 */
	public void setStepsToSpawn(int stepsToSpawn1) {
		stepsToSpawn = stepsToSpawn1;
	}

	/**
	 * sets the symbol = to the symbol passed in
	 * 
	 * @param symbol1
	 *            character value, represents the organism
	 */
	public void setSymbol(char symbol1) {
		symbol = symbol1;
	}

	/**
	 * sets the alive variable = to the value passed in
	 * 
	 * @param alive1
	 *            boolean variable, determines whether or not the organism is
	 *            still alive
	 */
	public void setAlive(boolean alive1) {
		alive = alive1;
	}

	/**
	 * sets the hasMoved variable = to the value passed in
	 * 
	 * @param hasMoved1
	 *            boolean variable, determines whether or not the organism has
	 *            moved or not
	 */
	public void setHasMoved(boolean hasMoved1) {
		hasMoved = hasMoved1;
	}

	/*
	 * public void setPosition(int row1, int col1) { row = row1; col = col1; }
	 */

	// GETTERS //
	/**
	 * gets the stepsToSpawn variable
	 * 
	 * @return returns the value stored in stepsToSpawn
	 */
	public int getStepsToSpawn() {
		return stepsToSpawn;
	}

	/**
	 * gets the row variable
	 * 
	 * @return returns the value stored in row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * gets the column variable
	 * 
	 * @return returns the value stored in col
	 */
	public int getCol() {
		return col;
	}

	/*
	 * public Point getPosition() { return position; }
	 */

	/**
	 * gets the symbol variable
	 * 
	 * @return returns the value stored in symbol
	 */
	public char getSymbol() {
		return symbol;
	}

	/**
	 * gets the alive variable
	 * 
	 * @return returns the value stored in alive
	 */
	public boolean getAlive() {
		return alive;
	}

	/**
	 * gets the hasMoved variable
	 * 
	 * @return returns the value stored in hasMoved
	 */
	public boolean getHasMoved() {
		return hasMoved;
	}
}
