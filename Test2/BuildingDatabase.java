
/**
 * BuildingDatabase.java - 
 * 
 * @author Jonathan Winters
 * @course CSCI 150/L
 * @lab Test2 - BuildingDatabase
 * @date 21 April 2016
 * @email jtwinters@g.coastal.edu
 *
 */
import java.util.ArrayList;

public class BuildingDatabase {
	/**
	 * list of Building objects
	 */
	private ArrayList<Building> buildings = new ArrayList<Building>();

	/**
	 * default constructor
	 */
	public BuildingDatabase() {
		// TODO Auto-generated constructor stub
		buildings = new ArrayList<Building>();
	}

	/**
	 * adds the specified Building to the array list
	 * 
	 * @param aBuilding
	 */
	public void addBuilding(Building aBuilding) {
		buildings.add(aBuilding);
	}

	/**
	 * removes the specified Building from the array list
	 * 
	 * @param aBuilding
	 * @return
	 * @throws EmptyDatabaseException
	 */
	public Building removeBuilding(Building aBuilding) throws EmptyDatabaseException {
		if (buildings.isEmpty()) {
			throw new EmptyDatabaseException();
		} else {
			for (int i = 0; i < buildings.size(); i++) {
				if (buildings.get(i).equals(aBuilding)) {
					buildings.remove(aBuilding);
				}
			}
			// buildings.remove(aBuilding);
		}
		return aBuilding;
	}

	/**
	 * searches the BuildingDataBase by comparing the name of all buildings and
	 * prints the name of the city of the building that matches the searchName.
	 * 
	 * @param searchName
	 * @throws EmptyDatabaseException
	 */
	public void showBuildingInfo(String searchName) throws EmptyDatabaseException {
		if (buildings.isEmpty()) {
			throw new EmptyDatabaseException();
		}
		/*
		 * loops through the array list looking for the building that has the
		 * name specified by the user
		 */
		for (int i = 0; i < buildings.size(); i++) {
			if (buildings.get(i).getName().equals(searchName)) {
				System.out.println("City building is located in: " + buildings.get(i).getCity());
				return;
			}
		}
	}

	public void showAll() throws EmptyDatabaseException {
		if (buildings.isEmpty()) {
			throw new EmptyDatabaseException();
		}
		/*
		 * loops through the array list printing out every building's name and
		 * city
		 */
		for (int i = 0; i < buildings.size(); i++) {
			if (buildings.get(i) instanceof Building) {
				System.out.println("Building name: " + buildings.get(i).getName());
				System.out.println("Building city: " + buildings.get(i).getCity());
			}
		}
	}

	public void printBuildingWithMostFloors() throws EmptyDatabaseException {
		if (buildings.isEmpty()) {
			throw new EmptyDatabaseException();
		}
		int greatestNumberOfFloors = 0;
		/**
		 * loops through the array list looking for the greatest number of
		 * floors
		 */
		for (int i = 0; i < buildings.size(); i++) {
			if (buildings.get(i) instanceof Building) {
				if (greatestNumberOfFloors < buildings.get(i).getNumberOfFloors()) {
					greatestNumberOfFloors = buildings.get(i).getNumberOfFloors();
				}
			}
		}
		/*
		 * loops through the array list looking for the buildings with the
		 * greatest number of floors and prints the building's name and city out
		 * to the console
		 */
		for (int j = 0; j < buildings.size(); j++) {
			if (buildings.get(j) instanceof Building) {
				if (buildings.get(j).getNumberOfFloors() == greatestNumberOfFloors) {
					System.out.println("Building name: " + buildings.get(j));
					System.out.println("Building city: " + buildings.get(j));
				}
			}
		}
	}

}
