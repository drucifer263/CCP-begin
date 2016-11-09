import java.io.*;
import java.util.*;

public class WatsonDrewCSCI112Assignment2020613
{
	public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			String binaryString="";


			System.out.println("Please enter binary number");
			binaryString = input.nextLine();

			System.out.println("Binary to Decimal: " + binaryToDecimal(binaryString));
			System.out.println("Binary to Hexadecimal: " + binaryToHex(binaryString));
			System.out.println("And now back to Binary (using a seperate method): " + decimalToBinary(binaryToDecimal(binaryString)));
		}

	public static int binaryToDecimal(String binaryString)
	{

		 int decimalFromBinary = 0;

		for(int i = 0;i<binaryString.length();i++)
			{
				char binaryChar = binaryString.charAt(i);
				decimalFromBinary = decimalFromBinary * 2 + binaryToDecimal(binaryChar);

			}
			return decimalFromBinary;
	}

	public static int binaryToDecimal(char ch)
	{

		return ch - '0';

	}


	public static String binaryToHex(String binaryValue)
	{
		String hexstring =" ";
		int remainder = 0;
		int quotient = 0;

		quotient = binaryToDecimal(binaryValue);

		do{
			remainder = quotient % 16;
			quotient = quotient / 16;

			if(remainder == 10)
				{hexstring = "A" + hexstring;}

			else if(remainder == 11)
					{hexstring = "B" + hexstring;}

			else if(remainder == 12)
					{hexstring ="C"+hexstring;}

			else if(remainder == 13)
					{hexstring = "D" + hexstring;}

			else if(remainder == 14)
					{hexstring = "E" + hexstring;}

			else if(remainder==15)
					{hexstring = "F" + hexstring;}

			else
				{hexstring = remainder + hexstring;}

			}while(quotient!= 0);

		return hexstring;
	}

	public static String decimalToBinary(int value)
		{
			String binary = "";
			int quotient=0,remainder=0;

			quotient = value;

			do{

				remainder = quotient % 2;
				binary = remainder + binary ;
				quotient = quotient/ 2;

			}while(quotient !=0 );

			return binary;

	}


}