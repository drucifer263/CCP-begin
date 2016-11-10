/*
Drew Watson
Assignment 1
CIS 106 
Agbada
Fall 15
*/
#include<iostream>
#include<string>

using namespace std;

int main()
{
    /*
      I tweeked the assignment a bit so that there is input from the user.
      Also added some other stuff.
    */
    
    //Constants declared
    const double tip15 = 0.15, tip20 = 0.20, tip25 = 0.25;
    const double tax = 0.0675;
    const double mealAmount = 44.50; //alternative to taking input from user

    //Variables declared
    int people = 0;
    double mealCost = 0, billWithTax = 0, totalBill15 = 0,
       totalBill20 = 0, totalBill25 = 0,taxAmount = 0,
       tempTip15 =0,tempTip20 = 0, tempTip25 = 0, peopleBillTotal15 = 0,
       peopleBillTotal20 = 0,peopleBillTotal25 = 0;
   
  
    //User Interface
    cout<<"Enter the amount of your bill: ";
    cin>> mealCost;
    
    cout<<"Enter the number of people: ";
    cin>>people;
   
   /*
   //Alternative calculation 
   taxAmount = mealAmount * tax;
   billWithTax = taxAmount + mealAmount;
    */
    
    
    //Calculations: tax amount from meal
    taxAmount = mealCost * tax;

    //Calculations: meal with tax
    billWithTax = taxAmount + mealCost;

    //Calculations: tip at 15
    tempTip15 = tip15 * billWithTax;
   
    //Calculations: bill with tip at 15
    totalBill15 = tempTip15 + billWithTax;
   
    //Calculations: tip at 20
    tempTip20 = tip20 * billWithTax;

    //Calculations: bill with tip at 20
    totalBill20 = tempTip20 + billWithTax;

    //Calculations: tip at 25
    tempTip25 = tip25 * billWithTax;

    //Calculations: bill with tip at 25
    totalBill25 = tempTip25 + billWithTax;
 
    //Output
    cout<<"\n";
    cout<<"Meal Cost:  "<< mealCost << endl;
    cout<<"Tax amount: "<< taxAmount << endl;
    cout<<"Meal with tax: "<< billWithTax << endl;
    
    cout<<"\n";
    
    cout<<"Tip amounts"<<"\t"<<"Total bill" << endl;
    cout<<"15%: "<< tempTip15 <<"\t"<< totalBill15 << endl;
    cout<<"20%: "<< tempTip20 <<"\t"<< totalBill20 << endl;
    cout<<"25%: "<< tempTip25 <<"\t"<< totalBill25 << endl;

    //Extra stuff
        
    cout<<"\n";
    cout<<"\n";

    // Conversion to two decimal places
    cout<<"Two precision output"<<endl;
    cout<<"\n";
    cout.precision(2);
    cout<<"Meal Cost:  "<< fixed << mealCost << endl;
    cout<<"Tax amount: "<< fixed << taxAmount << endl;
    cout<<"Meal with tax: "<< fixed << billWithTax << endl;
    
    cout<<"\n";
    
    cout<<"Tip amounts"<<"\t"<<"Total bill" << endl;
    cout<<"15%: "<< fixed << tempTip15 << "\t" << fixed << totalBill15 << endl; 
    cout<<"20%: "<< fixed << tempTip20 << "\t" << fixed << totalBill20 << endl;
    cout<<"25%: "<< fixed << tempTip25 << "\t" << fixed << totalBill25 << endl;
    
    cout<<"\n";
    
    //Calculates the bill per person
    peopleBillTotal15 = totalBill15 / people;
    peopleBillTotal20 = totalBill20 / people;
    peopleBillTotal25 = totalBill25 / people;
    
    cout<< people << " person/people pay: " << endl;
    cout<< "15%: "<< fixed << peopleBillTotal15 << endl;
    cout<< "20%: "<< fixed << peopleBillTotal20 << endl; 
    cout<< "25%: "<< fixed << peopleBillTotal25 << endl; 
    
system("pause");
return 0;
}
