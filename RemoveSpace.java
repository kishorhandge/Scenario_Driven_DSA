
// ============================================================
// Remove All Spaces
//
// Problem Statement:
// A smart filter removes all space characters from a given sentence.
//
// Given a string 'sentence', remove all occurrences of ' '.
//
// Return:
// Updated string without spaces
//
// Example:
// Input: "Hello World Test"
// Output: "HelloWorldTest"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Scanner;

class RemoveSpace 
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter the string :");
        str = sobj.nextLine();

        if(str == null)
        {
            System.out.println("Invalid Input");
            return;
        }

        String str1 = str.replaceAll("\\s", "");

        System.out.println(str1);

        sobj.close();


    }
}
