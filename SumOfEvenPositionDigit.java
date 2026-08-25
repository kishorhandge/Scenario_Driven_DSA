// ============================================================
// Sum of Even Position Digits
//
// Problem Statement:
// A verification engine calculates the sum of digits located
// at even positions in a number.
//
// Positions are counted from right to left starting at position 1.
//
// Example:
// Number = 1234
// Positions (from right):
// 4(1), 3(2), 2(3), 1(4)
// Even positions → 3 and 1
// Sum = 4
//
// Rules:
// - Ignore sign.
// - If single digit → sum = 0.
//
// Input:
// Integer num
//
// Output:
// Sum of Even Position Digits: <X>
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class SumOfEvenPositionDigit
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;
        int iPos = 0;
        int iSum = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iPos++;

            if(iPos % 2 == 0)
            {
                iSum = iSum + iDigit;
            }

            iNo = iNo / 10;

        }

        System.out.println("Sum Of Even Position Digit :"+iSum);

        sobj.close();
    }
}