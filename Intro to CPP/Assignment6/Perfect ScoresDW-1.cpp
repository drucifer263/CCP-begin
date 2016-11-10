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
#include<vector>

using namespace std;

//Prototypes
void userInput(int [], int );
void arrayOutput(int [], int , int);
int countPerfect(int [], int);

int main()
{

//Variables	
int size = 10;
int testScores[size];
int perfects = 0; 

//Function takes user input
userInput(testScores,size);

//countPerfect returns the number of perfect scores
//perfects stores the number of 100s 
perfects = countPerfect(testScores,size);
cout<<"\n";

//Outputs the array
arrayOutput(testScores,size,perfects);

system("pause");
return 0;
}  

//Takes the users input and places it into an array
void userInput(int scores[], int size)
{	
	 //User prompt
 	 cout<<"Please enter 10 test scores: ";
 	 
	  //Loop palces user input into array
	  for(int count = 0;count<size;count++)
 	 {
             cin>>scores[count];
			
			//Input validation, has to be between 0-100
			 while((scores[count] < 0) || (scores[count] >100))
     		{
		  	     //
	  			 cout<<"Input Invalid. Please re-enter test score: ";
	  			 cin>>scores[count];
		    }
			
      }
}

//Prints output of array
void arrayOutput(int scores[], int size, int perfect)
{
 	 //Loop for printing an array
 	 for(int count = 0;count<size;count++)
 	 {
             cout<<scores[count]<<" ";
      }
      
      //Prints the number of perfect scores
      cout<<"\n";
      cout<<"You had "<<perfect<<" perfect score(s)."<<endl;
}

//Counts and returns the number of perfect scores
int countPerfect(int testScores[], int size)
{

int perfectCount=0;

//Loop goes through the enitre array
for(int count=0;count<size;count++)
{		
		//Tests each element in the array to see if it is perfect
 		if(testScores[count] == 100)
 		{
	 	              //Counts the number of perfect scores
  					  perfectCount++;
	    }
}
//Returns the number of perfect scores
return perfectCount;
}
