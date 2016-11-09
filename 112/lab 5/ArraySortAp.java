/*

WatsonDrewCSCI112Assignment5031313

Drew Watson
Assignment 5
3/13/13
CSCI 112
Goldberg

*/

import java.io.*;
import java.util.*;

public class ArraySortAp
{

	public static ArrayList<Integer> list = new ArrayList<>();

	public static double menu2()
	{
		double answer = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("(1) Info");
		System.out.println("(2) Sort");
		System.out.println("(3) Search");
		System.out.println("(4) Add");
		System.out.println("(5) Remove");
		System.out.println("(6) Clear");
		System.out.println("(7) Print");
		System.out.println("(8) Save");
		System.out.println("(9) Exit");
		answer = keyboard.nextDouble();
		return answer;
	}

	public static double menu1()
		{
			double answer =0;
			Scanner input = new Scanner(System.in);

			System.out.println("What do want to do");
			System.out.println("(1) Load an Array ");
			System.out.println("(2) Create a new array");
			System.out.println("(3) Exit");
			answer = input.nextDouble();
			return answer;
	}

	public static void printList(ArrayList<Integer> list)
	{
		if(list.isEmpty()== true)
		 {System.out.println("Nothing to print");}

		else
		{
			System.out.println("The array contains: ");

			for(int i =0;i<list.size();i++)
			{
				System.out.println(list.get(i));}
			}
	}



	public static void infoList(ArrayList<Integer> list)
	{
		int max,min,size;

		min = list.size()-list.size();
		max = list.size()-1;
		size = list.size();

		if(list.isEmpty() == false)
		{
			System.out.println("The array's index ranges from "+min+" to "+max);
			System.out.println("The array has "+size+" elements in it");
			System.out.println("Those elements are: ");

			for(int i =0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}

				System.out.println("\n");
		}

		else
			System.out.println("No info available, array empty");
	}

	public static void saveList(ArrayList<Integer> list) throws FileNotFoundException
	{
		String answer = "";
		Scanner input = new Scanner(System.in);


		System.out.println("What would you like to save the file as? Enter here: ");
		answer = input.nextLine();

		if(answer.equals(""))
		{
			System.out.println("A default name has been provided");
			PrintWriter outFile = new PrintWriter(new FileOutputStream("default.txt",false));

			for(int i = 0; i < list.size(); i++)
				 		outFile.println(list.get(i));
						outFile.close();

			System.out.println("Array saved as default");

		}

		else
		{
			answer +=".txt";
			File file = new File(answer/*+".txt"*/);
			PrintWriter outFile = new PrintWriter(file);

			for(int i = 0; i < list.size(); i++)
	 			outFile.println(list.get(i));
				outFile.close();

			System.out.println("Array saved as "+answer);
		}
	}

	public static void readList(ArrayList<Integer> list) throws FileNotFoundException
	{
		String answer = "",response="";
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);

