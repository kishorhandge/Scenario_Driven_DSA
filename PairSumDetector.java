// ============================================================
// Pair Sum Detector
//
// Problem Statement:
// Given an array of N integers and a target value T, determine
// whether there exists any pair of elements whose sum equals T.
//
// Return:
// "Pair Exists" or "Not Exists"
//
// Constraints:
// 1 ≤ N ≤ 10^5
// -10^9 ≤ arr[i] ≤ 10^9
//
// Example:
// Input:
// arr = [2, 7, 11, 15]
// T = 9
//
// Output:
// Pair Exists
//
// Complexity:
// Brute Force: O(N^2)
// Optimized (HashSet): O(N)
// ============================================================

import java.util.Scanner;

class PairSumDetector 
{
     public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,Target = 0;
        int iCnt = 0;

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];


        for(iCnt = 0 ;iCnt < iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the target:");
        Target = sobj.nextInt();

        for(iCnt = 1 ;iCnt < iNo;iCnt++)
        {
            if(Arr[iCnt] + Arr[iCnt - 1] == Target)
            {
                System.out.println("Pair Exists");
                return;
            }

        }

        System.out.println("Not Exists");

    }
}
