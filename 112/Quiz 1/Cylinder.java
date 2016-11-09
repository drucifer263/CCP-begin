import java.io.*;
import java.util.*;

public class Cylinder
{
	private double radius,height;

	public Cylinder()
	{
		radius=0;
		height=0;

	}

	public void setCylinder(double newRadius, double newHeight)
	{
		radius = newRadius;
		height = newHeight;
	}

	public double getRadius()
	{
		return radius;
	}

	public double getHeight()
	{
		return height;
	}

	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}

	public void setHeight(double newHeight)
	{
		height = newHeight;
	}

	double getArea()
	{
		return (2 * (Math.PI) * (Math.pow(getRadius(),2)) ) + (2 * (Math.PI) * (getRadius()) * (getHeight()) )  ;
	}

	double getVolume()
	{
		return( (Math.PI)*(Math.pow(getRadius(),2)) * (getHeight()) );
	}
}