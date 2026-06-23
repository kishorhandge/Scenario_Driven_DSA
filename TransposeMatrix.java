// ============================================================
// Matrix Transpose
//
// Problem Statement:
// A smart processor must compute the transpose of a matrix.
//
// Transpose means:
// transpose[i][j] = matrix[j][i]
//
// Return:
// Transposed matrix
//
// Example:
// Input:
// [1 2 3]
// [4 5 6]
//
// Output:
// [1 4]
// [2 5]
// [3 6]
//
// Complexity:
// Time: O(R × C)
// Space: O(R × C)
// ============================================================

import java.util.Scanner;

class TransposeMatrix
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ,iCol = 0,i = 0, j = 0;

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

        for(j = 0;j < iCol; j++)
        {   

            for(i = 0 ;i < iRow ; i++)
            {
                System.out.print(Arr[i][j]+" ");
            }

            System.out.println();
        }

        sobj.close();
    }
}