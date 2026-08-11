// ============================================================
// Product of Odd Digits
//
// Problem Statement:
// A numeric analytics engine multiplies all odd digits present
// in a number to generate a risk factor score.
//
// You must compute the product of all odd digits in the given number.
//
// Rules:
// - Ignore zero digits in multiplication.
// - Consider absolute value.
// - If no odd digits exist, return 0.
//
// Input:
// Integer num
//
// Output:
// Product of Odd Digits: <X>
//
// Example:
// Input      Output
// 12345      Product of Odd Digits: 15
// 2468       Product of Odd Digits: 0
// -135       Product of Odd Digits: 15
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class ProductOddDigit 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iProd = 1;
        boolean bFlag = false;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo < 0)
        {
            iNo = - iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 != 0)
            {
                iProd = iProd * iDigit;
                bFlag = true;
            }

            iNo = iNo / 10;
        }

        if(bFlag == false)
        {
            iProd = 0;
        }

        System.out.println("Product of Odd Digit :"+iProd);

        sobj.close();
        

    }
}
