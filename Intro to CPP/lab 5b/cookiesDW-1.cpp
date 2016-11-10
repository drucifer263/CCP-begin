// Lab 5 - cookies.cpp  
// This program finds the average number of boxes of cookies 
// sold by the children in a particular scout troop. 
// It illustrates the use of a counter, an accumulator, 
// and an end sentinel.
// Drew Watson                        
#include <iostream>
using namespace std;

int main()
{   
   int numBoxes,         // Number of boxes of cookies sold by one child
       totalBoxes,       // Accumulates total boxes sold by the entire troop
       numSeller;        // Counts the number of children selling cookies
       
   double averageBoxes;  // Average number of boxes sold per child
   
   totalBoxes = 0;
   numSeller = 1;
   
   
   cout << "             **** Cookie Sales Information **** \n\n";
   
   // Get the first input
   cout << "Enter number of boxes of cookies sold by seller " << numSeller
        << " (or -1 to quit): ";
   cin  >> numBoxes;
   
    while(numBoxes < -1)
      	{
		  				 numBoxes = 0;
		  				 numSeller--;
		 }
   
   while( numBoxes != -1 )
   {
     
	   				 
	  				 totalBoxes += numBoxes;
	  				 numSeller++;
	   
	  
	  				 cout<<"Enter number of boxes of cookies sold by seller " << numSeller << " (or -1 to quit): ";
	  				 cin>> numBoxes;
	  				 cout<<"\n";
	  	
		  while(numBoxes < -1)
      	{
		  				 numBoxes = 0;
		  				 numSeller--;
		 }
      
   }
   
   numSeller--;
   
   if (numSeller == 0)
      cout << "\nNo boxes were sold.\n";
   else
   {  
      averageBoxes = static_cast<double>(totalBoxes) / numSeller;
      cout<<"The average number of boxes sold by the  "<< numSeller<<" sellers was "<<averageBoxes<<endl;
   }
   system("pause");
   return 0;
}
