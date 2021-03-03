package day11.shape2d3dapplication;

import java.text.DecimalFormat;

public abstract class Shape
{
	String colour;

	public Shape(String colour)
	{
		this.colour = colour;
	}
	
	DecimalFormat df = new DecimalFormat("#.##");
}
