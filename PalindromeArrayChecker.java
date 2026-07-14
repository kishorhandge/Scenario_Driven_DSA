// ============================================================
// Palindrome Array Checker
//
// Problem Statement:
// An array is called a palindrome if it reads the same
// forward and backward.
//
// Determine whether the given array is a palindrome.
//
// Return:
// "Palindrome" or "Not Palindrome"
//
// Example:
// Input:
// [1, 2, 3, 2, 1]
//
// Output:
// Palindrome
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class PalindromeArrayChecker 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iCnt = 0;
        

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo]; 

        int Start = 0;
        int End = Arr.length - 1;

        for(iCnt = 0;iCnt < iNo ;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

         
        while(Start < End)
        {
            if(Arr[Start] != Arr[End])
            {
                System.out.println(" Not Palindrome");
                return;
            }

            Start++;
            End--;
        }

        System.out.println("Palindrome");

        sobj.close();

    }
}
