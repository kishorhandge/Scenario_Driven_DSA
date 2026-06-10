// Question:
// Input: N = 3
// Output: Ashish Ashish Ashish 
// Explanation: Name is printed 3 times.


#include<iostream>
using namespace std;

void Display()
{
    static int i = 0;

    if(i < 3)
    {
        cout<<"Ashish\n";
        i++;
        Display();
    }
}


int main()
{   
    Display();

    return 0;
}