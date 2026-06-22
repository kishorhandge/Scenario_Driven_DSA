// ============================================================
// Reverse Comparison Engine
//
// Problem Statement:
// Reverse the digits of a number and compare it with the original.
//
// If reversed number > original number →
// "Increasing After Reverse"
// Else →
// "Not Increasing"
//
// Rules:
// - Ignore sign while reversing.
// - Negative numbers → "Not Increasing".
//
// Input:
// Integer num
//
// Output:
// "Increasing After Reverse" or "Not Increasing"
//
// Example:
// Input      Output
// 123        Increasing After Reverse   (321 > 123)
// 321        Not Increasing             (123 < 321)
// -456       Not Increasing
//
// Complexity:
// O(N)
// ============================================================

import java.util.*;

class ReverseComparisonEngine 
{
    public static void main(String A[]) 
    {   

        ArrayList<Integer> aobj = new ArrayList<>();

        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iDigit = 0,iTemp = 0,iRev = 0;

        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo == 0)
        {
            System.out.println("Not Increasing");
            return;
        }

        if(iNo < 0)
        {
           iNo = - iNo;
        }

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            aobj.add(iDigit);
            iNo = iNo / 10;
        }
        
        for(int Digit : aobj)
        {
            iRev = iRev * 10 + Digit;
        }
    

        if(iRev > iTemp)
        {
            System.out.println("Increasing After Reverse");
        }
        else
        {
            System.out.println("Not Increasing");
        }

        sobj.close();
    }
}
