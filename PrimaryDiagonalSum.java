
// ============================================================
// Primary Diagonal Sum
//
// Problem Statement:
// Given a square matrix, calculate the sum of elements where i == j.
//
// Return:
// Primary Diagonal Sum: <X>
//
// Example:
// Input:
// Matrix =
// [1 2 3]
// [4 5 6]
// [7 8 9]
//
// Output:
// Primary Diagonal Sum: 15
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class PrimaryDiagonalSum 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0;
        int i = 0,j = 0;
        int iSum1 = 0;
        int iSum2 = 0;

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

            iSum1 = iSum1 + Arr[i][i];
                    
            iSum2 = iSum2 + Arr[i][iRow - 1 - i];
                
        }

        System.out.println("Primary Diagonal Sum is :"+iSum1);
        System.out.println("Secondary Diagonal Sum is :"+iSum2);

        sobj.close();


    }
}
