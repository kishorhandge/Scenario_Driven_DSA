// ============================================================
// Sparse Matrix Detector
//
// Problem Statement:
// A smart analytics engine determines whether a matrix is sparse.
//
// A matrix is considered Sparse if:
// Number of zero elements > number of non-zero elements
//
// Return:
// "Sparse" or "Not Sparse"
//
// Example:
// Input:
// [0 0 3]
// [0 0 0]
//
// Zeros = 5
// Non-zeros = 1
//
// Output:
// Sparse
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.ArrayList;
import java.util.Scanner;

class SmartMatrixDetector 
{
     public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ,iCol = 0,i = 0, j = 0,iSum = 0,iZeroCount = 0,iNonZeroCount = 0;


        System.out.println("Enter the number of rows :");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of cols :");
        iCol = sobj.nextInt();

        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        for(i = 0 ;i < iRow ; i++)
        {   
            System.out.println("Enter the value of row :"+(i+1));

            for(j = 0;j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        } 
        for(i = 0 ;i < iRow ; i++)
        {   
            for(j = 0;j < iCol; j++)
            {   
                if(Arr[i][j] == 0)
                {
                    iZeroCount++;
                }
                else  
                {
                    iNonZeroCount++;
                }

            }
           
            System.out.println();
        }

        if(iZeroCount > iNonZeroCount)
        {
            System.out.println("Sparse");
        }
        else
        {
            System.out.println("Not Sparse");
        }
        

        sobj.close();
    }
}
