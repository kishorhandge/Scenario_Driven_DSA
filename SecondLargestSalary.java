// ============================================================
// Second Largest Salary
//
// Problem Statement:
// A company wants to identify the second highest distinct
// salary among employees.
//
// You are given an array of N salaries.
//
// Rules:
// - There must be at least two distinct values.
// - If not, return "Invalid Input".
//
// Return:
// Second Maximum Value: <value>
//
// Example:
// Input:
// [50000, 70000, 60000, 70000]
//
// Output:
// Second Maximum Value: 60000
//
// Constraints:
// 2 ≤ N ≤ 10^5
//
// Complexity:
// Time: O(N)
// Space: O(1)
// ============================================================

import java.util.Scanner;

class SecondLargestSalary 
{
    public static void main(String A[]) 
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iCnt = 0;
        int iMax = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo < 2)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];

        for(iCnt = 0;iCnt<iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();

        }

        for(iCnt = 0;iCnt<iNo;iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                SecMax = iMax;
                iMax = Arr[iCnt];
            }
            else if(SecMax < Arr[iCnt] && Arr[iCnt] != iMax)
            {
                SecMax = Arr[iCnt];
            }
        }

        if(SecMax == Integer.MIN_VALUE)
        {
        System.out.println("Invalid Input");
        }
        else
        {
        System.out.println("Second Maximum Value: " + SecMax);
        }

        sobj.close();

    }
}
