package day9.shapesapplication;

public class Triangle extends Shapes
{
	double base, height;
	
	public Triangle(String colour, double base, double height)
	{
		super(colour);
		this.base = base;
		this.height = height;
	}
	
	public double getArea()
	{
		return 0.5*base*height;
	}
	
	public double getPerimeter()
	{
		double c = Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
		return base+height+c;
	}
}
