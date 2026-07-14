// ============================================================
// Reverse String Formatter
//
// Problem Statement:
// A formatting engine reverses user input text for transformation analysis.
//
// Given a string 'text', return the reversed version.
//
// Example:
// Input: "Hello"
// Output: "olleH"
//
// Complexity:
// Time: O(N)
// Space: O(N)
// ============================================================

import java.util.Scanner;

class ReverseFormatter 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iCnt = 0;
        
        System.out.println("Enter the string :");
        str = sobj.nextLine();

        if(str == null)
        {
            System.out.println("Invalid String");
            return;
        }

        char Arr[] = str.toCharArray();

        for(iCnt = Arr.length - 1;iCnt >= 0 ;iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }

        sobj.close();

    }
}
