// ============================================================
// Row-wise Maximum Finder
//
// Problem Statement:
// A data visualization engine needs to determine the largest
// element in each row of a matrix.
//
// Return:
// Row-wise maximum values
//
// Example:
// Input:
// [1 8 3]
// [4 2 6]
//
// Output:
// Row 1 Max: 8
// Row 2 Max: 6
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.Scanner;

class Row_WiseMaximum 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ,iCol = 0,i = 0, j = 0;
        int iMax = 0;

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
            iMax = 0;

            for(j = 0;j < iCol; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                    
                }
            }
            System.out.println("Row :"+(i+1)+"Max :"+iMax);
        }


        sobj.close();


    }
}
