/*
Drew Watson
Assignment 4
10/11/12
CSCI111
Goldberg
*/

/* Imports packages used in program */
import java.io.*;
import java.util.*;


public class WatsonDrewCSCI111Assignment4101112
{

	public static void main(String[] args)
	{
		/* Where I declare my variables */
		double numberA,numberB,numberC, discriminant,root1,root2;
		Scanner input = new Scanner(System.in);

		/*Where I explain the intent of the program*/
		System.out.println("This program will prompt you for three values: a, b, and c.");
		System.out.println("It will then find the root(s) for the quadratic equation then display them.");
		System.out.println("If there is none then it shall tell you so.");
		System.out.println("\t");

		/*Where I prompt the user for the numbers to calculate the equation*/
		System.out.print("Enter integer a here: ");
		numberA = input.nextDouble();

		System.out.print("Enter integer b here: ");
		numberB = input.nextDouble();

		System.out.print("Enter integer c here: ");
		numberC = input.nextDouble();

		System.out.println("\t");

		/*	This is where I compute the discriminant.
			I decided to calculate it before the loop
			because 1) the prompt wants the loops to be based of the discriminant
					2) It make for a more efficient loop.
		*/
		discriminant = (numberB * numberB) - 4 * (numberA * numberC);


		/*	Here I have the loop determine if the quadratic equation is positive.
			If it is then there are two real loops and you have to compute both of them.
			There isno way around it.
		*/
		if(discriminant > 0)
			{
				root1 = (-(numberB) + Math.pow(discriminant,0.5)) / (2 * numberA);
				root2 = (-(numberB) - Math.pow(discriminant,0.5)) / (2 * numberA);

				System.out.println("The equation has two real roots.");
				System.out.println("Those roots are: "+root1 + " and " +root2);
				System.out.printf("Or better displayed as: %f and %f ",root1,root2);
				System.out.println("\t");
			}

		/*
			Here is where the loop goes to if the quadratic is not positive and
			the boolen statement is false.It tests to see if it is indeed zero.
			Due to the fact that the discriminant is 0, both equations to figured out
			the roots end up being the same. So you don't have to comput both. You
			can use either equation. I picked root1.

		*/
		else if(discriminant == 0 )
					{
						root1 = (-(numberB) + Math.pow(discriminant,0.5)) / (2 * numberA);
						System.out.println("The equation has one real root.");
						System.out.println("That root is: "+ root1);
						System.out.printf("Or better displayed as: %f ", root1);
						System.out.println("\t");
					}

		/*	Here is where the loop ends if both statements above are false, the
			quadratic is neither positive nor zero so it must be negative. If it
			is negative then the quadratic has no root and the test/checking ends
		*/
		else
					{
						System.out.println("The equation has no real roots.");
						System.out.println("\t");
					}


	}
}