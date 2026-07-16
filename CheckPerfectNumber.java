
// ============================================================
// Perfect Number Checker
//
// Problem Statement:
// A mathematical engine checks whether a number is a Perfect Number.
//
// A number is Perfect if:
// The sum of its proper divisors (excluding itself) equals the number.
//
// Examples:
// 6  → 1 + 2 + 3 = 6  → Perfect
// 28 → 1 + 2 + 4 + 7 + 14 = 28 → Perfect
//
// Rules:
// - Negative numbers are automatically Not Perfect.
// - 0 and 1 are Not Perfect.
//
// Input:
// Integer num
//
// Output:
// "Perfect" or "Not Perfect"
//
// Example:
// Input      Output
// 6          Perfect
// 28         Perfect
// 12         Not Perfect
// -6         Not Perfect
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class CheckPerfectNumber 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iSum = 0,iCnt = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        if(iNo <= 1)
        {
            System.out.println("Not Perfect");
            return;
        }

        for(iCnt = 1;iCnt < iNo && iSum < iNo;iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.println("Perfect");
        }
        else
        {
            System.out.println("Not Perfect");
        }

        sobj.close();

    }
}
