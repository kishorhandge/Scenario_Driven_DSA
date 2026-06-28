
// ============================================================
// Remove All Zeros
//
// Problem Statement:
// Remove every occurrence of digit 0 from a number.
//
// Rules:
// - Preserve sign.
// - If all digits are zero → return 0.
//
// Input:
// Integer num
//
// Output:
// Updated Number
//
// Example:
// Input      Output
// 102030     123
// 1000       1
// 0          0
// -2040      -24
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class RemoveAllZeros 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iRet = 0,Result = 0;

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            iNo = - iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit != 0)
            {
                Result = Result * 10 + iDigit;
            }
            iNo = iNo / 10;
        }

        while(Result != 0)
        {
            iDigit = Result % 10;

            iRet = iRet  * 10 + iDigit;
            Result = Result / 10;
        }

        System.out.println(iRet);

        sobj.close();
    }
}
