/*	I was going to do something fancy but ended up doing this last minute
	Was going to make it so you could place any time and get a result
	Was going to have different methods to do each calculation and maybe even create my own class for calculations
	and then send everything to my main class, which would only have one method main, to run everything
*/
//Calls the packages and classes to be used was going to play around with the dialog box but not time due to procrastination
import java.io.*;
import javax.swing.*;

//Lazy programmming below
public class WatsonDrewCSCI111Assignment191312
{

	public static void main(String[] args)
	{
		//Declares variables, was lazy, could have done all this better
		//Given integers
		int miles = 24;
		int hour = 1;
		int min = 40;
		int sec = 35;
		//Conversion integers set for converting minutes to hours and set2 for converting seconds to minutes
		double set2 = 3600;
		double set =60;

		//Doubles to hold results
		double result;
		double total ;
		double mintotal;
		double sectotal;
		double timetotal;
		double kilototal;
		//For converting miles per hour to kilometer per hour
		double kiloconverter = 1.6;

		// Converts minutes to hours and places results into a double
		mintotal = min/set;
		//Converts seconds to hours and places resutls in a double
		sectotal = sec / set2;
		//Adds them together to find total time in hours
		timetotal = mintotal + sectotal + hour;
		//Finds the miles per hour
		result = miles / timetotal;
		//Finds total kilometers (last minute add I could have just converted the miles to kilometers then divided by the time in hours aka totaltime)
		kilototal = miles * kiloconverter;
		//Converts MPH to KPH
		total = result * kiloconverter;
		//Prints all the results, outputs, etc
		System.out.println("Your time was "+hour+" hour(s) "+min+" minute(s) "+sec+" second(s)");
		System.out.println("Your miles were "+miles);
		System.out.println("Your miles in kilometers is "+kilototal);
		System.out.println("Your total time in hours is "+timetotal);
		System.out.println("Your average speed in miles per hour is "+result);
		System.out.println("Your average speed in kilometers per hour is "+total);
	}
}
