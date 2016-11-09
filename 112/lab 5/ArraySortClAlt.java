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

public class ArraySortClAlt
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

				switch((int)answer)
				{
					case 1: ArraySortAp.readList(list);
					case 2: break;
					case 3: System.exit(1);
				}

				do{
					answer2 = ArraySortAp.menu2();
					switch((int)answer2)
					{
						case 1: ArraySortAp.infoList(list);
								continue;
						case 2: ArraySortAp.sortList(list);
								continue;
						case 3:	ArraySortAp.searchList(list);
								continue;
						case 4: ArraySortAp.addList(list);
								continue;
						case 5: ArraySortAp.removeList(list);
								continue;
						case 6: ArraySortAp.clearList(list);
								continue;
						case 7: ArraySortAp.printList(list);
								continue;
						case 8: ArraySortAp.saveList(list);
								continue;
						case 9: break;
					}
						}while(answer2 != 9);

							System.out.println("Would you like to go to the previous menu?");
							response = input.nextLine();

							switch(response)
							{
								case "yes": ArraySortAp.clearList(list);
											continue;
								case "Yes":ArraySortAp.clearList(list);
											continue;
								case "no": System.exit(1);

								case "No": System.exit(1);
							}

								}while(answer!= 3 );
	}
}