/*
UML

TestTriangle
--------------
+main(args:String):void

*/

import java.io.*;
import java.util.*;

public class TestTriangle
{

	public static void main(String[]args)
	{
		double side1,side2,side3,area,perimeter;
		String answer, response="";
		Triangle t1 = new Triangle();
		Scanner input = new Scanner(System.in);

		System.out.println("This program will create a trianle");

		do{

		System.out.println("Enter the value for side 1 here");
		side1 = input.nextDouble();

		System.out.println("Enter the value for side 2 here");
		side2 = input.nextDouble();

		System.out.println("Enter the value for side 3 here");
		side3 = input.nextDouble();

		//System.out.println("Before: " + t1.toString());

		t1.setTriangle(side1,side2,side3);

		area = t1.getArea();
		perimeter = t1.getPerimeter();

		System.out.println("After: " + t1.toString());

		System.out.println("The Area: " + area);

		System.out.println("The perimeter: "+ perimeter);

		t1.isTriangle();


		Scanner keyboard = new Scanner(System.in);

		System.out.println("\t");
		System.out.println("Would you like to continue?");
		System.out.println("If so Type Yes, otherwise type No, then press enter.");


		answer = keyboard.nextLine();


		}while(answer.charAt(0) == 'y'|| answer.charAt(0)=='Y');


	}
}