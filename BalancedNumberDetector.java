// ============================================================
// Balanced Number Detector
//
// Problem Statement:
// A smart analytics engine checks whether a number is Balanced.
//
// A number is considered Balanced if:
// The sum of digits in the first half equals the sum of digits
// in the second half.
//
// Detailed Rules:
// - Only positive numbers are allowed.
// - If the number has an odd number of digits → ignore the middle digit.
// - If digit count is 1 → Not Balanced.
// - Compare first-half sum and second-half sum.
//
// Input:
// Integer num
//
// Output:
// "Balanced Number" or "Unbalanced Number"
//
// Example:
// Input       Explanation                          Output
// 123321      (1+2+3) = (3+2+1)                    Balanced Number
// 12321       Ignore middle 3 → (1+2) = (2+1)      Balanced Number
// 1234        (1+2)=3, (3+4)=7                     Unbalanced Number
// 7           Single digit                         Unbalanced Number
// -123321     Negative                             Unbalanced Number
//
// Complexity:
// O(N)
// ============================================================

import java.util.*;

class BalancedNumberDetector 
{
    public static void main(String A[]) 
    {   
        ArrayList<Integer> aobj = new ArrayList<>();
        
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iSum1 = 0,iDigit = 0,iSum2 = 0,iSize = 0,iMid = 0;
        int iCnt = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        if(iNo < 0 )
        {
            System.out.println("Unbalanced Number");
            return;
        }

        if(iNo >= 0 && iNo <= 9)
        {
            System.out.println("Unbalanced Number");
            return;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            aobj.add(iDigit);
             
            iNo = iNo / 10;
        }

       Collections.reverse(aobj);

       iSize = aobj.size();
       iMid = iSize / 2;

        for(iCnt = 0; iCnt < iMid; iCnt++)
        {
           iSum1 = iSum1 + aobj.get(iCnt);

            
        }

        if(iSize % 2 == 0)
        {
            for(iCnt = iMid; iCnt < iSize; iCnt++)
            {
                iSum2 = iSum2 + aobj.get(iCnt);
            }
        }
        else
        {
            for(iCnt = iMid + 1; iCnt < iSize; iCnt++)
            {
                iSum2 = iSum2 + aobj.get(iCnt);
            }
        }

        
        if(iSum1 == iSum2)
        {
            System.out.println("Balanced Number");
        }
        else
        {
            System.out.println("Unbalanced Number");
        }



    }
}
