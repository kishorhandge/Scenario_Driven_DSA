
// ============================================================
// Positive & Negative Counter
//
// Problem Statement:
// Count the number of positive and negative elements separately
// in an array.
//
// Rules:
// - Zero should not be counted as positive or negative.
//
// Return:
// Positive Count: <X>
// Negative Count: <Y>
//
// Example:
// Input:
// [-2, 5, 0, -1, 8]
//
// Output:
// Positive Count: 2
// Negative Count: 2
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class CountPositiveandNegative 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iCnt = 0;
        int iCount1 = 0;
        int iCount2 = 0;



        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];

        for(iCnt = 0;iCnt < iNo ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();

            if(Arr[iCnt] < 0)
            {
                iCount1++;
            }
            else if (Arr[iCnt] > 0)
            {
                iCount2++;
            }
            else if(Arr[iCnt] == 0)
            {
            
            }
        }

        System.out.println("Positive Count :"+ iCount2);
        System.out.println("Negative Count :"+iCount1);

        sobj.close();

    }
}
