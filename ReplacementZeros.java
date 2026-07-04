// ============================================================
// Zero Replacement Processor
//
// Problem Statement:
// A numeric formatting engine replaces every occurrence of digit
// 0 with digit 1 to avoid system parsing issues.
//
// Your task is to modify the given number by replacing all zeros
// with ones.
//
// Rules:
// - Preserve sign.
// - If input is 0, output should be 1.
//
// Input:
// Integer num
//
// Output:
// Modified integer
//
// Example:
// Input      Output
// 1020       1121
// 900        911
// 0          1
// -204       -214
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class ReplacementZeros 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number");
        iNo = sobj.nextInt();


        String str = Integer.toString(iNo);

        String str1 = str.replaceAll("0", "1");

        int Number = Integer.parseInt(str1);

        System.out.println(Number);


        sobj.close();

    }
}
