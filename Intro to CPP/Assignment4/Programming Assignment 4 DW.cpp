/*
Drew Watson
Agbada
Fall 15
Distance
11/12/15
*/

#include<iostream>
#include<fstream>
#include<iomanip>

using namespace std;

int main()
{
 //Variables for each arguement	
int speed = 0,inputTime = 0,distance = 0 ;
ofstream dataOut;

//Create a file called Distance Traveled
dataOut.open("Distance Traveled.txt");

//User input for speed
 cout<<"What is the speed of the vehicle in mph: ";
 cin>> speed;
 cout<<"\n";
 			
 			//Tests input validation for speed
 			if(speed < 0)
 			{
		 	cout<<"Invalid input, the speed can not be negative."<<endl;		  
 			}
 
 //User input for time
 cout<<"How many hours has it traveled: ";
 cin>>inputTime;
 cout<<"\n";
 			
 			//Tests input validation for time
			if(inputTime < 1)
 			{
			 	cout<<"Invalid input, you have to travel atleast an hour."<<endl;	  
 			}
 
 //Output to console
 cout<<"Hour\tDistance traveled"<<endl;
 cout<<"-------------------------"<<endl;
 
 //Output to a file
 dataOut<<"Hour\tDistance traveled"<<endl;
 dataOut<<"-------------------------"<<endl;
 
 	   for(int time = 1; time <= inputTime;time++)
 	   {
   			   //Calculates distance
	   		   distance = speed * time;
	   		   
	   		   //Console output
	   		   cout<<left<<setw(10)<<time<<left<<setw(7)<<distance<<endl;
	   		   
	   		   //File output
			   dataOut<<left<<setw(10)<<time<<left<<setw(7)<<distance<<endl;
 	   }
 //Closes file	   
dataOut.close();

system("pause");
return 0;	
}
