// ============================================================
// Column-wise Minimum Finder
//
// Problem Statement:
// A statistical engine analyzes the smallest element from each
// column of a matrix.
//
// Return:
// Column-wise minimum values
//
// Example:
// Input:
// [3 5 7]
// [2 6 4]
//
// Output:
// Column 1 Min: 2
// Column 2 Min: 5
// Column 3 Min: 4
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.Scanner;

class ColumnWiseMin 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0,i = 0,j = 0;
        int iMin = Integer.MAX_VALUE;

        System.out.println("Enter the number of Rows :");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of Cols :");
        iCol = sobj.nextInt();

        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid Position");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        for(i = 0;i< iRow;i++)
        {   
            System.out.println("Enter the value of row:"+(i+1));
            for(j = 0;j<iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(j = 0;j<iCol;j++)
        {   
            iMin = Integer.MAX_VALUE;
            for(i = 0;i < iRow;i++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }

            System.out.println("Row :"+(j+1)+" Min :"+iMin);
        }
    }
}
