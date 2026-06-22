
import java.util.Scanner;

class RemoveDuplicateCharacter
{
    public static void main(String A[])
    {  
        String str = null;
        int iCnt = 0;
        boolean Seen[] = new boolean[256]; //all values are false;

        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str.length());

        if(str == null)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(iCnt = 0;iCnt < str.length();iCnt++)
        {
            char c = str.charAt(iCnt);

            if(Seen[c] == false)
            {
                sb.append(c);
                Seen[c] = true;
            }
        }

        String S = sb.toString();

        System.out.println(S);

        sobj.close();

    }
}