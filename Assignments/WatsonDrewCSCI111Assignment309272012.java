/*
	Drew Watson
	Assignment 3
	09/27/12
	CIS 111
	Goldberg
*/

// Calls all the classes in the io and util packages
import java.io.*;
import java.util.*;

// Declares the class
public class WatsonDrewCSCI111Assignment309272012
{

	// Defines the main method where my program is executed etc
	public static void main(String[] args)
	{

		// Here I declare my variables for each input. federal and state deductions = federal and state withholdings
		String employeeName;
		double hoursWorked, payRate, grossPay, federalDeduction, stateDeduction, totalDeduction, netPay;
		double fedRate, stateRate;

		// Calls the Scanner class then creates an object Scanner and assigns input as its reference
		Scanner input = new Scanner(System.in);

		// Here is were I place all the questions to the user who then places each input to my previously declared varaibles
		System.out.print("Enter employee's name: ");
		employeeName = input.nextLine();

		System.out.print("Enter the number of hours worked in a week: ");
		hoursWorked = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		payRate = input.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");
		fedRate = input.nextDouble();

		System.out.print("Enter state tax withholding rate: ");
		stateRate = input.nextDouble();

		// Here is where I do the calculations for the gross pay
		grossPay = hoursWorked * payRate;

		// Here is where I compute the federal taxes, and then the state taxes to be withheld from the gross pay
		federalDeduction = grossPay * fedRate ;
		stateDeduction = grossPay * stateRate ;

		// Here is the total deduction from the state and federal withholding/taxes
		totalDeduction = federalDeduction + stateDeduction;

		// This is how I computed the net pay, the gross pay minus the state and federal withholdings/taxes
		netPay = grossPay - totalDeduction;

		// This is where I computed the federal and state tax or rate into a percentage
		fedRate = fedRate * 100;
		stateRate = stateRate * 100;

		/*	This is where I rounded up any number that went beyond two decimal points.
			First I mutiplied it by a hundred then turned it into an int then finally
			turned it back into a double by multiplying it by 100.0
			Did not need to convert federalDeduction due to it only being two places after
			the decimal point anyway,even after the calculations
		*/
		stateDeduction = (int)(stateDeduction * 100) / 100.0;
		totalDeduction = (int)(totalDeduction * 100) / 100.0;
		netPay = (int)(netPay * 100) / 100.0;

		// All my output for each variable is here. This is how the user sees the payroll
		System.out.println("");
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Hours Worked: "+hoursWorked);
		System.out.println("Pay Rate: $"+payRate);
		System.out.println("Gross Pay: $"+grossPay);
		System.out.println("Deductions:");
		System.out.println("\tFederal Withholding ("+fedRate+"%): $"+federalDeduction);
		System.out.println("\tState Withholding ("+stateRate+"%): $"+stateDeduction);
		System.out.println("\tTotal Deduction: $"+totalDeduction);
		System.out.println("Net Pay: $"+netPay);

	}
}