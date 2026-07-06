// ============================================================
// Divisible by 3 and 5 Counter
//
// Problem Statement:
// Count how many elements in the array are divisible by both 3 and 5.
//
// Return:
// Count: <value>
//
// Example:
// Input:
// [15, 30, 10, 9]
//
// Output:
// Count: 2
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class DivisibleBy3and5 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iCnt = 0;
        int iCount = 0;

        System.out.println("Enter the number of Element :");
        iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(iCnt = 0;iCnt < iNo ;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        for(iCnt = 0;iCnt < iNo ;iCnt++)
        {
            if(Arr[iCnt] %3 == 0 && Arr[iCnt] % 5 == 0)
            {
                iCount++;
            }
        }

        System.out.println(iCount);
        
        sobj.close();

    }
}
