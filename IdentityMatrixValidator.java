
// ============================================================
// Identity Matrix Validator
//
// Problem Statement:
// A smart validation system must determine whether a given
// square matrix is an Identity Matrix.
//
// A matrix is identity if:
// - All diagonal elements are 1
// - All non-diagonal elements are 0
//
// If the matrix satisfies both conditions:
// "Identity"
// Otherwise:
// "Not Identity"
//
// If the matrix is not square → return "Invalid Input".
//
// Example:
// Input:
// [1 0 0]
// [0 1 0]
// [0 0 1]
//
// Output:
// Identity
//
// Complexity:
// Time: O(N^2)
// ============================================================

import java.util.Scanner;

class IdentityMatrixValidator 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0,i = 0 , j = 0;
        boolean bFlag = true;

        System.out.println("Enter the Number of rows :");
        iRow = sobj.nextInt();
         
        System.out.println("Enter the Number of cols :");
        iCol = sobj.nextInt();

        if(iRow <= 0 || iCol <= 0 || iRow != iCol)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        for(i = 0 ;i< iRow; i++)
        {
            System.out.println("Enter the element of row :"+(i+1));

            for(j = 0;j < iCol;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(i = 0 ;i< iRow; i++)
        {
            for(j = 0;j < iCol;j++)
            {   

                System.out.println(Arr[i][j]+ " ");

                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        bFlag = false;
                        break;
                    }
                }
                else if(i > j || i < j)
                {
                    if(Arr[i][j] != 0)
                    {
                        bFlag = false;
                        break;
                    }
                }
            }
        }

        if(bFlag == true)
        {
            System.out.println("Identity");
        }
        else
        {
            System.out.println("Not Identity");
        }

        sobj.close();
    }

    
}
