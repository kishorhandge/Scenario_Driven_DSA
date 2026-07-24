
// ============================================================
// First-Last Digit Swap
//
// Problem Statement:
// A numeric processor swaps the first and last digit of a number.
//
// Rules:
// - Preserve sign.
// - If the number has only one digit → return the same number.
// - Ignore sign while swapping.
//
// Input:
// Integer num
//
// Output:
// Modified Number after swapping first and last digits
//
// Example:
// Input      Output
// 1234       4231
// 90         09 → 9
// -567       -765
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

import java.util.Scanner;

class First_LastDigitSwap 
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iCount = 0, iLast = 0, iFirst = 0;
        int iMiddle = 0;
        
        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        int iTemp = iNo;

        iLast = iTemp % 10;
        
        // Count digits
        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        int iMultiplier = (int)Math.pow(10, iCount - 1);

        // Restore iTemp
        iTemp = iNo;

        iFirst = iTemp / iMultiplier;

        iMiddle = (iTemp % iMultiplier) / 10;

        int Result = (iLast * iMultiplier) + (iMiddle * 10) + iFirst;

        System.out.println(Result);
    }
}