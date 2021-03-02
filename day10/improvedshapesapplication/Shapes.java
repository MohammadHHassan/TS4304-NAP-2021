package day10.improvedshapesapplication;

public abstract class Shapes
{
	String colour;

	public Shapes(String colour)
	{
		this.colour = colour;
	}
	
	public void editColour(String colour)
	{
		this.colour = colour;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
