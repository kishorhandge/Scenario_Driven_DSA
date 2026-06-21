// ============================================================
// Longest Word Finder
//
// Problem Statement:
// A word analyzer scans a sentence and determines the longest word.
//
// If multiple words have the same maximum length, return the first one.
// Words are separated by spaces.
//
// Example:
// Input: "I love programming challenges"
// Output: "programming"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class LongestWordFinder 
{
    public static void main(String A[])
    {  
        String str = null;
        int iCnt = 0,iCount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        if(str == null)
        {
            System.out.println("Invalid Input");
            return;
        }

        String[] word = str.split("\\s+");
        String longestword = "";

        for(iCnt = 0;iCnt < word.length ;iCnt++)
        {   
            if(word[iCnt].length() > longestword.length())
            {
                longestword = word[iCnt];
            }

        }

        System.out.println(longestword);

        sobj.close();

    }
}
