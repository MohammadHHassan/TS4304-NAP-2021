package day9.shapesapplication;

public class Square extends Shapes
{
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}
	
	public double getArea()
	{
		return Math.pow(side, 2);
	}
	
	public double getPerimeter()
	{
		return 4*side;
	}
}
