import java.io.*;
import java.util.*;

public class WatsonDrewCSCI112Quiz3032013
{
	public static void main(String[] args)
	{
		int[] x = new int[100];
		Scanner  input = new Scanner(System.in);
		int index;

		for(int i=0;i<100;i++)
		{
			x[i] = (int)(Math.random() * (100-1));
		}

		/*
		for(int i=0;i<100;i++)
		{
			System.out.println(i+" "+x[i]);
		}

		*/


		System.out.println("Please choose an index of the array");
		index = input.nextInt();

		try
		{
			System.out.println("The number at index "+index+" is "+x[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Out of Bounds");

		}
	}


}