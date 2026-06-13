
// ============================================================
// First Non-Repeating Character
//
// Problem Statement:
// A smart analytics system finds the first character in a string
// that does not repeat.
//
// Return:
// - If no such character exists, return "Not Found"
// - Otherwise, return the first non-repeating character
//
// Example:
// Input: "aabbcdde"
// Output: c
//
// Input: "aabbcc"
// Output: Not Found
//
// Complexity:
// Time: O(N)
// Space: O(N)
// ============================================================

import java.util.Scanner;

class FirstNon_RepeatingChar 
{
    public static void main(String A[])
    {  
        String str = null;
        int iCnt = 0,iCount = 1;
    
        String result = "";

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        if(str.length() == 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Freq[] = new int[256];

        for(iCnt = 0;iCnt < str.length() ;iCnt++)
        {   
            Freq[str.charAt(iCnt)]++;
        }

        for(iCnt = 0;iCnt < str.length() ;iCnt++)
        {   
            if( Freq[str.charAt(iCnt)] == 1)
            {
                System.out.println(str.charAt(iCnt));
                sobj.close();
                return;
            }
        }

        sobj.close();

    }
}
