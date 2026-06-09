// ============================================================
// Maximum Frequency Element
//
// Problem Statement:
// Find the element that appears most frequently in an array.
//
// If multiple elements share the maximum frequency,
// return any one of them.
//
// Return:
// Most Frequent Element: <X>
//
// Example:
// Input:
// [1, 2, 2, 3, 3, 3]
//
// Output:
// Most Frequent Element: 3
//
// Complexity:
// Time: O(N)
// Space: O(N)
// ============================================================

 
import java.util.*;

class MaximumFreqChecker 
{
    public static void main(String A[]) 
    {   

        List<Integer> lobj = Arrays.asList();

        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iFrequency = 0,iCnt = 0,i = 0, j = 0,iMaxFrequency = 0,iMaxelement = 0;
       
        System.out.println("Enter the Number :");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("InValid Input");
            return;
        }

        int Arr[] = new int[iNo];

        boolean bRet[] = new boolean[Arr.length];

        System.out.println("Enter the element one by one :");

        for(iCnt = 0;iCnt < iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        for(i = 0;i < iNo;i++)
        {   

            if(bRet[i] == true)
            {
                continue;
            }

            iFrequency = 1;

            for(j = i+1;j < iNo ;j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iFrequency++;
                    bRet[j] = true;
                }
            }

            if(iFrequency > iMaxFrequency)
            {
                iMaxFrequency = iFrequency;
                iMaxelement = Arr[i];
            } 
         
        }

        System.out.println( "Most Frequent element is "+iMaxelement+" "+iMaxFrequency);

        sobj.close();

    }
}
