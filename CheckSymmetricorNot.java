
// ============================================================
// Symmetric Matrix Checker
//
// Problem Statement:
// A seating management system stores seat compatibility data
// in a square matrix.
//
// A matrix is symmetric if:
// matrix[i][j] == matrix[j][i]
//
// Determine whether the matrix is symmetric.
//
// Return:
// "Symmetric" or "Not Symmetric"
//
// If the matrix is not square → return "Invalid Input".
//
// Example:
// Input:
// [1 2 3]
// [2 4 5]
// [3 5 6]
//
// Output:
// Symmetric
//
// Complexity:
// Time: O(N^2)
// ============================================================

import java.util.Scanner;

class CheckSymmetricorNot 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0,i = 0 , j = 0;

        System.out.println("Enter the number of rows :");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of cols :");
        iCol = sobj.nextInt();

        if(iRow < 0 || iCol < 0 || iRow != iCol)
        {
            System.out.println("Invalid Position");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        for(i = 0;i < iRow;i++)
        {
            System.out.println("Enter the element of rows :"+(i+1));

            for(j = 0;j< iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(i = 0;i < iRow;i++)
        {
            for(j = 0;j< iCol;j++)
            {
                if(Arr[i][j] != Arr[j][i])
                {
                    System.out.println("Not Symmetric");
                    return;
                }
            }
        }
        
        System.out.println("Symmetric");

        sobj.close();
        

    }
}
