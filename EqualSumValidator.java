// ============================================================
// Equal Row Sum Validator
//
// Problem Statement:
// A security grid validates the structural balance of a matrix
// by checking whether all rows have equal sum.
//
// If all row sums are equal → "Balanced Rows"
// Else → "Not Balanced"
//
// Example:
// Input:
// [2 2]
// [1 3]
//
// Row sums → 4 and 4
//
// Output:
// Balanced Rows
//
// Complexity:
// O(R × C)
// ============================================================

import java.util.ArrayList;
import java.util.Scanner;

class EqualSumValidator 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iRow = 0 ,iCol = 0,i = 0, j = 0,iSum = 0,iCnt = 0,first = 0;
        boolean bRet = true;

        ArrayList<Integer> aobj = new ArrayList<>();

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
            iSum = 0;
            for(j = 0;j < iCol; j++)
            {   
                
               iSum = iSum + Arr[i][j];
            }
            aobj.add(iSum);
            
            System.out.println();
        }

        first = aobj.get(0);

        for(iCnt = 0;iCnt < aobj.size(); iCnt++)
        {   
            
            if(aobj.get(iCnt) != first)
            {
                bRet = false;
                break;
            }
        }

        if(bRet == true)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }


        sobj.close();
    }
}
