package day6.carapplication;

public class Car
{
	String brand;			// 6 Attributes
	String model;
	String colour;
	int numberOfDoors;
	double engineSize;
	int numberOfRadio;
	double currentSpeed=0;
	
	Wheels wheels;
	
	@Override
	public String toString() {
		return "Car:\nBrand = " + brand + "\nModel = " + model + "\nColour = " + colour + "\nNumber Of Doors = " + numberOfDoors
				+ "\nEngine Size = " + engineSize + "\nNumber Of Radio = " + numberOfRadio + "\n";
	}
	
	public void pressAccelerator()		// Behavior
	{
		currentSpeed += 10;
	}
	
	public void pressBrake()
	{
		currentSpeed -= 5;
		
		if(currentSpeed<0)
		{
			currentSpeed=0;
		}
	}
}
