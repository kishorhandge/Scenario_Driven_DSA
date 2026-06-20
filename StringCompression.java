// ============================================================
// Basic String Compression
//
// Problem Statement:
// A compression engine compresses strings by replacing
// consecutive characters with character + frequency count.
//
// Return:
// Compressed string
//
// Example:
// Input: "aaabbc"
// Output: "a3b2c1"
//
// Complexity:
// O(N)
// ============================================================

import java.util.*;

class StringCompression 
{
    public static void main(String A[])
    {  
        String str = null;
        int iCnt = 0,iCount = 1;

        String result = "";

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        if(str.length() == 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(iCnt = 0;iCnt < str.length() ;iCnt++)
        {   
            
            if(iCnt < str.length() - 1 && str.charAt(iCnt) == str.charAt(iCnt + 1))
            {
                iCount++;
            }
            else
            {
                result = result + str.charAt(iCnt) + iCount; //result.append(str.charAt(iCnt));
                iCount = 1;                                 //result.append(iCount);
            }
        }

       
        System.out.println(result); //str.toString();
        sobj.close();

    }
}
