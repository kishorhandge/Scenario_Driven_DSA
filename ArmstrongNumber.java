// ============================================================
// Armstrong Number Validator
//
// Problem Statement:
// A quality control system verifies whether a number is an
// Armstrong Number.
//
// A number is called an Armstrong number if:
// - Let it have n digits.
// - The sum of each digit raised to the power n equals
//   the original number.
//
// Examples:
// 153  → 1^3 + 5^3 + 3^3 = 153  → Armstrong
// 9474 → 9^4 + 4^4 + 7^4 + 4^4 = 9474 → Armstrong
//
// Rules:
// - Negative numbers are automatically considered Not Armstrong.
//
// Input:
// Integer num
//
// Output:
// "Armstrong" or "Not Armstrong"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class ArmstrongNumber 
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iCount = 0,iDigit = 0,iTemp = 0,iPow = 0,iSum = 0,iCountTemp = 0;
         
        
        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        iTemp = iNo;

        if(iNo < 0)
        {
            System.out.println("Not Armstrong Number");
            return;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        iCountTemp = iCount;


        while(iNo != 0)
        {   
            iDigit = iNo % 10;
            iPow = 1;

            while(iCount != 0)
            {
                iPow = iPow * iDigit;
                iCount--;
            }
            iCount = iCountTemp;
            
            iSum = iSum + iPow;
            iNo = iNo / 10;
        }

        if(iTemp == iSum)
        {
            System.out.println("It is a Armstrong Number");
            return;
        }
        else
        {
            System.out.println("It is not Armstrong Number");
        }

    }
}
