/*

WatsonDrewCSCI112Assignment7040313

Drew Watson
Assignment 7
04/03/13
CSCI 112
Goldberg

ArrayList Version Application Class
*/

import java.io.*;
import java.util.*;
import java.net.*;


public class DataSetAp2
{
	ArrayList<String> first = new ArrayList<String>();
	ArrayList<String> last = new ArrayList<String>();
	ArrayList<String> position = new ArrayList<String>();
	ArrayList<Double> salary = new ArrayList<Double>();


	public static void readList(ArrayList<String> first, ArrayList<String> last, ArrayList<String> position, ArrayList<Double> salary) throws IOException, FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Salary.txt"));

		while(inFile.hasNext()){

			first.add(inFile.next());
			last.add(inFile.next());
			position.add(inFile.next());
			salary.add(inFile.nextDouble());

					}
		inFile.close();
	}


	public static void readNet(ArrayList<String> first, ArrayList<String> last, ArrayList<String> position, ArrayList<Double> salary) throws IOException, InputMismatchException, MalformedURLException
	{
		String response ="";
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Are you at CCP? If so enter yes, else enter no");
		response = keyboard.nextLine();

		if(response.equals("yes")||response.equals("Yes")||response.equals("YES"))
		{
			setProxy();
		}

		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		Scanner inFile = new Scanner(url.openStream());

		while(inFile.hasNext()){

			first.add(inFile.next());
			last.add(inFile.next());
			position.add(inFile.next());
			salary.add(inFile.nextDouble());


							}
		inFile.close();
	}

		public static void setProxy()
		{
			System.setProperty("http.proxyHost", "10.1.48.140");
			System.setProperty("http.proxyPort","8080");
	}

	public static void printList(ArrayList<String> first, ArrayList<String> last, ArrayList<String> position, ArrayList<Double> salary)
	{
		for(int i =0;i<first.size();i++)
		{

			System.out.print(first.get(i) + " ");
			System.out.print(last.get(i) + " ");
			System.out.print(position.get(i)+ " ");
			System.out.print(salary.get(i) + " ");
			System.out.println(" ");

		}
	}

	public static void computeSalary(ArrayList<String> position, ArrayList<Double> salary)
	{
		int index = 0;
		int countassistant = 0, countassociate=0, countfull=0,countfaculty =0;
		double assistantsum =0, associatesum =0, fullsum =0, facultysum =0;
		double assistantave =0, associateave =0, fullave =0, facultyave =0;

		for(int k =0;k<position.size();k++)
		{
			if(position.get(k).equals("assistant"))
			{
				countassistant++;
				index = k;
				assistantsum += salary.get(index);

			}
			else if(position.get(k).equals("associate"))
			{
				countassociate++;
				index = k;
				associatesum += salary.get(index);

			}

			else
			{
				countfull++;
				index = k;
				fullsum += salary.get(index);
			}


		}


			facultysum = fullsum + associatesum + assistantsum;

			assistantave = assistantsum / countassistant;
			associateave = associatesum/ countassociate;
			fullave = fullsum/countfull;

			countfaculty = countassistant + countassociate + countfull;
			facultyave = facultysum / countfaculty;



			System.out.println("Stats");
			System.out.println("Total Number of Assistant Professors: " + countassistant );
			System.out.println("Total Number of Associate Professors: "+ countassociate);
			System.out.println("Total Number of Full Professors: "+ countfull);
			System.out.println("Total Number of Faculty: "+ countfaculty);
			System.out.println("\n");

			System.out.println("Salary Totals");
			System.out.printf("Assistant Professors: %10.2f\n",assistantsum);
			System.out.printf("Associate Professors: %10.2f\n",associatesum);
			System.out.printf("Full Professors: %10.2f\n",fullsum);
			System.out.printf("Faculty Total Salary: %10.2f\n",facultysum);

			System.out.println("\n");
			System.out.println("Salary Averages");
			System.out.printf("Assistant Professors: %8.2f\n",assistantave);
			System.out.printf("Associate Professors: %8.2f\n",+ associateave);
			System.out.printf("Full Professors: %8.2f\n",fullave);
			System.out.printf("Faculty: %8.2f\n",facultyave);
	}




}