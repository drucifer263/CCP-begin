/*
Drew Watson
CIS 106
Agbada
Fall 15
Assignment 3
ISP Charges
*/

#include<iostream>
#include<iomanip> 
#include<string> 
#include<fstream>
#include<cmath>
#include<cctype>

using namespace std;

int main ()
{

//Varibale constants 
const double COST_A = 9.95, COST_B = 14.95, COST_C = 19.95, EXTRA_COST_A = 2.00, EXTRA_COST_B = 1.00;
const int HOURS_A = 10, HOURS_B = 20, MAX_HOURS = 744;

//variables 
string userName;
double totalBill = 0, userPackage = 0, extraMoney = 0; 
int userHours = 0, packageHours = 0, extraHours = 0;
char package;

//Input and output streams
ifstream dataIn;
ofstream dataOut;

//User interface
cout<<"Enter your name here: ";
getline(cin, userName);
cout<<"\n";
 
//Package menu    
cout<<"Package Types"<<endl;
cout<<"(A) Package A: $9.95 per month,10 hours of access are provided. Additional hours are $2.00 per hour."<<endl;
cout<<"(B) Package B: $14.95 per month, 20 hours of access are provided. Additional hours are $1.00 per hour."<<endl;
cout<<"(C) Package C: $19.95 per month, unlimited access is provided."<<endl;
cout<<"Enter the letter of the package you have: ";
cin>> package;
cout<<"\n";

//Forces switch to be all uppercase
package = toupper(package);


//Switch cases place the package price and hours into the their respective variable
      switch (package)
      {
             case 'A': userPackage = COST_A;
                       packageHours = HOURS_A;
                       break;
                       
             case 'B': userPackage = COST_B;
                       packageHours = HOURS_B;
                       break;
                       
             case 'C': userPackage = COST_C;
                       break;
                       
             default: cout<<"Incorrect input value "<<endl;
             
      }

cout<<"Enter the number of hours used this month: ";
cin >>userHours;
cout<<"\n";

//If statements check the package and if there are any overages on the account

/*
I could have used the package variable here but decided to use the userPackage
I provided an example of the proposed code

-Alternative check:
 
 if( package == 'A' && userHours > 10)
                       {
                           extraHours = userHours - packageHours;
                           extraMoney = extraHours * EXTRA_COST_A;
                                       
                                       }
else if(package == 'B' && userHours > 20)
                    {
                           extraHours = userHours - packageHours;
                           extraMoney = extraHours * EXTRA_COST_B;           
                    }
else
{
    cout<<"You have not exceeded your package hours this month."<<endl;
}
*/



//Checks that the user's hours do not exceed 744
if(userHours <= MAX_HOURS)
{
    //Checks if it is package A, by the cost, and if the hours are over then calculates the extra money
   // and time
   if( userPackage == COST_A && userHours > 10)
                       {
                           extraHours = userHours - packageHours;
                           extraMoney = extraHours * EXTRA_COST_A;
                                       
                       }
   //Checks if it is package B, by the cost, and if the hours are over then calculates the extra money
   // and time
   else if(userPackage == COST_B && userHours > 20)
                    {
                           extraHours = userHours - packageHours;
                           extraMoney = extraHours * EXTRA_COST_B;           
                    }
   else
   {
       cout<<"You have not exceeded your package hours this month."<<endl;
    }


                      
//Calculates the total bill from the extra money and the userPackage
totalBill = userPackage + extraMoney;

//Program output
cout<<"\n";
cout<<userName<<" you have used: "<<userHours<<" hours this month."<<endl;
cout<<"Your Package was: "<<package<<endl;
cout<<"You used: "<<extraHours<<" extra hours this month."<<endl;
cout<<"They cost: "<<setprecision(2)<<fixed<<right<<extraMoney<<endl;
cout<<"Your ISP fees are: "<<setprecision(2)<<fixed<<right<<totalBill<<endl;
cout<<"\n";

//Creates a file ISP Charges and stores the users data 
dataOut.open("ISPCharges.txt");
dataOut<<"ISP Charges"<<endl;
dataOut<<"\n";
dataOut<<"Customer Name: "<<userName<<endl;
dataOut<<"Package: "<<package<<endl;
dataOut<<"Hours Over: "<<extraHours<<endl;
dataOut<<"Overage Charges: "<<setprecision(2)<<fixed<<right<<extraMoney<<endl;
dataOut<<"ISP Fees: "<<setprecision(2)<<fixed<<right<<totalBill<<endl;

dataOut.close();

}

else
{
               cout<<"Your hours cannot exceed "<<MAX_HOURS<<endl;
}
system("pause");
return 0;   
}    
