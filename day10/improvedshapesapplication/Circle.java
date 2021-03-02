package day10.improvedshapesapplication;

import java.text.DecimalFormat;

public class Circle extends Shapes
{
	double radius;
	
	DecimalFormat df = new DecimalFormat("#.#");
	
	public Circle(String colour, double radius)
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}

	@Override
	public String toString()
	{
		return "Circle [ Radius = " + radius + ", Colour = " + colour + ", Area = "
				+ df.format(getArea()) + ", Perimeter = " + df.format(getPerimeter()) + " ]";
	}
}
