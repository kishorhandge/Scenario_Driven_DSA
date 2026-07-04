
import java.util.Scanner;

// ============================================================
// Balanced Parentheses Checker
//
// Problem Statement:
// A mathematical evaluator checks whether parentheses in an
// expression are balanced.
//
// The expression may contain:
// (), {}, []
//
// Return:
// "Balanced" or "Not Balanced"
//
// Example:
// Input: "{[()]}"
// Output: Balanced
//
// Input: "{[(])}"
// Output: Not Balanced
//
// Complexity:
// Time: O(N)
// Space: O(N)
// ============================================================

class node
{
    public String data;
    public node next;

    public node(String str)
    {
        data = str;
        next = null;
    }
}

class Stack
{
    public node first;
    public int iCount;

    Stack()
    {
        first = null;
        iCount = 0;
    }

     
    public String CheckBalanced(String str)
    {   
        int iCnt = 0;

        for(iCnt = 0;iCnt < str.length();iCnt++)
        {
            char ch = str.charAt(iCnt);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                 
            }
        }
    }

    public void Display()
    {   
        node temp = null;

        temp = first;

        if(temp == null)
        {
            System.out.println("Stack is empty");
            return;
        }

        while(temp != null)
        {
            System.out.println("| "+temp.data+" |");
            temp = temp.next;
        }

        System.out.println();
    }

}

class BalancedParenthesisChecker 
{
    public static void main(String A[])
    { 
        Stack obj = new Stack();
       

        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter the expression :");
        str = sobj.nextLine();

        int iRet = 0;

        obj.Display();

    }
}
