/*
Drew Watson
Assignment 2
CIS 106 
Agbada
Fall 15
*/

#include<iostream>
#include<string>
#include<fstream>
#include<cmath>
#include<iomanip>


using namespace std;

int main()
{
    //Variables Declared
    double amount = 0, rate = 0, principal = 0,
	   temp = 0,temp2 = 0, interestRate = 0;

    int compounded = 0;
   
    ofstream fileOut;


//Opens and creates a text file called CD
fileOut.open("CD.txt");

// User Interface
cout << "This program will calculate your compound interest." << endl;

cout << "Enter the principal amount here: ";
cin >> principal;

cout << "Enter the interest rate here: ";
cin >> rate;

cout << "Enter how many times it is compounded a year: ";
cin >> compounded ;
cout << "\n";

//Converts the rate into a percentage
rate = rate/100.00;

//Breaks the right side of the interest equation into 
//two seperate variables and holds them temperarily 
temp = (1 +(rate/compounded));
temp2 = pow(temp,compounded);

//Multiplies the principal by the second temp variable to finish equation
amount = principal * temp2;

//Calculates the interest rate
interestRate = amount - principal;

//Converts the percentage rate 
rate = rate * 100.00;

//User output
cout << "Interest Rate: " << setprecision(2) <<  fixed << rate;
cout << "\n";
cout << "Times Compounded: " << setprecision(2) << compounded;
cout << "\n";
cout << "Principal: " << setprecision(2) << fixed << principal;
cout << "\n"; 
cout << "Interest: " << setprecision(2) << fixed << interestRate;
cout << "\n"; 
cout << "Final Balance: " << setprecision(2) << fixed << amount;
cout << "\n"; 

//Transfers all output to a file
fileOut <<"Compound Interest Rate on Investment" << endl;
fileOut <<"\n";
fileOut << "Interest Rate: " << setprecision(2) << fixed << rate;
fileOut << "\n";
fileOut << "Times Compounded: " << setprecision(2) << compounded;
fileOut << "\n";
fileOut << "Principal: " << setprecision(2) << fixed << principal;
fileOut << "\n"; 
fileOut << "Interest: " << setprecision(2) << fixed << interestRate;
fileOut << "\n"; 
fileOut << "Final Balance: " << setprecision(2) << fixed << amount;
fileOut << "\n"; 


//Closes the file
fileOut.close();

//Pauses the console
system("pause");

//Lets the computer know the operation was successful
return 0;

}
