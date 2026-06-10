// Question:
// Write a recursive function to print "Jay Ganesh..." N times.
//
// Example:
//
// Input  : 5
// Output :
// Jay Ganesh...
// Jay Ganesh...
// Jay Ganesh...
// Jay Ganesh...
// Jay Ganesh...
//
// Function Prototype:
// void Display(int iNo);
//
// Condition:
// Do not use loops.
// Use recursion only.


#include<iostream>
using namespace std;

void Display()
{
    static int i = 0;

    if(i < 5)
    {
        cout<<"Jay Ganesh...\n";
        i++;
        Display();
    }
}


int main()
{   
    Display();

    return 0;
}