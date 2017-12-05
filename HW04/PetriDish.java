
/**
 * PetripetriDish.dish.java - this program manages the petri petriDish.dish
 * which houses all of the organisms. moves all of the Nematodes and Amoebas.
 * updates the contents in the petri petriDish.dish. contains the main method
 * which is used to test the other classes/methods.
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @homework Homework 04 - Simulation
 * @date 27 March petriDish.dish.length16
 * @email jtwinters@g.coastal.edu
 */
// import java.util.Random;

public class PetriDish {

	// VARIABLES //
	/**
	* starting number of amoebas
	*/
	public static final int STARTING_AMOEBAS = 100;
	/**
	* starting number of nematodes
	*/
	public static final int STARTING_NEMATODES = 5;
	/**
	* number for left
	*/
	public static final int LEFT = 0;
	/**
	* number for up
	*/
	public static final int UP = 1;
	/**
	* number for right
	*/
	public static final int RIGHT = 2;
	/*
	* number for down
	*/
	public static final int DOWN = 3;

	// Random randomGenerator = new Random();
	
	/**
	* Petri Dish object used in this class file
	*/
	public static PetriDish petriDish = new PetriDish();
	/**
	* array that houses all of the organisms
	*/
	private Organism[][] dish;
	// CONSTRUCTORS //
	/**
	* default constructor
	*/
	public PetriDish() {
		dish = new Organism[20][20];
	}

