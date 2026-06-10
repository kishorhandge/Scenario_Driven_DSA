/*

    Input:N = 153
    Output:True
    Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

*/

import java.util.*;

class CheckArmstrong 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iProd = 0,iDigit = 0,iTemp = 0;
         
        System.out.println("Enter the number of rows:");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iProd = iProd + (iDigit*iDigit*iDigit);
            iNo = iNo / 10;

        }

        if(iProd == iTemp)
        {
            System.out.println("It is Armstrong Number");
        }
        else
        {
            System.out.println("It is Not Armstrong Number");
        }

        sobj.close();


    }
}
