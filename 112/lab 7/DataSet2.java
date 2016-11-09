import java.io.*;
import java.util.*;

public class DataSet2
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		ArrayList<String> first = new ArrayList<String>();
		ArrayList<String> last = new ArrayList<String>();
		ArrayList<String> position = new ArrayList<String>();
		ArrayList<Double> salary = new ArrayList<Double>();


		Scanner inFile = new Scanner(new FileReader("SalarySample.txt"));
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
}