// choice.cpp 
// This program illustrates how to use a value-returning 
// function to get, validate, and return input data.
// Drew Watson
#include <iostream>
#include <cmath>
using namespace std;

// Function prototype
int getChoice(int,int);

/*****     main     *****/
int main()
{
   int choice;
   
   cout << "Enter an integer between 1 and 4: ";
   choice = getChoice(1,4);
   // WRITE A LINE OF CODE TO CALL THE getChoice FUNCTION AND TO
   // ASSIGN THE VALUE IT RETURNS TO THE choice VARIABLE.
   
   cout << "You entered " << choice << endl;
   system("pause");
   return 0;
}

/*****     getChoice     *****/
int getChoice(int min, int max)
{
   int input;
   
   // Get and validate the input
   cin >> input;
   while (input < min || input > max)
   {  cout << "Invalid input. Enter an integer between "<<min<<" and "<<max<<": ";
      cin  >> input;
   }
   return input;
}
