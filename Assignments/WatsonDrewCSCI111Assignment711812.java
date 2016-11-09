/*
Drew Watson
CSCI 111
Assignment 7
11/8/12
Goldberg
*/

import java.io.*;
import java.util.*;

public class WatsonDrewCSCI111Assignment711812
{


	public static void main(String[] args)
	{
		//Declared variables that I will be sending to each method.
		double foot = 1;
		double meter = 20;

		//All the output to the user is printed in a table formatt.
		System.out.println("This Program will convert meters to feet and feet to meters");
		System.out.println("\t");
		System.out.printf("%-8s %8s %6s %8s %9s \n","Feet","Meters","|","Meters","Feet");
		System.out.println("----------------------------------------------");

		//Loops 10 times
		for(int i =0;i<10;i++)
		{
			/*
				Prints out the foot and meters conversion into a table formatt.
				Calls/invokes each method and sends each variable.
			*/
			System.out.printf("%-8.1f %7.3f %7s %7.1f %12.3f \n",foot,footToMeter(foot),"|",meter,meterToFoot(meter));

			/*
				Increments each variable.
				Foot by 1 and meter by 5.
				This is done after each output is printed.
				Pretty much at the end of the loop.
			*/
			foot +=1;
			meter+=5;
		}
	}


	//Static double method that returns the converted foot variable. Changes feet to meters.
	public static double footToMeter(double foot)
	{
			//Math conversion from feet to meters. Then returns value.
			foot = 0.305 * foot;
			return foot;
	}

	//Static double method that returns the converted meter variable. Changes meters to feet.
	public static double meterToFoot(double meter)
	{
			meter = 3.279 * meter;
			return meter;
	}
}