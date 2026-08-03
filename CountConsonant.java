// ============================================================
// Consonant Counter
//
// Problem Statement:
// A linguistic analyzer processes text data and counts the
// total number of consonants.
//
// Consonants are alphabetic characters that are not vowels.
// Ignore digits, spaces, and special characters.
//
// Input:
// String text
//
// Output:
// Consonant Count: <count>
//
// Example:
// Input: "Hello World123"
// Output: Consonant Count: 7
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class CountConsonant 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int ConsonantCount = 0;
        int iCnt = 0;

        System.out.println("Enter the String :");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(iCnt = 0;iCnt <Arr.length;iCnt++)
        {
            char ch = Character.toLowerCase(Arr[iCnt]);

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                {
                    ConsonantCount++;
                }
            }

        }

        System.out.println("Consonant Count :"+ConsonantCount);

        sobj.close();
    }
}
