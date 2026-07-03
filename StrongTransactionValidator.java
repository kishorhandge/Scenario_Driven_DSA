
// ============================================================
// Payment Gateway — Strong Transaction Validator
//
// Problem Statement:
// A payment gateway evaluates the strength of a transaction
// number before approving high-value transfers.
//
// A transaction is considered Strong if:
// The sum of its digits is divisible by the total number of digits.
// Otherwise, it is considered Weak.
//
// Detailed Rules:
// - Negative numbers are automatically considered Weak Transaction.
// - Digit count must be calculated correctly (0 has 1 digit).
// - Division must not cause runtime errors.
// - If (sum of digits % digit_count == 0) → Strong Transaction.
//
// Input:
// Integer transactionNumber
//
// Output:
// "Strong Transaction" or "Weak Transaction"
//
// Example:
// Input      Explanation                     Output
// 123        Sum=6, Digits=3 → 6%3=0         Strong Transaction
// 145        Sum=10, Digits=3 → 10%3≠0       Weak Transaction
// 0          Sum=0, Digits=1 → 0%1=0         Strong Transaction
// -123       Negative                        Weak Transaction
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class StrongTransactionValidator 
{
    public static void main(String A[]) 
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iSum = 0 , iCount = 0,iDigit = 0;

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Weak Transaction");
            return;
        }
        
        if(iNo == 0)
        {
            System.out.println("Strong Transaction");
            return;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iSum = iSum + iDigit;

            iNo = iNo / 10;
        }

        if(iSum % iCount == 0)
        {
            System.out.println("Strong Transaction");
            
        }
        else
        {
            System.out.println("Weak Transaction");
        }
        
        sobj.close();
    }
}
