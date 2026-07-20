// ============================================================
// Palindrome String Validator
//
// Problem Statement:
// A verification system checks whether a given string reads
// the same forward and backward.
//
// A string is considered a palindrome if:
// text == reverse(text)
//
// Note:
// Comparison should be case-sensitive.
//
// Return:
// "Palindrome" or "Not Palindrome"
//
// Example:
// Input: "madam"
// Output: Palindrome
//
// Input: "Hello"
// Output: Not Palindrome
//
// Complexity:
// Time: O(N)
// ============================================================

import java.util.Scanner;

class CheckPalindrome 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iCnt = 0;

        int Start = 0;
        int End = 0;

        System.out.println("Enter the String :");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        Start = 0;
        End = Arr.length - 1;

        while(Start < End)
        {
            if(Arr[Start] != Arr[End])
            {
                System.out.println("Not palindrome");
                return;
            }
            Start++;
            End--;
        }

        System.out.println(" It is a Palindrome");

    }
}
