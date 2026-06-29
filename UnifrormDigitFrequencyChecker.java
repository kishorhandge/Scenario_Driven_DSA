// ============================================================
// Uniform Digit Frequency Checker
//
// Problem Statement:
// A fraud detection system checks whether all digits present
// in a number appear the same number of times.
//
// A number is considered valid if every digit occurs with
// equal frequency.
//
// Examples:
// 1212     → 1 appears twice, 2 appears twice → Uniform Frequency
// 123123   → each digit appears twice         → Uniform Frequency
// 1123     → frequencies differ              → Not Uniform
//
// Rules:
// - Ignore sign.
// - Single digit → Uniform Frequency.
//
// Output:
// "Uniform Frequency" or "Not Uniform"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class UnifrormDigitFrequency
{
    public static Boolean IsUniform(int iNo) 
    { 
        int iDigit = 0,iExpec = 0,iCnt = 0;

        int Arr[] = new int[10];

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            Arr[iDigit]++;
            iNo = iNo/ 10;
        }

        for(iCnt = 0;iCnt < 10;iCnt++)
        {
            if(Arr[iCnt] != 0)
            {
                iExpec = Arr[iCnt];
                break;
            }
        }

        for(iCnt = 0;iCnt < 10;iCnt++)
        {
            if(Arr[iCnt] != 0 && Arr[iCnt] != iExpec)
            {
                return false;
            }
        }

        return true;

        
    }
}

class UnifrormDigitFrequencyChecker 
{
    public static void main(String A[]) 
    {   
        UnifrormDigitFrequency uobj = new UnifrormDigitFrequency();

        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        bRet = uobj.IsUniform(iNo);

        if(bRet == true)
        {
            System.out.println("Uniform");
        }
        else
        {
            System.out.println("Not Uniform");
        }

        sobj.close();

    }
}
