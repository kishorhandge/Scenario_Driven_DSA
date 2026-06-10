// Question:
// Input: N = 3
// Output: Ashish Ashish Ashish 
// Explanation: Name is printed 3 times.

class Show
{   
    static int i = 0;
    public static void Display()
    {
        if(i <= 3)
        {
            System.out.println("Ashish");
            i++;

            Display();
        }
    }
}

class PrintN_times
{
    public static void main(String A[]) 
    {
        Show.Display();
    }
}