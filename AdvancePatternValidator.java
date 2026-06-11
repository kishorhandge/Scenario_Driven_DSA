// ============================================================
// Advanced Pattern Validator
//
// Problem Statement:
// A pattern recognition system validates a special matrix property:
//
// Conditions:
// - Every row must be sorted in strictly ascending order
// - Every column must be sorted in strictly descending order
//
// If both conditions are satisfied:
// "Valid Pattern"
// Else:
// "Invalid Pattern"
//
// Example:
// Input:
// [1 2 3]
// [0 1 2]
// [-1 0 1]
//
// Rows → strictly ascending 
// Columns → strictly descending 
//
// Output:
// Valid Pattern
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.*;

class AdvancePatternValidator 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0;
        int i = 0,j = 0;
        
        System.out.println("Enter the number of rows:");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of cols:");
        iCol = sobj.nextInt();

        if(iRow != iCol)
        {
            System.out.println("Matrix Must be squared");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        for(i = 0;i < iRow;i++)
        {
            System.out.println("Enter the elements of row :"+(i+1));

            for(j = 0;j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(i = 0;i < iRow;i++)
        {
             
            for(j = 0;j < iCol; j++)
            {
                Arrays.sort(Arr[i][j]);
            }
        }

         

        sobj.close();


    }
}
