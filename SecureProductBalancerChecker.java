// ============================================================
// Secure Product Balance Checker
//
// Problem Statement:
// Divide the digits of a number into two halves.
//
// If:
// Product of first half digits == Product of second half digits
// → "Secure Number"
// Else → "Not Secure"
//
// Rules:
// - If the number has an odd number of digits → ignore the middle digit.
// - Only positive numbers are allowed.
// - Single digit → "Not Secure".
//
// Input:
// Integer num
//
// Output:
// "Secure Number" or "Not Secure"
//
// Example:
// Input      Output
// 123321     Secure Number
// 12321      Secure Number
// 1234       Not Secure
// 7          Not Secure
// -123       Not Secure
//
// Complexity:
// O(N)
// ============================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SecureProductBalancerChecker 
{
    public static void main(String A[]) 
    {   
        
       ArrayList<Integer> aobj = new ArrayList<>();
        
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iProd = 1,iMid = 0,iSize = 0,iCnt = 0,iSum = 0,iSum2 = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo == 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(iNo <= 0 && iNo >= 9)
        {
            System.out.println("Not Secure");
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
        iMid = iSize/2;

        for(iCnt = 0;iCnt < iMid;iCnt++)
        {
            iSum = iSum + aobj.get(iCnt);
        }
        
        if(iSize % 2 == 0)
        {
            for(iCnt = iMid;iCnt < iSize;iCnt++)
            {
                iSum2 = iSum2 + aobj.get(iCnt);
            }
        }
        else
        {
            for(iCnt = iMid + 1;iCnt < iSize;iCnt++)
            {
                iSum2 = iSum2 + aobj.get(iCnt);
            }
        }

        if(iSum == iSum2)
        {
            System.out.println(" Secure Number");
        }
        else
        {
            System.out.println("Not Secure");
        }

        sobj.close();
    }
}
