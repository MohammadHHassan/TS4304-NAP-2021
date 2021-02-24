package day9.shapesapplication;

import java.text.DecimalFormat;

public class RunProgram
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("#.##");
		
		Circle circle1 = new Circle("Black", 2.5);
		System.out.println("Shape 1: Circle");
		System.out.println("Colour: " + circle1.colour);
		System.out.println("Radius: " + circle1.radius);
		System.out.println("Area = " + df.format(circle1.getArea()));
		System.out.println("Perimeter = " + df.format(circle1.getPerimeter()));
		}
}
