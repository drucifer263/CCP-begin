/*
Drew Watson
CIS 106
Agbada
Fall15
Programming Assignment 6
12/3/15
*/

#include<iostream>
#include<iomanip>
#include<cstdlib>
#include<vector>

//Protoypes
void userInput(int [], int);
void randomNum(int[], int);
void output(int[], int);
void compareArray(int[], int, int[]);

using namespace std;

int main ()
{
//variables and arrays 	
int size =5;
int winningDigits[size];
int playerDigits[size];

//Function places random numbers into winningDigits
randomNum(winningDigits, size);

//Takes user input
userInput(playerDigits, size);

cout<<"\n";

//Prints winning array
cout<<"Winning Numbers"<<endl;
output(winningDigits, size);

cout<<"\n";

//Prints users numbers
cout<<"Your Numbers"<<endl;
output(playerDigits, size);

cout<<"\n";

//Compares the winningDigits and playerDigits array
compareArray(winningDigits, size,playerDigits);

system("pause");
return 0;
}

void userInput(int playerDigits[], int size )
{
     cout<<"Please enter 5 numbers between 0 and 9: "<<endl;
 	 
	  //Loop places users input into playerDigits array
	  for(int count = 0;count<size;count++)
 	 {
             cin>>playerDigits[count];
			 
			 //Input validation, has to be between 0 to 9
             while((playerDigits[count] < 0) || (playerDigits[count] >9))
     		 {
	  			 cout<<"Input Invalid.Please re-enter number: "<<endl;
	  			 cin>>playerDigits[count];
             }
			
      }
}

//Generates the random numbers into an array
void randomNum(int winningDigits[], int size)
{
 	 
//Creates a random number from a seed value of time starting from 0 or NULL
srand(time(NULL));
				  
       //Loop places random numbers from 0 to 9 into an array
	   for(int count=0;count<size;count++)
	   {
	        winningDigits[count]= rand() %9;
 	   }
 	   
}

//Outputs elements from an array
void output(int array[], int size)
{
 	 for(int count=0;count<size;count++)
 	 {
	  		 cout<<array[count]<<" ";
	 }
	 cout<<"\n";
}

//Comapres two arrays
void compareArray(int winningDigits[], int size, int playerDigits[])
{
 	 int numberOfMatch=0;
	 vector<int> elements;
 	  
 	  //Loop move through the array
	   for(int count=0;count<size;count++)
	   {
		    //If statement tests each element within each array
	        if(winningDigits[count] == playerDigits[count])
	        {
			 						
				//Places each matching element into a vector called elements
				elements.push_back(winningDigits[count]);
				
				//Counts each instance of matching elements within the arrays
				numberOfMatch++;
			}
 	   }
 	   
 	   //Prints the matching elements that were in the vector 
		cout<<"Matching elements: ";
		for(int index=0;index<elements.size();index++)
				{
						cout<<elements[index]<<" ";
				}
		//Prints the number of matching elements or the correct numbers within the arrays
 	   cout<<"\n";
 	   cout<<"Number of matches: "<<numberOfMatch<<endl;
}
