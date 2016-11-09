import java.io.*;
import java.util.*;

public class WatsonDrewCSCI111Assignment611112
{
	public static void main(String[] args)
	{
		double deposit, deposit2;
		double yeild;
		double maturity;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the initial deposit amount ");
		deposit = input.nextDouble();

		System.out.println("Enter the annual percentage yeild ");
		yeild =input.nextDouble();

		System.out.println("Enter the maturity period (number of months) ");
		maturity = input.nextDouble();

		maturity = maturity +1;

		System.out.println("Month Cd Value");

		for(int j = 1;j < maturity ; j++)
		{
			deposit = deposit + ((deposit) * (yeild / 1200));

			//System.out.println(j /*+" "+ deposit*/);
			System.out.printf("  %d    %3.2f ",j,deposit);
			System.out.println("\t");
			//System.out.println(deposit);
		}



	}
}
