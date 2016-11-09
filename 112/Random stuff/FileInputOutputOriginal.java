import java.io.*;
import java.util.*;
class FileInputOutputOriginal
{
	public static void main(String[] args)
						throws FileNotFoundException
	{
		String str = " ";

		PrintWriter outFile = new PrintWriter(new FileOutputStream("prog.txt", false));
        for(int i = 0; i < 4; i++)
 		outFile.println("Hello file World" + i +"!");
		outFile.close();

		Scanner inFile = new Scanner(new FileReader("prog.txt"));
        while(inFile.hasNext()){
		str = inFile.nextLine();
	    System.out.println();
		}

	    inFile.close();

	}
}

