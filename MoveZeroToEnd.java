
// ============================================================
// Move Zeros to End
//
// Problem Statement:
// Rearrange the array such that:
// - All zeros are moved to the end.
// - Relative order of non-zero elements remains unchanged.
//
// Return:
// Modified array
//
// Example:
// Input:
// [0, 1, 0, 3, 12]
//
// Output:
// [1, 3, 12, 0, 0]
//
// Complexity:
// Time: O(N)
// Space: O(1)
// ============================================================

import java.util.Scanner;

class MoveZeroToEnd 
{
    public static void main(String A[]) 
    {  
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,i = 0;
        int j = 0;
        int temp = 0;
        boolean bFlag = false;

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        int Arr[] = new int[iNo];

        for(i = 0;i < iNo;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        for(i = 0;i < iNo;i++)
        {
            if(Arr[i] == 0)
            {
                j = i;
                bFlag = true;
                break;
            }
        }

    
        if(bFlag == true)
        {
            for(i = j + 1;i < iNo;i++)
            {
                if(Arr[i] != 0)
                {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                    j++;
                }
            }
        }

        for(i = 0;i < iNo;i++)
        {
           System.out.println(Arr[i]);
        }

        sobj.close();
        
    }

   
}
