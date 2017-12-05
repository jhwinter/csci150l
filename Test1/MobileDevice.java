/**
 * MobileDevice.java - this class represents the mobile devices that are passed in to it
 * 
 * @author Jonathan Winters
 * @class CSCI 150
 * @labTest 01 - MobileDevice
 * @date  2-25-16
 * @email jtwinters@g.coastal.edu
 */
public class MobileDevice {

	// variables
	private String brand = "no brand yet";
	private String model = "no model yet";
	private int weight = 0;
	
	/*
	 * default constructor
	 */
	public MobileDevice() {
		brand = "no brand yet";
		model = "no model yet";
		weight = 0;
	}
	
	/**
	 * overloaded constructor
	 * @param aBrand device brand that is passed in to the constructor
	 * @param aModel device model that is passed in to the constructor
	 * @param aWeight device weight that is passed in to the constructor
	 */
	public MobileDevice(String aBrand, String aModel, int aWeight) {
		brand = aBrand;
		model = aModel;
		weight = aWeight;
	}
	
	
	// MUTATORS //
	
	/**
	 * this method changes the brand of the device
	 * @param aBrand device brand that is passed in to the method
	 */
	public void setBrand(String aBrand) {
		brand = aBrand;
	}
	
	/**
	 * this method changes the model of the device
	 * @param aModel device model that is passed in to the method
	 */
	public void setModel(String aModel) {
		model = aModel;
	}
	/**
	 * this method changes the weight of the device
	 * @param aWeight device weight that is passed in to the method
	 */
	public void setWeight(int aWeight) {
		if(aWeight >= 0)
		{
			weight = aWeight;
		} else {
			weight = 0;
		}
		
	}
	
	
	
	
	// ACCESSORS //
	
	/**
	 * this method gets the brand of the device
	 * @return returns the brand of the device
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * this method gets the model of the device
	 * @return returns the model of the device
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * this method gets the weight of the device
	 * @return returns the weight of the device
	 */
	public int getWeight() {
		return weight;
	}
	
	// BEHAVIOURAL METHODS //
	
	/**
	 * this method prints out the brand, model, and weight of the device
	 */
	public void printInfo() {
		System.out.print("\nBrand: " + brand);
		System.out.print("\nModel: " + model);
		System.out.print("\nWeight: " + weight);
	}
	
	
	
}
