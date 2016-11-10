/*
Drew Watson
CIS 106
Agbada
Fall15
Programming Assignment 5
11/23/15
*/
#include<iostream>
#include<iomanip>
#include<fstream>


using namespace std;

void getScore(int&);
void calcAverage(int,int,int,int,int);
void inputValidation(int&);
int findLowest(int, int, int, int, int);

int main ()
{
 	int score1,score2,score3,score4,score5; 		
 	
	getScore(score1);
	getScore(score2);
	getScore(score3);
	getScore(score4);
	getScore(score5);	
	calcAverage(score1,score2,score3,score4,score5);
	
	system("pause");
	return 0;
}

void getScore(int &score)
{
 	 cout<<"Enter a test score between 0 and 100: ";
	 cout<<"\n";
	 cin>>score;
	 
	 inputValidation(score);
}

void calcAverage(int num1, int num2, int num3, int num4, int num5)
{
 double average;
 int lowest,total,numberOfScores = 4;
 
 total = num1 + num2 + num3 + num4 + num5;
 
 lowest = findLowest(num1,num2,num3,num4,num5);
 
 cout<<"Lowest: "<<lowest<<endl;
 
 average = total - lowest; 
 
 average = average/numberOfScores;
 
 cout<<"Test average: "<<average<<endl;
 	 
}

int findLowest(int num1, int num2, int num3, int num4, int num5)
{
 	int lowest;
 	
 	if(num1 <= num2)
 	{
		 	lowest = num1;
    }
	else
	{
	 		lowest = num2;
	}		
	
	if(num3 <= lowest)
	{
 	 		lowest = num3;
	}
	
	if(num4 <= lowest)
   {
		   lowest = num4;
   }							
   
   if(num5 <= lowest)
   {
   		   lowest = num5;
   }		
		  		
return lowest;
}

void inputValidation(int &score)
{
 	if((score < 0) || (score >100))
     {
	  			 cout<<"Input Invalid. ";
	  			 getScore(score);
     }			 
	 
}
