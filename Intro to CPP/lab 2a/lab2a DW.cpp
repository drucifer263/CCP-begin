/*  This program has a few syntax errors and one logic error.
    Find the errors and fix them.
    Drew Watson
    CIS 106
    Agbada
    Fall 15
 */

#include <iostream>
using namespace std;

int main ()
{
	double length = 0,         // Length of a room in feet
           width = 0,          // Width of a room in feet
           area = 0 ;          // Area of the room in cu. ft.
         
   // Get the room dimensions
   cout << "Enter room length (in feet): ";
   cin  >> length;
   
   cout << "\n";
   
   cout << "Enter room width (in feet): ";
   cin  >> width;
   
   
   // Compute and display the area
   area = length * width;
   
   cout << "\n";
   cout << "The area of the room is " << area << " square feet." << endl;
   
   system ("pause");
  
   return 0;
}
