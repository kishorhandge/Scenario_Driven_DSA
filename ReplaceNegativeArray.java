// ============================================================
// Replace Negatives With Zero (Matrix Version)
//
// Problem Statement:
// A warehouse data-cleaning system processes inventory data
// stored in a 2D matrix. Due to input errors, some entries
// may contain negative values.
//
// You are given a matrix of size R x C.
//
// Your task is to:
// - Replace every negative value in the matrix with 0
// - Preserve all other elements
//
// Return:
// Updated matrix
//
// If R <= 0 or C <= 0, return "Invalid Input".
//
// Constraints:
// 1 ≤ R, C ≤ 10^3
// -10^6 ≤ matrix[i][j] ≤ 10^6
//
// Example:
// Input:
// [ 5 -3 7 ]
// [ -1 4 -2 ]
//
// Output:
// [ 5 0 7 ]
// [ 0 4 0 ]
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.Scanner;

class ReplaceNegativeArray 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0,i = 0 , j = 0 ;

        System.out.println("Enter the number of rows :");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of Cols :");
        iCol = sobj.nextInt();

        if(iRow <= 0  || iCol <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        for(i = 0;i < iRow; i++)
        {   
            System.out.println("Enter element of rows :"+(i+1));

            for( j = 0;j < iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] < 0)
                {
                    Arr[i][j] = 0;
                }
            }
        }

        for(i = 0;i < iRow; i++)
        {
            for( j = 0;j < iCol;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            
            System.out.println();
        }

        sobj.close();
    }
}
