// ============================================================
// Product of Non-Zero Digits
//
// Problem Statement:
// Calculate the product of all digits in a number except zero.
//
// If all digits are zero → return 0.
//
// Input:
// Integer num
//
// Output:
// Product Value: <X>
//
// Example:
// Input      Output
// 1023       Product Value: 6
// 000        Product Value: 0
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class ProductOfNonZero 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0;
        int iProd = 1;

        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        if(iNo == 0)
        {
            System.out.println("Product Value :"+iNo);
            return;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit != 0)
            {
                iProd = iProd * iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Product Value :"+iProd);

        sobj.close();
    }
}
