/*
    Drew Watson
    CIS 106
    Fall 15
    Agbada
    3a
*/

#include<iostream>
#include<string>

using namespace std;

int main ()
{
    // Everything in comments is just alternative ways to do calculations
    
    //Constant declared
    //double const CONVERSION_TO_KILOGRAMS = 0.453592;
    
    //Variables declared and initialized
    //int pounds = 0;
    double pounds = 0; 
    double kilograms = 0;
    
    //User input prompt
    cout<< "This program will convert pounds to kilograms." << endl;
    cout<< "Enter the amount of pounds here: ";
    cin>> pounds;
    
    
    //Calculations
    kilograms = pounds / 2.2;
    
    //kilograms = pounds * CONVERSION_TO_KILOGRAMS;
    
    //kilograms = static_cast<double>(pounds) * (1 / 2.2046);
    
    //kilograms = pounds * ( 1 / 2.2046 );
    
    
    //Output
    cout<<pounds<<"lb in kilograms is: " << kilograms <<"kg." << endl;
 
 system("pause");
 return 0;   
}
