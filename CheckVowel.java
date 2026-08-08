// ============================================================
// Vowel Counter
//
// Problem Statement:
// A text editor analyzes written content and must count the
// number of vowels present in a sentence.
//
// Vowels are defined as:
// a, e, i, o, u (both uppercase and lowercase).
//
// Given a string 'text', return the total number of vowels.
//
// If the string is empty, return:
// Vowel Count: 0
//
// Input:
// String text
//
// Output:
// Vowel Count: <X>
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class CheckVowel 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int VowelCount = 0;
        int iCnt = 0;

        System.out.println("Enter the String :");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        //char ch = Character.toLowerCase(str.charAt(iCnt)); To Avpid To Many Conditions

        for(iCnt = 0;iCnt <Arr.length;iCnt++)
        {

            if(Arr[iCnt] == 'a' || Arr[iCnt] == 'e' || Arr[iCnt] == 'i' || Arr[iCnt] == 'o' || Arr[iCnt] == 'u'
                || Arr[iCnt] == 'A' || Arr[iCnt] == 'E' || Arr[iCnt] == 'I' || Arr[iCnt] == 'O' || Arr[iCnt] == 'U'
            )
            {
                VowelCount++;
            }
        }

        System.out.println("Vowel Count :"+VowelCount);

        sobj.close();
    }
}
