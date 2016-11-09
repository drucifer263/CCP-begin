import java.io.*;
import java.util.*;

public class DataSet3
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		String[] first = new String[10];
		String[] last = new String[10];
		String[] position = new String[10];
		double[] salary = new double[10];
		int index = 0;
		int countassistant = 0, countassociate=0, countfull=0,countfaculty =0;
		double assistantsum =0, associatesum =0, fullsum =0, facultysum =0;
		double assistantave =0, associateave =0, fullave =0, facultyave =0;


		Scanner inFile = new Scanner(new FileReader("SalarySample.txt"));
		while(inFile.hasNext()){



			for(int j =0;j<10;j++)
			{
				first[j] = inFile.next();
				last[j] = inFile.next();
				position[j] = inFile.next();
				salary[j] = inFile.nextDouble();

			}


			for(int j =0;j<10;j++)
			{
				System.out.println(first[j]);
				System.out.println(last[j]);
				System.out.println(position[j]);
				System.out.println(salary[j]);

			}

				}


	    inFile.close();

		for(int k =0;k<10;k++)
		{
			if(position[k].equals("assistant"))
			{
				countassistant++;
				index = k;
				assistantsum += salary[index];

			}
			else if(position[k].equals("associate"))
			{
				countassociate++;
				index = k;
				associatesum += salary[index];

			}

			else /*if(position[k].equals("full"))*/
			{
				countfull++;
				index = k;
				fullsum += salary[index];
			}


		}
			facultysum = fullsum + associatesum + assistantsum;

			System.out.println("Sums");
			System.out.println(assistantsum);
			System.out.println(associatesum);
			System.out.println(fullsum);
			System.out.println(facultysum);

			assistantave = assistantsum / countassistant;
			associateave = associatesum/ countassociate;
			fullave = fullsum/countfull;

			countfaculty = countassistant + countassociate + countfull;
			facultyave = facultysum / countfaculty;

			System.out.println("Averages");

			System.out.println(assistantave);
			System.out.println(associateave);
			System.out.println(fullave);
			System.out.println(facultyave);


	}
}