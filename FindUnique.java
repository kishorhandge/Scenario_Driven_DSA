// ============================================================
// Unique Element Counter
//
// Problem Statement:
// A warehouse needs to determine how many distinct product IDs
// are present in a dataset.
//
// Return:
// Number of Unique Elements: <count>
//
// Example:
// Input:
// [1, 2, 2, 3, 4, 4]
//
// Output:
// Number of Unique Elements: 4
//
// Complexity:
// Time: O(N)
// Space: O(N) (using HashSet)
// ============================================================

import java.util.Scanner;

class FindUnique 
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iCnt = 0;

        System.out.println("Enter the Value :");
        iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(iCnt = 0;iCnt < iNo ;iCnt++)
        {   
            Arr[iCnt] = sobj.nextInt();

        }

        System.out.print(Arr[0]+" ");

        for(iCnt = 1;iCnt < iNo  ;iCnt++)
        {   
            if(Arr[iCnt - 1] == Arr[iCnt])
            {
                continue;
            }
            System.out.print(Arr[iCnt]+" ");

        }

        sobj.close();

    }
}
