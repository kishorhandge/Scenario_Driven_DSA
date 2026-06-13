// ============================================================
// Boundary Element Counter
//
// Problem Statement:
// Count how many elements lie on the boundary of a matrix.
//
// Boundary elements include:
// - First row
// - Last row
// - First column
// - Last column
//
// Return:
// Boundary Element Count: <X>
//
// Example:
// Input:
// [1 2 3]
// [4 5 6]
// [7 8 9]
//
// Output:
// Boundary Element Count: 8
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.Scanner;

class BoundaryLevelElement 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ,iCol = 0,i = 0, j = 0,iCount = 0;

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
               if(i == 0 || (i == iRow - 1) || j == 0 || j == iCol - 1)
               {
                    iCount++;
               }
               else
               {
                    
               }
            }

            System.out.println();
        }

        System.out.println(iCount);

        sobj.close();
    }
}