	/**
	 * entry point to the program
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		// boolean aliveO = true;
		int timeStep = 0; // current timeStep
		drawAllOrganisms(); // initializes the array
		boolean update = true; // updates the petriDish.dish array
		/*
		 * while aliveA and aliveN are both > 0, the loop will continue
		 */
		do {
			/*
			 * this try catch block delays the program after each time step
			 */
			try {
				Thread.sleep(2000); // 2 second delay

				System.out.println();
				timeStep++;
				System.out.println("Time step: " + timeStep);
				update = update();
				// update(); // prints out the array

				moveAllNematodes(); // moves all of the Nematodes

				moveAllAmoebas(); // moves all of the Amoebas

			} catch (InterruptedException ie) {
				System.out.println("InterruptedException should not have occurred.");
			}
		} while (update == true);
		System.out.println("Thank you for running the simulation. Have a nice day.");
		System.exit(1);
	}

	/*
	 * public static void main(String[] args) { drawAllOrganisms(); update(); }
	 */

	/*
	 * public PetripetriDish.dish(Organism[][] petriDish.dish1) { petriDish.dish
	 * = petriDish.dish1; }
	 */

	/**
	 * prints the contents of the array to the console
	 * 
	 */

	/**
	 * initializes the array by putting in 100 Amoebas and 5 nematodes
	 */
	public static void drawAllOrganisms() {
		// int randomRow = new Random().nextInt(4);
		// int randomCol = new Random().nextInt(4);
		int nemCounter = 0;
		int amCounter = 0;

		while (nemCounter < STARTING_NEMATODES) {
			int randomRow = (int) (Math.random() * petriDish.dish.length);
			int randomCol = (int) (Math.random() * petriDish.dish.length);
			if (petriDish.dish[randomRow][randomCol] == null) {
				nemCounter++;
				petriDish.dish[randomRow][randomCol] = new Nematode();
			}
		}

		while (amCounter < STARTING_AMOEBAS) {
			int randomRow = (int) (Math.random() * petriDish.dish.length);
			int randomCol = (int) (Math.random() * petriDish.dish.length);
			if (petriDish.dish[randomRow][randomCol] == null) {
				amCounter++;
				petriDish.dish[randomRow][randomCol] = new Amoeba();

			}
		}
	}

	/**
	 * updates the contents of the array and keeps track of the number of
	 * nematodes and amoebas. program quits if the number of nematodes or
	 * amoebas drops down to zero
	 */
	public static boolean update() {
		int nemCounter = 0;
		int amCounter = 0;
		for (int i = 0; i < petriDish.dish.length; i++) {
			for (int j = 0; j < petriDish.dish[i].length; j++) {

				if (petriDish.dish[i][j] instanceof Amoeba) {
					System.out.print(" " + petriDish.dish[i][j].getSymbol() + " ");
					amCounter++;
				} else if (petriDish.dish[i][j] instanceof Nematode) {
					System.out.print(" " + petriDish.dish[i][j].getSymbol() + " ");
					nemCounter++;
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();

		}
		System.out.println("\nNematode count: " + nemCounter);
		System.out.println("Amoeba count: " + amCounter);
		if (nemCounter == 0) {
			System.out.println("All nematodes are dead. Simulation over.");
			return false;
		}
		if (amCounter == 0) {
			System.out.println("All amoebas are dead. Simulation over.");
			return false;
		}
		return true;
	}

	/**
	 * this method moves all Nematodes
	 */
	public static void moveAllNematodes() {
		int direction = 0;
		/*
		 * loops through the petriDish.dish looking for nematodes
		 */
		for (int row = 0; row < petriDish.dish.length; row++) {
			for (int col = 0; col < petriDish.dish[row].length; col++) {

				/*
				 * if anything inside the try block tries to go outside of the
				 * bounds of the array, catch it and set
				 * petriDish.dish[row][col] equal to itself
				 */
				// try {

				/*
				 * check to see if the contents of petriDish.dish[row][col] is
				 * an instance of a nematode. if so, check if it has already
				 * moved or not. if it hasn't already moved, check to see if
				 * there are any amoeba's to the left, above, right, or below
				 * the nematode. if there are, consume the first amoeba found.
				 * if there are no nearby amoebas, generate a random number that
				 * will determine the nematode's direction and move it to that
				 * location as long as that location is null
				 */
				if (petriDish.dish[row][col] instanceof Nematode) {
					Nematode nematode1 = (Nematode) petriDish.dish[row][col];
					nematode1.setRow(row);
					nematode1.setCol(col);
					// Nematode nematode1 = (Nematode)
					if (nematode1.getHasMoved() == false) {
						if (col - 1 >= 0) {
							if (petriDish.dish[row][col - 1] instanceof Amoeba) {
								nematode1.consume(row, col - 1);
								petriDish.dish[row][col - 1] = nematode1;
								nematode1 = (Nematode) petriDish.dish[row][col - 1];
								// Nematode nematode1A = (Nematode)
								// petriDish.dish[row][col - 1];
								// nematode1.consume();
								// nematode1A.consume();
								petriDish.dish[row][col] = null;
							}
						}
						if (row - 1 >= 0) {
							if (nematode1.getHasMoved() == false) {
								if (petriDish.dish[row - 1][col] instanceof Amoeba) {
									nematode1.consume(row - 1, col);
									petriDish.dish[row - 1][col] = nematode1;
									// nematode1 = (Nematode) petriDish.dish[row
									// -
									// 1][col];
									// Nematode nematode1A = (Nematode)
									// petriDish.dish[row -
									// 1][col];
									// nematode1A.consume();
									// nematode1.consume();
									petriDish.dish[row][col] = null;
								}
							}

						}
						if (col + 1 < petriDish.dish.length) {
							if (nematode1.getHasMoved() == false) {
								if (petriDish.dish[row][col + 1] instanceof Amoeba) {
									nematode1.consume(row, col + 1);
									petriDish.dish[row][col + 1] = nematode1;
									/// nematode1 = (Nematode)
									/// petriDish.dish[row][col + 1];
									// Nematode nematode1A = (Nematode)
									// petriDish.dish[row][col + 1];
									// nematode1.consume();
									// nematode1.consume();
									petriDish.dish[row][col] = null;
								}
							}

						}
						if (row + 1 < petriDish.dish.length) {
							if (nematode1.getHasMoved() == false) {
								if (petriDish.dish[row + 1][col] instanceof Amoeba) {
									nematode1.consume(row + 1, col);
									petriDish.dish[row + 1][col] = nematode1;
									// nematode1 = (Nematode) petriDish.dish[row
									// +
									// 1][col];
									// nematode1.setRow(row + 1);
									// nematode1.setCol(col);
									// Nematode nematode1A = (Nematode)
									// petriDish.dish[row +
									// 1][col];
									// nematode1A.consume();
									// nematode1.consume();
									petriDish.dish[row][col] = null;
								}
							}

						}

						/**
						 * if nematode1 has not consumed an amoeba yet,
						 * direction will randomly generate a number and
						 * nematode will move into that spot as long as it is
						 * null
						 */
						if (nematode1.getHasMoved() == false) {
							direction = nematode1.move();
							// direction = (int) Math.random() * 4;
							switch (direction) {

							case LEFT:
								if (col - 1 >= 0) {
									if (petriDish.dish[row][col - 1] == null) {
										petriDish.dish[row][col - 1] = nematode1;
										petriDish.dish[row][col] = null;
										nematode1 = (Nematode) petriDish.dish[row][col - 1];
										nematode1.setRow(row);
										nematode1.setCol(col - 1);
									} else {
										petriDish.dish[row][col] = petriDish.dish[row][col];
									}
								}
								break;
							case UP:
								if (row - 1 >= 0) {
									if (petriDish.dish[row - 1][col] == null) {
										petriDish.dish[row - 1][col] = nematode1;
										petriDish.dish[row][col] = null;
										nematode1 = (Nematode) petriDish.dish[row - 1][col];
										nematode1.setRow(row - 1);
										nematode1.setCol(col);
									} else {
										petriDish.dish[row][col] = petriDish.dish[row][col];
									}
								}
								break;
							case RIGHT:
								if (col + 1 < petriDish.dish.length) {
									if (petriDish.dish[row][col + 1] == null) {
										petriDish.dish[row][col + 1] = nematode1;
										petriDish.dish[row][col] = null;
										nematode1 = (Nematode) petriDish.dish[row][col + 1];
										nematode1.setRow(row);
										nematode1.setCol(col + 1);
									} else {
										petriDish.dish[row][col] = petriDish.dish[row][col];
									}
								}
								break;
							case DOWN:
								if (row + 1 < petriDish.dish.length) {
									if (petriDish.dish[row + 1][col] == null) {
										petriDish.dish[row + 1][col] = nematode1;
										petriDish.dish[row][col] = null;
										nematode1 = (Nematode) petriDish.dish[row + 1][col];
										nematode1.setRow(row + 1);
										nematode1.setCol(col);
									} else {
										petriDish.dish[row][col] = petriDish.dish[row][col];
									}
								}
								break;
							default:
								petriDish.dish[row][col] = petriDish.dish[row][col];

							}
						}

						/*
						 * else { petriDish.dish[row][col] =
						 * petriDish.dish[row][col]; }
						 */

						// }
						/*
						 * if the contents of petriDish.dish[row][col] is a
						 * Nematode, then check to see if the Nematode is ready
						 * for fission. if the Nematode is ready for fission,
						 * generate a random number and spawn a child nematode
						 *
						 */
						// if (petriDish.dish[row][col] instanceof Nematode)
						// {
						// nematode1 = (Nematode) petriDish.dish[row][col];
						// }
						/*
						 * } catch (ArrayIndexOutOfBoundsException aioobe) {
						 * petriDish.dish[row][col] = petriDish.dish[row][col];
						 * 
						 * }
						 */
						// try {
						// if (petriDish.dish[row][col] instanceof Nematode) {

						// Nematode nematode1 = (Nematode)
						// petriDish.dish[row][col];
						// nematode1.setRow(row);
						// nematode1.setCol(col);

						/**
						 * if nematode1 is ready to spawn, direction will
						 * randomly generate a number for the direction. then
						 * the new amoeba will be spawned in the new location as
						 * long as it is null
						 */
						if (nematode1.getStepsToSpawn() >= Nematode.MAX_STEPS_TILL_SPAWN) {
							// direction = (int) Math.random() * 4;
							// direction = nematode1.move();
							if (col - 1 >= 0) {
								if (petriDish.dish[row][col - 1] == null) {

									// Nematode nematode2 = (Nematode)
									// petriDish.dish[row][col - 1];
									// nematode1.spawnChild(row, col - 1);
									petriDish.dish[row][col - 1] = nematode1.spawnChild(row, col - 1);
								}
							}
							if (row - 1 >= 0) {
								if (petriDish.dish[row - 1][col] == null) {
									// Nematode nematode2 = (Nematode)
									// petriDish.dish[row
									// - 1][col];
									// nematode1.spawnChild();
									petriDish.dish[row - 1][col] = nematode1.spawnChild(row - 1, col);
								}
							}
							if (col + 1 < petriDish.dish.length) {
								if (petriDish.dish[row][col + 1] == null) {
									// Nematode nematode2 = (Nematode)
									// petriDish.dish[row][col + 1];
									// nematode1.spawnChild();
									petriDish.dish[row][col + 1] = nematode1.spawnChild(row, col + 1);
								}
							}
							if (row + 1 < petriDish.dish.length) {
								if (petriDish.dish[row + 1][col] == null) {
									// Nematode nematode2 = (Nematode)
									// petriDish.dish[row
									// nematode1.spawnChild();
									petriDish.dish[row + 1][col] = nematode1.spawnChild(row + 1, col);
								}
							} else {
								petriDish.dish[row][col] = petriDish.dish[row][col];
							}

							/*
							 * switch (direction) {
							 * 
							 * case LEFT:
							 * 
							 * break;
							 * 
							 * case UP:
							 * 
							 * break; case RIGHT:
							 * 
							 * break; case DOWN:
							 * 
							 * break; default: petriDish.dish[row][col] =
							 * petriDish.dish[row][col]; } }
							 */

							/*
							 * if (direction == up) {
							 * 
							 * }
							 * 
							 * if (direction == right) {
							 * 
							 * }
							 * 
							 * if (direction == down) {
							 * 
							 * } else { petriDish.dish[row][col] =
							 * petriDish.dish[row][col]; }
							 * nematode1.setStepsToSpawn(0);
							 */

						}
						// nematode1 = (Nematode) petriDish.dish[row][col]
						/*
						 * else { petriDish.dish[row][col] =
						 * petriDish.dish[row][col]; }
						 */
						// }
						/*
						 * check to see if nematode1 is starving, if so, remove
						 * it from the grid
						 */

						/*
						 * } catch (ArrayIndexOutOfBoundsException aioobe) {
						 * petriDish.dish[row][col] = petriDish.dish[row][col];
						 * 
						 * }
						 */
						// try {

						/*
						 * if nematode1 is a Nematode, set it's hasMoved
						 * variable to false
						 */
						if (nematode1 instanceof Nematode) {
							// nematode1 = (Nematode) petriDish.dish[row][col];
							nematode1.setHasMoved(false);
						}
					}
				}
				/*
				 * } catch (ArrayIndexOutOfBoundsException aioobe) {
				 * petriDish.dish[row][col] = petriDish.dish[row][col];
				 * 
				 * }
				 */

				/*
				 * loops through the array and removes all starving nematodes
				 */
				for (int row2 = 0; row2 < petriDish.dish.length; row2++) {
					for (int col2 = 0; col2 < petriDish.dish[row2].length; col2++) {
						if (petriDish.dish[row2][col2] instanceof Nematode) {
							Nematode nematode2 = (Nematode) petriDish.dish[row2][col2];
							if (nematode2.starve() == true) {
								petriDish.dish[row2][col2] = null;
							}
						}
					}
				}

			}
		}

	}

	/**
	 * this method moves all the amoebas
	 */
	public static void moveAllAmoebas() {
		int direction;

		/*
		 * loop through the array searching for Amoebas
		 */
		for (int row = 0; row < petriDish.dish.length; row++) {
			for (int col = 0; col < petriDish.dish[row].length; col++) {
				/*
				 * if anything tries to go out of bounds of the array, catch it
				 * with an exception
				 */
				 
				//try {
				
					/*
					 * check to see if the contents of petriDish.dish[row][col]
					 * is an instance of an Amoeba. if so, check if it has
					 * already moved or not. if it hasn't already moved,
					 * generate a random number that will determine it's
					 * direction and move it to that location as long as that
					 * location is null
					 */
					if (petriDish.dish[row][col] instanceof Amoeba) {
						Amoeba amoeba1 = (Amoeba) petriDish.dish[row][col];
						if (amoeba1.getHasMoved() == false) {
							// direction = (int) Math.random() * 4;
							direction = amoeba1.move();
							switch (direction) {
							case LEFT:
								if (col - 1 >= 0) {
									if (petriDish.dish[row][col - 1] == null) {
										petriDish.dish[row][col - 1] = amoeba1;
										amoeba1 = (Amoeba) petriDish.dish[row][col - 1];
										amoeba1.setRow(row);
										amoeba1.setCol(col - 1);
										petriDish.dish[row][col] = null;
									}
								}

								break;
							case UP:
								if (row - 1 >= 0) {
									if (petriDish.dish[row - 1][col] == null) {
										petriDish.dish[row - 1][col] = amoeba1;
										amoeba1 = (Amoeba) petriDish.dish[row - 1][col];
										amoeba1.setRow(row - 1);
										amoeba1.setCol(col);
										petriDish.dish[row][col] = null;
									}
								}

								break;
							case RIGHT:
								if (col + 1 < petriDish.dish.length) {
									if (petriDish.dish[row][col + 1] == null) {
										petriDish.dish[row][col + 1] = amoeba1;
										amoeba1 = (Amoeba) petriDish.dish[row][col + 1];
										amoeba1.setRow(row);
										amoeba1.setCol(col + 1);
										petriDish.dish[row][col] = null;
									}
								}

								break;
							case DOWN:
								if (row + 1 < petriDish.dish.length) {
									if (petriDish.dish[row + 1][col] == null) {
										petriDish.dish[row + 1][col] = amoeba1;
										amoeba1 = (Amoeba) petriDish.dish[row + 1][col];
										amoeba1.setRow(row + 1);
										amoeba1.setCol(col);
										petriDish.dish[row][col] = null;

									}
								}

								break;
							default:
								petriDish.dish[row][col] = petriDish.dish[row][col];
							}
							/*
							 * else { petriDish.dish[row][col] =
							 * petriDish.dish[row][col]; }
							 */
						}
						/*
						 * check to see if the contents of
						 * petriDish.dish[row][col] is an amoeba. if so, check
						 * to see if it is ready to go through the process of
						 * fission. if so, check to see if there is an empty
						 * spot either left, up, right, or below the original
						 * amoeba and spawn the child in the first null spot
						 * found
						 */
						if (amoeba1.getStepsToSpawn() >= Amoeba.MAX_STEPS_TILL_SPAWN) {
							// direction = (int) Math.random() * 4;
							// direction = petriDish.dish[row][col].move();
							if (col - 1 >= 0) {
								if (petriDish.dish[row][col - 1] == null) {
									// amoeba1.spawnChild();
									petriDish.dish[row][col - 1] = amoeba1.spawnChild(row, col - 1);
								}
							}
							if (row - 1 >= 0) {
								if (petriDish.dish[row - 1][col] == null) {
									// amoeba1.spawnChild();
									petriDish.dish[row - 1][col] = amoeba1.spawnChild(row - 1, col);
								}
							}
							if (col + 1 < petriDish.dish.length) {
								if (petriDish.dish[row][col + 1] == null) {
									// amoeba1.spawnChild();
									petriDish.dish[row][col + 1] = amoeba1.spawnChild(row, col + 1);
								}
							}
							if (row + 1 < petriDish.dish.length) {
								if (petriDish.dish[row + 1][col] == null) {
									// amoeba1.spawnChild();
									petriDish.dish[row + 1][col] = amoeba1.spawnChild(row + 1, col);
								}
							}
							/*
							 * else { petriDish.dish[row][col] =
							 * petriDish.dish[row][col]; }
							 */
						}

						if (amoeba1 instanceof Amoeba) {
							// amoeba1 = (Amoeba) petriDish.dish[row][col];
							amoeba1.setHasMoved(false);
						}

					}
					/*
					 * check to see if petriDish.dish[row][col] contains an
					 * amoeba. if so, set the amoeba's hasMoved variable to
					 * false
					 */

				/*} catch (

				ArrayIndexOutOfBoundsException aioobe)

				{
					petriDish.dish[row][col] = petriDish.dish[row][col];
				} */
			}
		}
	}
}
