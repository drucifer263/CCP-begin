/*	Drew Watson
	Asssignment 2
	Goldberg
	9/18/12
*/

import java.io.*;
import javax.swing.*;
import java.util.*;

public class WatsonDrewCSCI111Assignment2091812
{
	public static void main(String[] args)
	{
		int year;
		int day;
		int minutes;
		double years;
		double days;

		Scanner input = new Scanner(System.in);

		System.out.print("Please Enter number of minutes: ");
		minutes = input.nextInt();

		years = minutes * (1/60.0) * (1/24.0) * (1/365.0);
		year = (int)years;
		days = years - year;
		days = days * 365;
		day = (int)days;

		System.out.println(minutes+" minutes is approximately "+year+" years and "+day+" days");
	}
}