import java.util.*;

class Search 
{
    public Boolean Find(int Brr[], int Target)
    {   
        int iCnt = 0;
        Boolean bFlag = false;

        for(iCnt = 0;iCnt < Brr.length;iCnt++)
        {
            if(Brr[iCnt] == Target)
            {
                bFlag = true;
                 
            }
            
        }

        return bFlag;
    }
}

class LinearSearch1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Boolean bRet = false;

        int iNo = 0,Target = 0,iCnt = 0;

        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[iNo];

        for(iCnt = 0;iCnt < iNo;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the Target:");
        Target = sobj.nextInt();

        if(Target <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        Search obj = new Search();

        bRet = obj.Find(Arr, Target);

        if(bRet == true)
        {
           System.out.println("Target Found in the Data");
        }
        else
        {
            System.out.println("Target not Found in the Data");
        }
        
        sobj.close();


    }
}