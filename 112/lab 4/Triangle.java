/*
UML

Triangle
-------------------------
-side1: double
-side2: double
-side3: double
-------------------------
+Triangle()
+Triangle(side1: double, side2: double, side3: double)
+setTriangle(side1: double, side2: double, side3: double):void
+getSide1(): double
+getSide2(): double
+getSide3(): double
+getArea(): double
+getPerimeter(): double
+isTriangle():void
+toString(): String

*/

import java.io.*;
import java.util.*;

public class Triangle extends GeometricObject
{
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0 ;

	public Triangle()
	{
		this(1.0, 1.0, 1.0);
	}

	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void setTriangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1()
	{
		return side1;
	}

	public double getSide2()
	{
		return side2;
	}

	public double getSide3()
	{
		return side3;
	}

	public double getArea()
	{
		double a,b,c,s,area;

		a = getSide1();
		b = getSide2();
		c = getSide3();

		s =(a + b + c)/2;

		area = Math.pow(s * ((s - a) * (s - b) * (s - c)),.5);

		return area;
	}

	public double getPerimeter()
	{
		double a,b,c,p;

		a = getSide1();
		b = getSide2();
		c = getSide3();

		p = a + b + c;

		return p;
	}

	public void isTriangle()
	{
		double a,b,c;

		a = getSide1();
		b = getSide2();
		c = getSide3();


		if(a == 0 && b == 0 && c == 0)
		{
			System.out.println("You do not have a triangle");
		}
		else if(a + c < b  )
		{
			System.out.println("You do not have a triangle");
		}

		else if (a + b < c)
		{
			System.out.println("You do not have a triangle");
		}

		else if(b + c < a)
		{
			System.out.println("You do not have a triangle");
		}
		else
		{
			System.out.println("You do  have a triangle");
		}
	}

	public String toString()
	{
		double side1,side2,side3;

		side1 = getSide1();
		side2 = getSide2();
		side3 = getSide3();

		return "Triangle: side1 = " + side1 + " side2 =  "+side2+" side3 = "+side3;
	}


}