/*

WatsonDrewCSCI112Assignment7040313

Drew Watson
Assignment 7
04/03/13
CSCI 112
Goldberg

Single Array Version Client Class
*/

import java.io.*;
import java.util.*;
import java.net.*;

public class DataSetCl1
{
	public static void main(String[] args) //throws IOException, FileNotFoundException, MalformedURLException
	{
		String[] first = new String[1000];
		String[] last = new String[1000];
		String[] position = new String[1000];
		double[] salary = new double[1000];
		int response = 0;
		Scanner input = new Scanner(System.in);


		try
		{
			System.out.println(" How would you like to read the file?");
			System.out.println("(1) Text file");
			System.out.println("(2) Read from online");
			response = input.nextInt();

			if(response == 2)
			{
				DataSetAp1.readNet(first,last,position,salary);
			}

			else
				{DataSetAp1.readList(first,last,position,salary);}
		}

		catch(FileNotFoundException ex1)
		{
			System.out.println("File does not exist.");
			System.exit(1);
		}

		catch(IOException ex2)
		{
			System.out.println("Failed or interrupted I/O operations.");
			System.exit(1);
		}

		catch(InputMismatchException ex3)
		{
			System.out.println("Input Mismatch.");
			System.exit(1);
		}


		/*
		catch(MalformedURLException ex4)
		{
			System.out.println("URL is incorrect.");
			System.exit(1);
		}
		*/

		DataSetAp1.printList(first,last,position,salary);
		System.out.println(" ");

		DataSetAp1.computeSalary(position,salary);
	}
}