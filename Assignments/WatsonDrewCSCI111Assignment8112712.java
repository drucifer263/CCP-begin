/*
Drew Watson
Assignment 8
CSCI 111
11/27/12
Goldberg
*/

import java.io.*;
import java.util.*;

public class WatsonDrewCSCI111Assignment8112712
{

	public static void main(String[] args)
	{
		//Calls the  intro method and String s is declared.
		intro();
		String s;

		//do while loop continues program if depending on the answer from the user in the outro
		do{

			//Declares, initializes, and sets the single and doble arrays here
			double [][] points = setDoubleArray();
			double[] p = setSingleArray();

			/*
				Calls getIntersectingPoint, getIntersectingPoint calculates
				where the lines intersects , places the values/point into an array
				returns the single array and declares the single array p
			*/
			p = getIntersectingPoint(points);

			//Calls printArray, sends array p, and prints contents of array p
			printArray(p);

			//Sets the String s to be what the outro method returns(the users answer to continue)
			s = outro();

		/*
			The conditions of the do while loop, as long as the user answers with a word
			that begins with a 'Y' or 'y' it will loop continuously
		*/
		}while(s.charAt(0) == 'y'|| s.charAt(0)=='Y');
	}

	/*
		Method takes the  array called points (with its 4 points/8 values) and finds the intersecting point
		of the two lines ,if there is one. It then places that point(thsoe two values of x and y) into a
		single array and finally returns that very array.
	*/
	public static double[] getIntersectingPoint(double[][] points)
	{
		//Setting of the array and inilizing of varaibles
		double[] intersect = new double[2];
		double a,b,e,c,d,f,g,x,y;

		/*
		This formula is obtained by using Cramer's rule to solve the linear equation
		of the intersecting point of two lines. You use substitution and then plug in
		each corresponding value/point from the double array points into the equation.

		Cramer's Rule:		Linear eqaution for finding the
							intersecting point of two lines:
		ax + by = e
		cx + dy = f			(y1-y2)x-(x1-x2)y=(y1-y2)x1-(x1-x2)y1
							(y3-y4)x-(x3-x4)y=(y3-y4)x3-(x3-x4)y3
		x = ed - bf
			-------
			ad - bc

		y = af - ec
			-------
			ad - bc
		*/

		// Substitution and algebra, with the correct points
		a = points[0][1] - points[1][1];
		b = -(points[0][0] - points[1][0]);
		c = (points[2][1] - points[3][1]);
		d = -(points[2][0] - points[3][0]);
		e = (a * points[0][0]) + (b * points[0][1]);
		f = (c * points[2][0]) + (d * points[2][1]);

		//Sets up g to be the denominator
		g = ((a * d) - (b * c));

		//Solution to finding the two intersecting points
		x =((e * d) - (b * f)) / g;//((a * d) - (b * c));
		y =((a * f) - (e * c)) / g;//((a * d) - (b * c));

		//Places the (x,y) corordinance from the equations into the single array
		intersect[0] = x;
		intersect[1] = y;

		/*
			Tests to see if g the denominator is equal to zero if so then null/ zero is placed into
			the array. It means that the equation has no solution and the lines are parallel.
			This is to be used later in the print function
		*/
		if(g == 0)
		 {
			 for(int i = 0;i<intersect.length;i++)
				{
					intersect[i] = 0;
				}
		 }
		//Returns the single array with the intersecting point or 0 if there is none
		return intersect;
	}

	//Method sets the double 2 dimensional array here
	public static double[][] setDoubleArray()
	{
		Scanner input = new Scanner(System.in);
		double[][] array = new double[4][2];

		System.out.println("\t");
		System.out.print("Please enter 4 points (x1, y1, x2, y2....etc) here: ");

		for(int row=0;row<array.length;row++)
		{
			for(int column=0;column<array[row].length;column++)
				{
					array[row][column] = input.nextDouble();
				}
		}


		return array;
	}

	//Method sets the double single dimension array here
	public static double[] setSingleArray()
		{
			double[] array = new double[2];
			return array;
		}

	//Prints the double single array here
	public static void printArray(double[] p)
	{

		//Ifthe values in the array are zero it means the lines are paralell so there is no solution
		if(p[0] == 0)
				{	//Prints the corosponding message
					System.out.println("The two lines are parallel.");
				}

		/*
			If the values/point/(x,y) in the array are not equal then it prints them out here in a
			particular format
		*/

		else
				{
					System.out.printf("The intersecting point is at (%1.5f, %1.4f)\n",p[0],p[1]);
					System.out.println("\t");
				}
	}

	//Introduction and welcome message to the user
	public static void intro()
	{
			System.out.println("This program will take 2 lines and determine if they intersect.");
	}

	//Outro to the user. takes the input from the user and returns a string
	public static String outro()
	{
		Scanner input = new Scanner(System.in);

		//Input from user on continuing the program
		System.out.println("\t");
		System.out.println("Would you like to continue?");
		System.out.println("If so Type Yes, otherwise type No, then press enter.");

		//Sets string answer to be the input from user
		String answer = input.nextLine();

		// Returns the string answer
		return answer;
	}
}