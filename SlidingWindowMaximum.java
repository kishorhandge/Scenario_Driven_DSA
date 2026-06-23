// ============================================================
// Sliding Window Maximum
//
// Problem Statement:
// Given an array and a window size K, find the maximum element
// in each sliding window.
//
// Note:
// Use deque-based optimization for efficient computation.
//
// Example:
// Input:
// Array: [1, 3, -1, -3, 5, 3, 6, 7]
// K = 3
//
// Output:
// [3, 3, 5, 5, 6, 7]
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class SlidingWindowMaximum 
{
    public static void main(String A[]) 
    {   
        List<Integer> lobj = new ArrayList<>();

        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int k = 0;
        int iMax  = 0;
        int iCnt = 0, i = 0, j = 0;

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the value of k :");
        k = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];

        for(iCnt = 0;iCnt < iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        for(i = 0;i <= iNo - k;i++)
        {
            
            iMax = Arr[i];

            for(j = i; j < i + k ;j++)
            {
                if(Arr[j] > iMax)
                {
                    iMax = Arr[j];
                    
 
                } 
            }

            lobj.add(iMax);
        }

        System.out.println(lobj);


    }
}
