// ============================================================
// Character Frequency Counter
//
// Problem Statement:
// Given a string 'text' and a character 'ch', count how many
// times 'ch' appears in 'text'.
//
// Return:
// Frequency Count: <count>
//
// Example:
// Input:
// text = "banana"
// ch = 'a'
//
// Output:
// Frequency Count: 3
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class ChrFrequencyCounter 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        char ch = '\0';
        int Count = 0;
        int iCnt = 0;

        System.out.println("Enter the String :");
        str = sobj.nextLine();

        System.out.println("Enter the Character :");
        ch = sobj.next().charAt(0);

        if(str == null || str == "")
        {
            System.out.println("Invalid Input:");
            return;
        }

        for(iCnt = 0;iCnt < str.length();iCnt++)
        {
            if(str.charAt(iCnt) == ch)
            {
                Count++;
            }
            
        }

        System.out.println("Frequency Count :"+Count);

        sobj.close();

        
    }
}
