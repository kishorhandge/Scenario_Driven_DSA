// ============================================================
// Strictly Increasing Digits Validator
//
// Problem Statement:
// A cyber-security module validates system-generated passcodes.
//
// A number is considered Secure if its digits are in strictly
// increasing order from left to right.
//
// Strictly increasing means:
// Each digit must be greater than the previous digit.
//
// Examples:
// 12349 → Increasing Pattern
// 13579 → Increasing Pattern
// 1223  → Not Increasing (duplicate digits)
// 543   → Not Increasing
//
// Rules:
// - Single-digit numbers are considered Increasing Pattern.
// - Negative numbers are automatically Not Increasing.
// - Equality between adjacent digits invalidates the sequence.
//
// Input:
// Integer num
//
// Output:
// "Increasing Pattern" or "Not Increasing"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class StrictlyIncreasingorNot 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iTemp = 0;
        int LastDigit = 0,CurrentDigit = 0;

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Not Increasing");
            return;
        }

        LastDigit = iNo % 10;
        iNo = iNo / 10;

        while(iNo != 0)
        {
            CurrentDigit = iNo % 10;

            if(CurrentDigit > LastDigit)
            {
                System.out.println("Not Increasing");
                return;
            }

            LastDigit = CurrentDigit;

            iNo = iNo / 10;
        }

        System.out.println("Increasing");

        sobj.close();
    }
}
