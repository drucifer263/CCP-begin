/*

WatsonDrewCSCI112Assignment5031313

Drew Watson
Assignment 5
3/13/13
CSCI 112
Goldberg

*/

import java.io.*;
import java.util.*;

public class ArraySortCl
{
	public static void main(String[] args)throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		list = ArraySortAp.list;
		double answer,answer2;
		String response = "";

		do{
				answer = ArraySortAp.menu1();

				if(answer == 1)
				{
					ArraySortAp.readList(list);
				}

				else if(answer == 3)
				{
					System.exit(1);
				}

				do{
					answer2 = ArraySortAp.menu2();

					if(answer2 == 1)
					{
						ArraySortAp.infoList(list);
					}

					if(answer2 == 2)
					{
						ArraySortAp.sortList(list);
					}

					else if(answer2 == 3)
					{
						ArraySortAp.searchList(list);
					}


					else if(answer2 == 4)
					{
						ArraySortAp.addList(list);

					}

					else if(answer2 == 5)
					{
						ArraySortAp.removeList(list);
					}

					else if(answer2 == 6)
					{
						ArraySortAp.clearList(list);
					}

					else if(answer2 == 7)
					{
						ArraySortAp.printList(list);
					}

					else if (answer2 == 8)
					{
						ArraySortAp.saveList(list);
					}

						}while(answer2 != 9);

							System.out.println("Would you like to go to the previous menu?");
							response = input.nextLine();

							if(response.equals("Yes") || response.equals("yes"))
							{
								ArraySortAp.clearList(list);
								continue;
							}

							else
								break;

							}while(answer!= 3 );
	}
}