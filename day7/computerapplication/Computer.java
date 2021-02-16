package day7.computerapplication;

public class Computer
{
	String operatingSystem;		// Instance variable
	boolean powerState;			// Instance variable
	
	public Computer(String operatingSystem)	// Parameter variable
	{
		this.operatingSystem = operatingSystem;
		shutDown();
	}
	
	public void shutDown()
	{
		powerState = false;
	}
	
	public void bootUp()
	{
		powerState = true;
	}
}
