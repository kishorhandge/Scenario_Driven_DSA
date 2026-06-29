// ============================================================
// Password Strength Validator
//
// Problem Statement:
// A password security system checks whether a password is strong.
//
// A password is considered strong if it contains:
// - At least one uppercase letter
// - At least one lowercase letter
// - At least one digit
//
// If all conditions are satisfied:
// "Strong Password"
// Otherwise:
// "Weak Password"
//
// Example:
// Input: "Pass123"
// Output: Strong Password
//
// Input: "password"
// Output: Weak Password
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class StrongPassword 
{
    public static void main(String A[]) 
    {  
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iCnt = 0,iCount1 = 0,iCount2 = 0,iCount3 = 0;

        System.out.println("Enter the number:");
        str = sobj.nextLine();

        for(iCnt = 0;iCnt < str.length();iCnt++)
        {   
            char ch = str.charAt(iCnt);

            if(Character.isUpperCase(ch))
            {
                iCount1++;
            }
            if(Character.isLowerCase(ch))
            {
                iCount2++;
            }
            if(Character.isDigit(ch))
            {
                iCount3++;
            }
        }

        if(iCount1 >= 1 && iCount2 >= 1 && iCount3 >= 1)
        {
            System.out.println("Strong Password");
        }
        else
        {
            System.out.println("Weak Password");
        }

        sobj.close();

    }
}
