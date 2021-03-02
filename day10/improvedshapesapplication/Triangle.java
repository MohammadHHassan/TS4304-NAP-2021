package day10.improvedshapesapplication;

public class Triangle extends Shapes
{
	double base, height;
	
	public Triangle(String colour, double base, double height)
	{
		super(colour);
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea()
	{
		return 0.5*base*height;
	}

	@Override
	public double getPerimeter()
	{
		double c = Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
		return c+base+height;
	}

	@Override
	public String toString() {
		return "Triangle [ Base = " + base + ", Height = " + height + ", Colour = " + colour + ", Area = " + getArea()
				+ ", Perimeter = " + getPerimeter() + " ]";
	}
	
}
