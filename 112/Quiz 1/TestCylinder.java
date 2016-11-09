import java.io.*;
import java.util.*;

public class TestCylinder
{
	public static void main(String[]args)
	{
		Cylinder myCylinder = new Cylinder();
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate a cylinder");
		System.out.println("with the height and radius of your choosing.");
		System.out.println("");
		System.out.println("Please enter the radius of the cylinder");
		myCylinder.setRadius(input.nextDouble());

		System.out.println("Please enter the height of the cylinder");
		myCylinder.setHeight(input.nextDouble());

		System.out.printf("The volume is %5.2f ", myCylinder.getVolume());
		System.out.println("");
		System.out.printf("The area is %5.2f", myCylinder.getArea());
		System.out.println("");
	}

}