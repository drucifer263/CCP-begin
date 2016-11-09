/*
UML

TestTriangle
--------------
+main(args:String):void

*/

import java.io.*;
import java.util.*;

public class TestRegularPentagon
{

	public static void main(String[]args)
	{
		double side1,side2,side3,side4,side5,area,perimeter;
		String answer /*response=""*/;
		RegularPentagon rp = new RegularPentagon();
		Scanner input = new Scanner(System.in);

		System.out.println("This program will create a trianle");

		do{

		System.out.println("Enter the value for side 1 here");
		side1 = input.nextDouble();

		//System.out.println("Enter the value for side 2 here");
		side2 = side1;

		//System.out.println("Enter the value for side 3 here");
		side3 = side1;

		//System.out.println("Enter the value for side 4 here");
		side4 = side1;

		//System.out.println("Enter the value for side 5 here");
		side5 = side1;

		rp.setRegularPentagon(side1,side2,side3,side4,side5);

		area = rp.getArea();
		perimeter = rp.getPerimeter();

		System.out.println("After: " + rp.toString());

		System.out.println("The Area: " + area);

		System.out.println("The perimeter: "+ perimeter);


		Scanner keyboard = new Scanner(System.in);

		System.out.println("\t");
		System.out.println("Would you like to continue?");
		System.out.println("If so Type Yes, otherwise type No, then press enter.");


		answer = keyboard.nextLine();


		}while(answer.charAt(0) == 'y'|| answer.charAt(0)=='Y');


	}
}