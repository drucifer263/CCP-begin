/*

WatsonDrewCSCI112Assignment7040313

Drew Watson
Assignment 7
04/03/13
CSCI 112
Goldberg

Reading a text file from online
*/

import java.io.*;
import java.util.*;
import java.net.*;

public class DataSet4
{

	public static void main(String[] args) throws IOException, FileNotFoundException, MalformedURLException
	{
		//setProxy();

		ArrayList<String> first = new ArrayList<String>();
		ArrayList<String> last = new ArrayList<String>();
		ArrayList<String> position = new ArrayList<String>();
		ArrayList<Double> salary = new ArrayList<Double>();

		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		Scanner inFile = new Scanner(url.openStream());

		while(inFile.hasNext()){

			first.add(inFile.next());
			last.add(inFile.next());
			position.add(inFile.next());
			salary.add(inFile.nextDouble());
		}

		inFile.close();

		for(int j=0;j<first.size();j++)
		{
			System.out.print(first.get(j)+" ");
			System.out.print(last.get(j)+" ");
			System.out.print(position.get(j)+" ");
			System.out.print(salary.get(j)+"\n");

		}
	}


	public void setProxy()
	{
		System.setProperty("http.proxyHost", "10.1.48.140");
		System.setProperty("http.proxyPort","8080");
	}

}