/*
Drew Watson
*/

import java.io.*;
import java.util.*;

public class TestCircle2D
{
	public static void main (String[] args)
	{
		Circle2D c1 = new Circle2D();
		Scanner keyboard = new Scanner(System.in);
		double x = 0, y = 0, radius = 0;
		boolean within = false, contains = false , overlaps = false;


		System.out.println("This program creates a circle \n ");

		System.out.print("Please enter the value for x here: ");
		x =  keyboard.nextDouble();

		System.out.print("Please enter the value for y here: ");
		y =  keyboard.nextDouble();

		System.out.print("Please enter the value for radius here: ");
		radius =  keyboard.nextDouble();

		System.out.println("");

		c1.setCircle2D(x, y, radius);

		System.out.printf("Area: %3.2f \n", c1.getArea());
		System.out.printf("Perimeter(Circumference): %3.2f \n", c1.getPerimeter());
		System.out.println("\n");





		System.out.println("Now we will test whether a point is within the circle\n");

		System.out.print("Please enter x here ");
		x = keyboard.nextDouble();

		System.out.print("Please enter y here ");
		y = keyboard.nextDouble();

		System.out.println("");

		within = c1.contains(x,y);


		if(within == true)
			{System.out.println("The point is within the circle.\n");}

		else
			{System.out.println("The point is not within the circle.\n");}

		System.out.println("\n");







		System.out.println("Now we will test whether one circle contains another");
		Circle2D c2 = new Circle2D();

		System.out.print("Please enter x here ");
		x = keyboard.nextDouble();

		System.out.print("Please enter y here ");
		y = keyboard.nextDouble();

		System.out.print("Please enter the values for radius here: ");
		radius =  keyboard.nextDouble();

		System.out.println("");

		c2.setCircle2D(x, y, radius);

		contains = c1.contains(c2);


		if(contains == true)
			{System.out.println("One circle conatins the other.\n");}

		else
			{System.out.println("No circle is within the other.\n");}

		System.out.println("\n");






		System.out.println("Now we will test whether the circles overlap \n");
		Circle2D c3 = new Circle2D();

		System.out.print("Please enter x here ");
		x = keyboard.nextDouble();

		System.out.print("Please enter y here ");
		y = keyboard.nextDouble();

		System.out.print("Please enter the values for radius here: ");
		radius =  keyboard.nextDouble();

		System.out.println("");

		c3.setCircle2D(x, y, radius);

		overlaps = c1.overlaps(c3);

		if(overlaps == true)
			{System.out.println("The circles overlap.\n");}

		else
			{System.out.println("The circles do not overlap.\n");}

		System.out.println("\n");



	}
}