// Lab 3c table.cpp
// This program reads data from a file and 
// prints it in a nicely aligned table.
// Drew Watson -- CIS 106 -- FALL 2015

#include <iostream>
#include<fstream>
#include<iomanip>
#include<string>

using namespace std;

int main()
{
   string code,            // Item code of an inventory item
          description;     // Description of an inventory item
   int quantity;           // Quantity in stock of an inventory item
   
   ifstream dataIn;        // Define an input file stream object
   ofstream dataOut;
   
   //Opens file table.dat
   dataIn.open("table.txt");
   dataOut.open("output.txt");
   
   // Print table heading
    dataOut << "     Warehouse Inventory      \n";
    cout << "     Warehouse Inventory      \n";
    
    
    dataOut << "==============================\n\n";
    cout << "==============================\n\n";
    
    dataOut << "Item        Item          Item\n";
    cout << "Item        Item          Item\n";
    
    dataOut << "Code     Description       Qty\n\n";
    cout << "Code     Description       Qty\n\n";
    
   
   // Read in five data records and display them
   dataIn >> code >> description >> quantity;        // Record 1
   dataOut << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   cout << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;\
   
   // Read in five data records and display them for records 2 through 5.
   dataIn >> code >> description >> quantity;        // Record 2
   dataOut << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   cout << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   
   dataIn >> code >> description >> quantity;        // Record 3
   dataOut << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   cout << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   
   dataIn >> code >> description >> quantity;        // Record 4
   dataOut << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   cout << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   
   dataIn >> code >> description >> quantity;        // Record 5
   dataOut << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   cout << left << setw(9) << code << setw(14)<< description << right << setw(7) << quantity << endl;
   
   // Close the file
   dataIn.close();
   dataOut.close();
   
   system("pause");
   
   return 0;
}
