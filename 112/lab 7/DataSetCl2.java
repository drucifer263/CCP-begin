/*

WatsonDrewCSCI112Assignment7040313

Drew Watson
Assignment 7
04/03/13
CSCI 112
Goldberg

ArrayList Version Client Class

*/

import java.io.*;
import java.util.*;
import java.net.*;

public class DataSetCl2
{
	public static void main(String[] args) //throws IOException, FileNotFoundException, MalformedURLException
	{
		ArrayList<String> first = new ArrayList<String>();
		ArrayList<String> last = new ArrayList<String>();
		ArrayList<String> position = new ArrayList<String>();
		ArrayList<Double> salary = new ArrayList<Double>();
		int response = 0;
		Scanner input = new Scanner(System.in);


		try{
			System.out.println(" How would you like to read the file?");
			System.out.println("(1) Text file");
			System.out.println("(2) Read from online");
			response = input.nextInt();

			if(response == 2)
			{
				DataSetAp2.readNet(first,last,position,salary);
			}

			else
				{DataSetAp2.readList(first,last,position,salary);}

		}

		catch(FileNotFoundException ex1)
		{
			System.out.println("File not found.");
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

		DataSetAp2.printList(first,last,position,salary);
		System.out.println(" ");

		DataSetAp2.computeSalary(position,salary);
	}
}