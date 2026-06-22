// ============================================================
// Equal Sum Partition Checker
//
// Problem Statement:
// Determine whether the array can be divided into two continuous
// parts such that:
// Sum of left part == Sum of right part.
//
// Return:
// "Balanced Array" or "Not Balanced"
//
// Example:
// Input:
// [1, 2, 3, 3]
// Total sum = 9 → No equal split → Not Balanced
//
// Input:
// [1, 1, 1, 2, 1]
// Split after index 2 → (1+1+1)=3 and (2+1)=3
//
// Output:
// Balanced Array
//
// Complexity:
// Time: O(N)
// Space: O(1)
// ============================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SumPartitionChecker 
{
    public static void main(String A[]) 
    {   
        
       ArrayList<Integer> aobj = new ArrayList<>();
        
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iMid = 0,iSize = 0,iCnt = 0,iSum = 0,LeftSum = 0,RightSum = 0,iCount = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];

        System.out.println("Enter the element one by one :");

        for(iCnt = 0;iCnt < iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); 
            iSum = iSum + Arr[iCnt];

        }

        boolean Balanced = false;

        for(iCnt = 0;iCnt < iNo - 1;iCnt++)
        {
            LeftSum = LeftSum + Arr[iCnt];
            RightSum = iSum - LeftSum; 

            if(LeftSum == RightSum)
            {
                Balanced = true;
                break;
            }

        }

        if(Balanced == true)
        {
            System.out.println("Balanced Array");
        }
        else
        {
            System.out.println("Not Balanced Array");
        }
        
    }
         
}
