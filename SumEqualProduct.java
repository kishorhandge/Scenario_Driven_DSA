// ============================================================
// Sum Equals Product Validator
//
// Problem Statement:
// Approve a number only if:
// Sum of digits == Product of digits
//
// If the condition is satisfied → "Valid Number"
// Else → "Invalid Number"
//
// Rules:
// - Ignore sign.
// - If the number contains zero → product becomes zero.
//
// Input:
// Integer num
//
// Output:
// "Valid Number" or "Invalid Number"
//
// Example:
// Input      Output
// 123        Invalid Number   (1+2+3=6, 1*2*3=6 → actually Valid)
// 1124       Invalid Number
// 22         Valid Number
// 105        Invalid Number
//
// Complexity:
// O(N)
// ============================================================


import java.util.Scanner;

class SumEqualProduct 
{
    public static void main(String A[]) 
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iSum = 0,iProd = 1;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo == 0)
        {
            System.out.println("Valid Number");
            return;
        }

        if(iNo < 0)
        {
           iNo = - iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;
            iProd = iProd * iDigit;

            iNo = iNo / 10;
        }

        if(iSum == iProd)
        {
            System.out.println("Valid Number");
        }
        else
        {
            System.out.println("InValid Number");
        }

        sobj.close();
    }
}
