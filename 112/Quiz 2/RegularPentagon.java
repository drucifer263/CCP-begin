import java.io.*;
import java.util.*;

public class RegularPentagon extends GeometricObject
{
	private double side1,side2,side3,side4,side5;

	RegularPentagon()
	{
		this(1.0,1.0,1.0,1.0,1.0);
	}

	RegularPentagon(double side1, double side2, double side3, double side4, double side5)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
	}

	public void setRegularPentagon(double side1, double side2, double side3, double side4, double side5)
	{
		this.side1= side1;
		this.side2= side2;
		this.side3= side3;
		this.side4= side4;
		this.side5= side5;
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

		public double getSide4()
		{
			return side4;
		}

		public double getSide5()
		{
			return side5;
		}

		public double getArea()
		{
			double apothem,n,s,area;

			s = getSide1();
			n = 5;

			apothem = s/(2*(Math.tan((180/n))));

			area = (Math.pow(apothem,2))*(n)*(Math.tan((180/n)));

			return area;
		}

		public double getPerimeter()
		{
			double a,b,c,d,e,p;

			a = getSide1();
			b = getSide2();
			c = getSide3();
			d = getSide4();
			e = getSide5();

			p = a + b + c + d + e;

			return p;
		}

		public String toString()
			{
				double side1,side2,side3,side4,side5;

				side1 = getSide1();
				side2 = getSide2();
				side3 = getSide3();
				side4 = getSide4();
				side5 = getSide5();

				return "Triangle: side1 = " + side1 + " side2 =  "+side2+" side3 = "+side3+" side 4= "+side4+"side 5 = "+side5;
	}

}