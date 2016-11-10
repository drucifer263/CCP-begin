// areas.cpp 
// This menu-driven program finds areas of squares, 
// circles, and right triangles.
// Drew Watson
#include <iostream>
using namespace std;

//Prototypes
void displayMenu();
void findSquareArea();
void findCircleArea();
void findTriangleArea();

const double PI = 3.14159;

int main()
{   
	// User's menu choice
	int choice;   
 	
 	//Displays menu
 	displayMenu();
 	
	 //Users choice
 	cin>>choice;
   
   // Find and display the area of the user's chosen object
   if (choice == 1)                              // square
   {  
	  findSquareArea();
   }
   else if (choice == 2)                         // circle
   {  
   	  findCircleArea();
   }
   else if (choice == 3)                         // right triangle
   {  
   	  findTriangleArea();
   }
   else if (choice != 4)						// input validation
      cout << "Choice must be 1, 2, 3, or 4.\n";

system("pause");
return 0;
}

// Display the menu
void displayMenu()
{
 
  	 cout << "Program to calculate areas of different objects \n\n";
	 cout << "        1 -- Square \n"
		  << "        2 -- Circle \n"
		  << "        3 -- Right triangle \n"
    	  << "        4 -- Quit \n\n";
}

void findSquareArea()
{
 	 double side,area;
 	 
 	 cout << "Length of the square's side: ";
	 cin  >> side;
	 area = side * side;
	 cout << "Area = " << area << endl;
}

void findCircleArea()
{
 	 double radius,area;
 	 
 	 cout << "Radius of the circle: ";
	 cin  >> radius;
  	 area = PI * radius * radius;
     cout << "Area = " << area << endl;
}

void findTriangleArea()
{
 	 double base,height,area;
 	 
 	 cout << "Base of the triangle: ";
   	 cin  >> base;
	 cout << "Height of the triangle: ";
	 cin  >> height;
	 area = .5 * base * height;
	 cout << "Area = " << area << endl;
}


