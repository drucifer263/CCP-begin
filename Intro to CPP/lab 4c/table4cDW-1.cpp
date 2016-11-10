// Lab 4 table.cpp
// This program reads data from a file and
// prints it in a nicely aligned table.
// Drew Watson.
// 10/20/15
// CIS 106

#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
using namespace std;

int main()
{
    string code,            // Item code of an inventory item
    description;            // Description of an inventory item
    int quantity;           // Quantity in stock of an inventory item
    
    ifstream dataIn;        // Define an input file stream object
    ofstream dataOut;  	    // Define an output file stream object
    
    dataIn.open("table.txt");
     
     if(dataIn.fail())
         {                
                     cout<<"The table.txt file could not be opened."<<endl;
                     cout<<"Make sure that it is located in the default directory."<<endl;
                     cout<<"It needs to be where your program expects to find it."<<endl;
         }
    
    else 
         { 
           cout<<"Your file has opened successfully."<<endl;
           
           dataOut.open("output.txt");
           
           // Print table heading
           dataOut << "     Warehouse Inventory      \n";
           dataOut << "==============================\n\n";
           dataOut << "Item        Item          Item\n";
           dataOut << "Code     Description       Qty\n\n";
    
           // Read in five data records and display them
           dataIn >> code >> description >> quantity;         // Record 1
           dataOut << left << setw(9) << code <<  setw(14) << description
           << right << setw(7) << quantity << endl;
           dataIn >> code >> description >> quantity;         // Record 2
           dataOut   << left << setw(9) << code <<  setw(14) << description
           << right << setw(7) << quantity << endl;
           dataIn >> code >> description >> quantity;         // Record 3
           dataOut   << left << setw(9) << code << setw(14) << description
           << right << setw(7) << quantity << endl;
           dataIn >> code >> description >> quantity;         // Record 4
           dataOut   <<left << setw(9) << code << setw(14) << description
           << right << setw(7) << quantity << endl;
           dataIn >> code >> description >> quantity;         // Record 5
           dataOut   << left << setw(9) << code << setw(14) << description
           << right << setw(7) << quantity << endl;
    
           // Close the files
           dataIn.close();
           dataOut.close();
           
           cout<<"Your file has saved successfully."<<endl;
           }
    
    system("pause");
    return 0;
}
