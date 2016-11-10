//This program calculates the user's equipment cost.
#include <iostream>
using namespace std;

int main()
{
	double amountOfBalls = 0.0, priceOfBalls = 0.0 , annualCost = 0.0;
    
	// Get the number of balls used.
	cout << "How many baseballs did you use? ";
	cin  >> amountOfBalls;

	// Get the price of the baseballs.
	cout << "How much did you pay for each baseball? ";
	cin  >> priceOfBalls;

	// Calculate the cost.
	annualCost = amountOfBalls * priceOfBalls;

	// Display the cost.
	cout << "You spent  $" <<annualCost<<" on baseballs last year "<< endl;
	system ("pause");
	return 0;
}
