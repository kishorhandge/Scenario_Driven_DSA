// ============================================================
// Delete Middle Element of Stack
//
// Problem Statement:
// Given a stack of size N, remove the middle element.
//
// Rules:
// - If N is odd → remove element at index N/2 (0-based from bottom).
// - If N is even → remove the lower middle element.
//
// Return:
// Updated stack
//
// Example:
// Input:
// 1 2 3 4 5
//
// Output:
// 1 2 4 5
//
// Complexity:
// Time: O(N)
// ============================================================

import java.util.Scanner;

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

class RemoveMiddleX
{
    public node first;
    public int iCount;

    RemoveMiddleX()
    {
        first = null;
        iCount = 0;
    }

    public void Push(int no)
    {
        node newn = null;
        node temp = null;

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

    public void Pop()
    {

        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
        }

    }

    public void DeleteMiddle()
    {   

        if(first == null)
        {
            return;
        }
     
        int Middle = (iCount + 1)/2;

        if(Middle == 1)
        {
            first = first.next;
            iCount--;
            return;
        }


        int iCnt = 0;
        node target = null;

        node temp = null;

        temp = first;

        for(iCnt = 1;iCnt < (Middle - 1);iCnt++)
        {
            temp = temp.next;
        }

        target = temp.next;

        temp.next = target.next;

        iCount--;

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

class DeleteMiddleFromStack 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        RemoveMiddleX tobj = new RemoveMiddleX();

        tobj.Push(51);
        tobj.Push(41);
        tobj.Push(31);
        tobj.Push(21);
        tobj.Push(11);

        tobj.Display();

        tobj.DeleteMiddle();

        tobj.Display();

        sobj.close();
    }

}
