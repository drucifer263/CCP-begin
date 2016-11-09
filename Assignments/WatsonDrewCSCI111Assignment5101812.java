import java.io.*;
import java.util.*;

public class WatsonDrewCSCI111Assignment5101812
{

		public static void main(String[] args)
		{
			int year = 0;

			System.out.println("This program will calculate all the years from 0 A.D. to 2100 A.D.");
			System.out.println("that are not leap years but still divisible by 4.");
			System.out.println("\t");
			for(int i = 0; i<=2100;i++)
				{

					if (year % 4 == 0 && year % 400 != 0 && year % 100 == 0)
					{System.out.print(year+" ");}

					year++;

				}




			/*

			An Alternative way I found to do the same loop above. Slightly less efficent

			for(int i = 0; i<=2100;i++)
				{

					if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					{
						//This is just a test to see where the leap years are and if the search is perform correctly
						//k=year;System.out.print("This year "+k+" is a leap year ");
					}

					else if (year % 4 == 0)
					{System.out.print(year+" ");}

					year++;
				}
			*/
		}
}