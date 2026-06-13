// ============================================================
// Next Greater Element
//
// Problem Statement:
// Given an array of integers, find the next greater element
// for each element.
//
// The next greater element is the first greater element
// to its right.
//
// If no such element exists → return -1.
//
// Example:
// Input:
// [4, 5, 2, 10]
//
// Output:
// [5, 10, 10, -1]
//
// Complexity:
// Optimized: O(N)
// ============================================================

import java.util.*;

class NextGreaterElementRightSide 
{
    public static void main(String A[])
    {  
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iCnt = 0;
        int Greater = -1;
        int iTemp = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        if(iNo <= 0 )
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];

    
        for(iCnt = 0;iCnt < iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        for(iCnt = iNo - 1;iCnt >= 0;iCnt--)
        {
            iTemp = Arr[iCnt];

            Arr[iCnt] = Greater;

            Greater = Math.max(Greater,iTemp);

        }

        for(iCnt = 0;iCnt < iNo;iCnt++)
        {
           System.out.println(Arr[iCnt]);
        }

    }
}
