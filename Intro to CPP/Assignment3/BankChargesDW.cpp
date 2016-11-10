/*
Drew Watson
CIS 106
Agbada
Fall 15
Assignment 3
Bank Charges
*/

#include<iostream>
#include<iomanip> 
#include<string> 
#include<fstream>
#include<cmath>  

using namespace std;

int main ()
{

//Constants 
//I used the minimum values for the names of the check fees based on what the if statements
//test for. I didn't want them to get too long like CHECK_FEE_FEWER_20 god thats a beast to type!
 const double BANK_CHARGE = 10.00, CHECK_FEE_FEWER_20 = .10, CHECK_FEE_20 = .08,
              CHECK_FEE_40 = .06, CHECK_FEE_60 = .04;
              
 //Input and output stream objects
 ifstream dataIn;
 ofstream dataOut;
 
 //Variables
 string name;
 double bankFeesTotal = 0, checkFees;
 int checkNum = 0;
 
 //User interface
 cout<<"Enter your name here: ";
 getline(cin, name);
 cout<<"\n";
 
 cout<<"Enter the number of checks you used this month: ";
 cin >>checkNum;
 cout<<"\n";
 
 // Checks the validation of the user input
         if(checkNum >= 0)
         {   
             //Checks to determine the number of checks for the month and calculates the check fees
            if(checkNum < 20)
            {
                        checkFees = checkNum *  CHECK_FEE_FEWER_20;       
            }
    
            else if (checkNum >= 20 && checkNum < 40)
            {
                       checkFees = checkNum * CHECK_FEE_20;
            }
  
            else if (checkNum >= 40  && checkNum < 60)
            {
                       checkFees = checkNum * CHECK_FEE_40;
            }
 
            else
            {
                       checkFees = checkNum * CHECK_FEE_60;
            }
         }
         else
         {
             cout<<"Invalid Input, "<<checkNum<<" is less than zero."<<endl;
         }
 
 //Totals the inital bank fee and check fees 
 bankFeesTotal = BANK_CHARGE + checkFees;
 
//Program output
// Decided to customize the output on whether the input of checks is negative
 
 cout<<"\n";
 if(checkNum >= 0 )
{
            cout<<name<<" you have used: "<<checkNum<<" checks this month."<<endl;
}

else
{
    cout<<name<<" you will still be charged the initial bank fee."<<endl;
} 

cout<<"Your bank fees are: "<<setprecision(2)<<fixed<<right<<bankFeesTotal<<endl;
cout<<"\n";
 
 
 
//Writes the users bill to an output file called Bank Charges 
 dataOut.open("BankCharges.txt");
 dataOut<<"Bank Charges"<<endl;
 dataOut<<"\n";
 dataOut<<"Customer Name: "<<name<<endl;

//Customized file output
if(checkNum >=0)
{
   dataOut<<"Check Number: "<<checkNum<<endl;
}

else
{
    dataOut<<checkNum<<" is a invalid Input"<<endl;
}

 dataOut<<"Bank Fees: "<<setprecision(2)<<fixed<<right<<bankFeesTotal<<endl;
 
 
 dataOut.close();
 system("pause");
 return 0;   
}
