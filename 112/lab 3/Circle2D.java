/*

	Drew Watson

	UML Diagram

	Circle2D
	---------------------------------------------------------
	-x: double
	-y: double
	-radius: double
	---------------------------------------------------------
	+getX(): double
	+getY(): double
	+getRadius(): double
	+Circle2D()
	+Circle2D(x: double, y: double, radius: double)
	+setCircle2D(x: double, y: double, radius: double): void
	+getArea(): double
	+getPerimeter(): double
	+contains(x: double, y: double): boolean
	+contains(circle: Object): boolean
	+overlaps(circle: Object): boolean
*/

import java.io.*;
import java.util.*;

public class Circle2D
{
	private double x = 0, y = 0, radius = 0;

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getRadius()
	{
		return radius;
	}

	public Circle2D()
	{
		this(0, 0, 1);
	}

	public Circle2D(double x, double y, double radius)
	{
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	public void setCircle2D(double x, double y, double radius)
	{
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	public double getArea()
	{
			return getRadius() * getRadius() * Math.PI;
	}

	public double getPerimeter()
	{

		return 2 * Math.PI * getRadius();
	}


	public boolean contains(double x, double y)
	{
		boolean contains = false;
		double circlex = getX();
		double circley = getY();
		double circler = getRadius();
		double distance = 0;

		distance = Math.pow((Math.pow((x - circlex),2) + Math.pow((y - circley),2)), 0.5);

		if(distance < circler)
			{
				contains = true;
			}

		return contains;
	}


	public boolean contains(Circle2D circle)
	{
		boolean containC = false;
		double distance = 0;

		distance = Math.pow((Math.pow((circle.getX() - getX()), 2)) + (Math.pow((circle.getY() - getY()), 2)), 0.5);

		if(distance <= (Math.abs( getRadius() - circle.getRadius())))
				{
					containC = true;
				}

		return containC;
	}

	public boolean overlaps(Circle2D circle)
	{
		boolean overlap = false;
		double distance = 0;

		distance = Math.pow( Math.pow( (circle.getX() - getX()), 2) + (Math.pow(circle.getY() - getY(), 2)), 0.5);

		if(distance < Math.abs((circle.getRadius() + getRadius())))
		{
			overlap = true;
		}

		return overlap;
	}


}