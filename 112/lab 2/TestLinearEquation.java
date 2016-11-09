import java.io.*;
import java.util.*;

public class TestLinearEquation
{
public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		LinearEquation lineq = new LinearEquation();

		System.out.println("Enter value for a here");
		lineq.setNumA(input.nextDouble());

		System.out.println("Enter value for b here");
		lineq.setNumB(input.nextDouble());

		System.out.println("Enter value for c here");
		lineq.setNumC(input.nextDouble());

		System.out.println("Enter value for d here");
		lineq.setNumD(input.nextDouble());

		System.out.println("Enter value for e here");
		lineq.setNumE(input.nextDouble());

		System.out.println("Enter value for f here");
		lineq.setNumF(input.nextDouble());


		if(lineq.isSolvable() == false)
			{
				System.out.println("The equation has no solution");
			}

		else

		{
			System.out.println("x is "+ lineq.getX());
			System.out.println("y is "+ lineq.getY());
		}
	}
}