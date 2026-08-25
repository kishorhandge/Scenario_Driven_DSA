
// ============================================================
// Banking Checksum — Sum of Even Digits
//
// Problem Statement:
// A banking system validates account numbers using a simple
// checksum rule.
//
// It calculates the sum of all even digits present in the
// account number to perform secondary verification.
//
// Your task is to compute the sum of all even digits in the
// given integer.
//
// Rules:
// - Consider absolute value for negative numbers.
// - If no even digits exist, return 0.
//
// Input:
// Integer accountNumber
//
// Output:
// Sum of Even Digits: <X>
//
// Example:
// Input      Output
// 123456     Sum of Even Digits: 12
// 13579      Sum of Even Digits: 0
// -248       Sum of Even Digits: 14
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class SumEvenDigit 
{
    public static void main(String A[]) 
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iSum = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            iNo = - iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iSum = iSum + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of Even Digit :"+iSum);

        sobj.close();
    }
}
