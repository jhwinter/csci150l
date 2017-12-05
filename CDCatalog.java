/**
 * CDCatalog.java - This program takes CD objects from CD.java and stores them
 * in an array
 * 
 * @author Jonathan Winters
 * @course CSCI 150
 * @lab 6 CDCatalog
 * @email jtwinters@g.coastal.edu
 * @date 18 February 2016
 *
 */
public class CDCatalog {

	// variables
	private int count = 0;
	private String catalogName;
	private CD[] catalog;

	/**
	 * default constructor
	 */
	CDCatalog() {
		catalogName = "no name yet";
		catalog = new CD[CDLibrary.DEFAULT_SIZE];
	}

	/**
	 * second constructor that accepts a value for "name" variable
	 * 
	 * @param name1
	 *            name of the CD
	 */
	CDCatalog(String name1, int size1) {
		setCDCatalogName(catalogName);
		catalog = new CD[size1];

	}

	// MUTATORS //

	/**
	 * this method accepts a new name for this CDCatalog and sets the name for
	 * the Catalog
	 * 
	 * @param catalogName1
	 *            the catalog name that is passed in to the method
	 */
	public void setCDCatalogName(String catalogName1) {
		catalogName = catalogName1;
	}

	/**
	 * accepts a CD to add to the catalog and adds it
	 * 
	 * @param addCD
	 *            the CD that is to be added to the catalog
	 */

	public void add(CD addCD) {
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i] == null) {
				catalog[i] = addCD;
				System.out.println("\nAdded.");
				return;
			}
			// i++;
		}
	}// count++ //return
		// count; /count = 0; while (count < catalog.length) { if
		// (catalog[count]
		// == null) { catalog[count] = aCD; count++; } } }

	/**
	 * accepts a CD to remove from the catalog and removes it if it exists
	 * 
	 * @param cdToRemove
	 *            the CD that is to be removed from the catalog
	 */

	public void remove(CD cdToRemove) {
		String title = cdToRemove.getTitle();
		String artist = cdToRemove.getArtist();
		String recordLabel = cdToRemove.getRecordLabel();
		//boolean found = false;
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i] != null) {
				/*found = findCD(cdToRemove);
				if (found = true) {
					System.out.println("\nRemoved.");
					System.out.println();
					return;
				} else {
					return;
				}*/
				if (catalog[i].getTitle().equals(title) && catalog[i].getArtist().equals(artist)
						&& catalog[i].getRecordLabel().equals(recordLabel)) {
					catalog[i] = null;
					System.out.println("\nRemoved.");
					System.out.println();
					return;
				} else {
					System.out.println("\nThe CD does not exist in the Catalog...nothing removed.");
					return;
				}
			}
		}
	}

	// ACCESSORS //

	/**
	 * this method returns the name of the CD Catalog
	 * 
	 * @return returns the name of the CD Catalog
	 */
	public String getCDCatalogName() {
		return catalogName;
	}

	/**
	 * this method takes the int index and returns the corresponding CD object
	 * if it exists
	 * 
	 * @param i
	 *            the index
	 * @return returns the object stored in the catalog at the index place or
	 *         null if it does not exist
	 */
	public CD getCD(int i) {
		if (catalog[i] != null) {
			return catalog[i];
		} else {
			return null;
		}
	}

	// Other Methods //

	/**
	 * determines the number of CD objects that are present in the Catalog and
	 * returns it
	 * 
	 * @return returns the number of CD objects that are present in the Catalog
	 */
	public int countCDs() {
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i] != null) {
				count++;
			}
		}
		return count;
	}

	/**
	 * determines the number of null places in the Catalog array and returns it
	 * 
	 * @return returns the number of null spots in the array
	 */
	public int countNonCDs() {
		int noneCount = 0;
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i] == null) {
				noneCount++;
			}
		}
		return noneCount;
	}

	/**
	 * accepts a CD object and determines if it is present in the CDCatalog
	 * 
	 * @param aCD
	 *            the CD object that is passed in to the method
	 * @return returns whether or not the CD was found
	 */
	public boolean findCD(CD aCD) {
		String title = aCD.getTitle();
		String artist = aCD.getArtist();
		String recordLabel = aCD.getRecordLabel();
		boolean found = false;
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i].getTitle().equals(title) && catalog[i].getArtist().equals(artist)
					&& catalog[i].getRecordLabel().equals(recordLabel)) {
				System.out.println("\nThe CD has been found at " + catalog[i]);
				System.out.println();
				found = true;
				return found;
			} else {
				System.out.println("\nThe CD does not exist in the Catalog");
			}
		}
		return found;
	}

	// BEHAVIORAL //

	/**
	 * displays the contents of the CDs in the Catalog
	 */

	public void printAll() {
		System.out.println("\nCD's in " + catalogName + ": ");
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i] != null) {
				System.out.println("\n" + catalog[i].getTitle() + ", " + catalog[i].getArtist() + ", "
						+ catalog[i].getRecordLabel());
			}
		}
	}

	/**
	 * displays the contents of all the CDs with the same artist
	 * 
	 * @param aCD
	 *            the CD that the user passes in to the method
	 */
	public void printAllArtist(CD aCD) {
		String artist = aCD.getArtist();
		System.out.println("\nCD's by " + artist + " in " + catalogName + ": ");
		for (int i = 0; i < CDLibrary.DEFAULT_SIZE; i++) {
			if (catalog[i] != null && catalog[i].getArtist().equals(artist)) {
				System.out.println("\n" + catalog[i].getTitle() + ", " + catalog[i].getArtist() + ", "
						+ catalog[i].getRecordLabel());
			}
		}
	}
}