		do {

			System.out.println("Enter the file you would like to load here");
			System.out.println("A sample arraylist has been provided just type sample then enter if you want to use it.");
			answer = input.nextLine();
			answer +=".txt";

			File file = new File(answer/*+".txt"*/);


			if(file.exists() == true)
				{

					Scanner inFile = new Scanner(file);

					while(inFile.hasNext())
					{
						list.add(inFile.nextInt()) ;
						System.out.println();
					}

					inFile.close();
					break;
				}

			else
				{
					System.out.println(answer+" file does not exist");
					System.out.println("Would you like to try a new file?");
					System.out.println("If not a default file shall be auto loaded.");
					response = keyboard.nextLine();

					if(response.equals("No") || response.equals("no"))
					{
						Scanner inFile = new Scanner(new FileReader("default.txt"));

						while(inFile.hasNext())
						{
							list.add(inFile.nextInt()) ;
							System.out.println();
						}

						inFile.close();

					}
				}


		}while(response.equals("yes") || response.equals("Yes") || response.equals("y") || response.equals("Y"));

	}

	public static void sortList(ArrayList<Integer> list)
	{

		int temp = 0;

		if(list.isEmpty() == false)
		{
			for(int i=0;i<list.size()-1;i++)
			{
				for(int k =i+1;k<list.size();k++)
				{
					if(list.get(i) >= list.get(k))
					{
						temp = list.get(i);
						list.set(i,list.get(k));
						list.set(k,temp);

					}
				}

			}

		}

		else
			System.out.println("The array is empty");

	/*
		//Alternative sort Insertion sort
		for(int i=0;i<list.size();i++)
		{
			int curelement = list.get(i);
			int k;
			for(k=i-1;k>=0 && list.get(k)>curelement;k--)
			{

				list.set(k+1,list.get(k));
			}


			list.set(k+1,curelement);
		}


		*/


		/*
			//Alternative sort Selection sort
		for(int i=0;i<list.size()-1;i++)
		{
			int min = list.get(i);
			int minIndex = i;

			for(int j=i+1;j<list.size();j++)
			{
				if(min>list.get(j))
				{
					min = list.get(j);
					minIndex = j;
				}
			}

			if(minIndex != i)
			{
				list.set(minIndex,list.get(i)) /= list.get(i)/;
				list.set(i,min) = /min/;
			}
		}

		*/

	}

	public static void clearList(ArrayList<Integer> list)
	{
		list.clear();
	}

	public static void addList(ArrayList<Integer> list)
	{

		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		int element,index,o;
		String answer= "";

		System.out.println("Do you want to add a element at a specific index");
		System.out.println("Or a specific element");
		answer = input.nextLine();

		if(answer.equals("index"))
		{
			System.out.println("Ok, at which index?");
			index = keyboard.nextInt();

			if(index<=list.size()-1)
			{	System.out.println("And what element?");
				o = keyboard.nextInt();
				list.add(index,o);
		}
			else
				{System.out.println("Out of index");}
		}

		else
		{
			System.out.println("Ok which element?");
			element = keyboard.nextInt();
			list.add(element);
		}
	}

	public static void searchList(ArrayList<Integer> list )
	{
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		String answer="";
		int index,element,min,max,count=0;

		if(list.isEmpty() == false)
		{
			System.out.println("Do you want a specific element or one at a specific index?");
			answer = input.nextLine();

			if(answer.equals("index"))
			{
				min = list.size() - list.size();
				max = list.size() - 1;

				System.out.println("The indexes range from "+min+" to "+max);
				System.out.println("Ok at which index");
				index = keyboard.nextInt();

				if(index <= list.size()-1)
				{System.out.println(list.get(index)+" is at index "+index);}

				else
					System.out.println("Out of index");
			}

			else
			{
				System.out.println("Ok which element");
				element = keyboard.nextInt();


				if(list.contains(element)==true)
				{
					for(int i =0;i<list.size();i++)
					{
						if(list.get(i) == element)
						{count++;}
					}

					System.out.println(element+" occurs "+count+" time(s).");
				}

				else
					System.out.println("Element "+element+" not within list.");
			}

		}
		else
			System.out.println("The array is empty");

		/*
			//Alternative Search, Binary search
			int high,low,mid,count=0;

			low = 0;
			high = list.size()-1;
			mid = (low + high)/2;

			element = keyboard.nextInt();

			if(list.contains(element) == true)
			{
				if(element<list.get(mid))
				{
					high = mid-1;
				}

				else if(element == list.get(mid))
				{
					count++;
				}

				else
					low = mid + 1;
			}

			System.out.println(element+" occurs "+count+" time(s).");

			*/
	}

	public static void removeList(ArrayList<Integer> list)
	{

		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		int element,index,max,min;
		String answer= "";

		if(list.isEmpty() == false)
		{
			System.out.println("Do you want to remove the element at a specific index");
			System.out.println("Or a specific element");
			answer = input.nextLine();

			if(answer.equals("index"))
			{
				min = list.size()-list.size();
				max = list.size()-1;

				System.out.println("The indexes range from "+min+" to "+max);
				System.out.println("Ok, at which index?");
				index = keyboard.nextInt();

				if(index <= max)
				{
					element = list.get(index);
					list.remove(index);
					System.out.println("Element "+element+" removed at index "+index);
				}

				else
					System.out.println("Outside of index");
			}

			else
			{
				System.out.println("Ok which element?");
				element = keyboard.nextInt();

				if(list.contains(element)==true)
				{list.remove((Object)element);}

				else
					System.out.println("Element not in there");
			}
		}

		else
			System.out.println("The array is empty");
	}





}