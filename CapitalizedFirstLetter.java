// ============================================================
// Capitalize First Letter of Every Word
//
// Problem Statement:
// A formatter converts a sentence such that the first letter
// of every word is capitalized.
//
// Given a sentence, return the formatted string.
//
// Example:
// Input: "hello world from pune"
// Output: "Hello World From Pune"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class CapitalizedFirstLetter 
{
    public static void main(String A[])
    {  
        String str = null;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        if(str == null)
        {
            System.out.println("Invalid Input");
            return;
        }

        char Arr[] = str.toCharArray();

        for(iCnt = 0;iCnt < str.length() ;iCnt++)
        {   
              
            if(Character.isLowerCase(Arr[0]))
            {
                Arr[0] = Character.toUpperCase(Arr[0]);
            }
        }

       
        System.out.println( new String(Arr));
        sobj.close();

    }
}
