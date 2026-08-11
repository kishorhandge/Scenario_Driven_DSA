// ============================================================
// Even-Odd Digit Difference
//
// Problem Statement:
// A finance system calculates the difference between the sum
// of even digits and the sum of odd digits in a number.
//
// Formula:
// (Sum of Even Digits) – (Sum of Odd Digits)
//
// Input:
// Integer num
//
// Output:
// Difference Value: <X>
//
// Complexity:
// O(N)
// ============================================================

import java.util.*;

class DifferenceSumOdd_SumEven 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0;
        int iEvenSum = 0,iOddSum = 0;
        int iDiff = 0;
       
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
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            iNo = iNo / 10;
        }

        iDiff = (iEvenSum - iOddSum);

        System.out.println("Difference Value :"+(iDiff));

        sobj.close();
        

    }
}
