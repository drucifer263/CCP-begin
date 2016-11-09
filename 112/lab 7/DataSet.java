import java.io.*;
import java.util.*;

public class DataSet
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		String[] row = new String[10];

		Scanner inFile = new Scanner(new FileReader("SalarySample.txt"));
		while(inFile.hasNext()){



			for(int j =0;j<10;j++)
			{
				row[j] = inFile.nextLine();

			}


			for(int j =0;j<10;j++)
			{
				System.out.println(row[j]);


			}

				}


	    inFile.close();



	}
}