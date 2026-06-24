
// ============================================================
// Linked List Palindrome Checker
//
// Problem Statement:
// A smart analyzer checks whether a linked list is a palindrome.
//
// A linked list is considered a palindrome if it reads the same
// forward and backward.
//
// Output:
// "Palindrome" or "Not Palindrome"
//
// Complexity:
// O(N)
// ============================================================

import java.util.Stack;

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class LL
{
    public node first;
    public int iCount;

    LL()
    {
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;
        
        newn = new node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void Display()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void CheckPalindrome()
    {   
       

        Stack<Integer> sobj = new Stack<>();
        node temp = null;
        int iCnt = 0;

        temp = first;

        while(temp != null)
        {
            sobj.push(temp.data);
            temp = temp.next;
        }

        temp = first;

        while(temp != null)
        {
            if(temp.data != sobj.pop())
            {
                System.out.println("Not Palindrome");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Palindrome");
        
    }
}

class CheckLLPalindrome 
{
    public static void main(String A[]) 
    {
        LL obj = new LL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        obj.CheckPalindrome();
    }
}
