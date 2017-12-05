/**
 * CD.java - This method reads in the title, artist, and record label of two
 * CD's and compares them to see if they are equal
 * 
 * 
 * @author Jonathan Winters
 * @course CSCI 150
 * @lab 05 CD.java
 * @email jtwinters@g.coastal.edu
 * @date 16 February 2016
 *
 */
public class CD {

	// constant
	public static final boolean DEBUG = false;
	// variables
	private String title = "no title yet";
	private String artist = "no artist yet";
	private String recordLabel = "no label yet";

	/**
	 * default constructor
	 */
	CD() {
		title = "no title yet";
		artist = "no artist yet";
		recordLabel = "no label yet";
	}

	/**
	 * another constructor that takes in all of the parameters
	 * 
	 * @param title1
	 *            the variable that's passed in to title
	 * @param artist1
	 *            the variable that's passed in to artist
	 * @param recordLabel1
	 *            the variable that's passed in to record label
	 */
	CD(String title1, String artist1, String recordLabel1) {
		title = title1;
		artist = artist1;
		recordLabel = recordLabel1;
	}

	// MUTATORS //

	/**
	 * this method changes the title
	 * 
	 * @param title1
	 *            the variable that's passed in to title
	 */
	public void setTitle(String title1) {
		title = title1;
	}

	/**
	 * this method changes the name of the artist
	 * 
	 * @param artist1
	 *            the variable that's passed in to artist
	 */
	public void setArtist(String artist1) {
		artist = artist1;
	}

	/**
	 * this method changes the name of the record label
	 * 
	 * @param recordLabel1
	 *            the variable that's passed in to recordLabel
	 */
	public void setRecordLabel(String recordLabel1) {
		recordLabel = recordLabel1;
	}

	// ACCESSORS //

	/**
	 * this method gets the title
	 * 
	 * @return returns the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * this method gets the artist name
	 * 
	 * @return returns the name of the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * this method gets the record label name
	 * 
	 * @return returns the name of the recordLabel
	 */
	public String getRecordLabel() {
		return recordLabel;
	}

	// OTHER METHOD //

	/**
	 * this method accepts another CD object as an argument, compares the two
	 * CDs based on the value of their instance variables, and returns a boolean
	 * indicating if their data is equal.
	 */
	public boolean equals(Object otherObj) {
		boolean same = true;

		CD otherCD = (CD) otherObj;
		String otherTitle = otherCD.getTitle();
		String otherArtist = otherCD.getArtist();
		String otherRecordLabel = otherCD.getRecordLabel();

		/*
		 * if the 2nd CD's title does not equal to the first CD's title, then
		 * print out that they don't equal each other
		 */
		if (!otherTitle.equals(title)) {

			if (DEBUG) {
				System.out.println(otherTitle + " does not match " + title);
			}
			same = false;
		}

		/*
		 * if the 2nd CD's artist does not equal to the first CD's artist, then
		 * print out that they don't equal each other
		 */
		if (!otherArtist.equals(artist)) {

			if (DEBUG) {
				System.out.println(otherArtist + " does not match " + artist);
			}
			same = false;
		}

		/*
		 * if the 2nd CD's record label does not equal to the first CD's record
		 * label, then print out that they don't equal each other
		 */
		if (!otherRecordLabel.equals(recordLabel)) {

			if (DEBUG) {
				System.out.println(otherRecordLabel + " does not match " + recordLabel);
			}
			same = false;
		}
		return same;

	}
}
