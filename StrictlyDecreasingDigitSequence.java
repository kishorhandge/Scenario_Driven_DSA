// ============================================================
// Strictly Decreasing Digit Sequence
//
// Problem Statement:
// Check whether the digits of a number form a strictly
// decreasing sequence from left to right.
//
// Examples:
// 97531 → Valid Pattern
// 4321  → Valid Pattern
// 5441  → Invalid Pattern
// 123   → Invalid Pattern
//
// Rules:
// - Single digit → Valid Pattern
// - Negative numbers → Invalid Pattern
//
// Output:
// "Valid Pattern" or "Invalid Pattern"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class StrictlyDecreasingDigitSequence 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iTemp = 0;
        int LastDigit = 0,CurrentDigit = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        if(iNo < 0 )
        {
            System.out.println("Invalid");
            return;
        }

        LastDigit = iNo % 10;
        iNo = iNo / 10;

        while(iNo != 0)
        {
            CurrentDigit = iNo % 10;
            
            if(CurrentDigit > LastDigit)
            {
                System.out.println("not Valid");
                return;
            }

            LastDigit = CurrentDigit;   

            iNo = iNo / 10;

        }

        System.out.println("Valid");

        sobj.close();
    
    }
}
