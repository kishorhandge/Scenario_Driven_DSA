// ============================================================
// Delete Middle Element of Queue
//
// Problem Statement:
// Given a queue of size N, remove the middle element.
//
// Rules:
// - If N is odd → remove the exact middle element.
// - If N is even → remove the lower middle element.
//
// Return:
// Updated queue
//
// Example:
// Input:
// Front → 1 2 3 4 5 → Rear
//
// Output:
// Front → 1 2 4 5 → Rear
//
// Complexity:
// O(N)
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

    public void Enqueue(int no)
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
            temp = first;

            while(temp.next != null )
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public void Dequeue()
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

        if(first == null)
        {
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
            System.out.println("Queue is empty");
            return;
        }

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |");
            temp = temp.next;
        }

        System.out.println();
    }
}

class RemoveMiddle 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        RemoveMiddleX tobj = new RemoveMiddleX();

        tobj.Enqueue(51);
        tobj.Enqueue(41);
        tobj.Enqueue(31);
        tobj.Enqueue(21);
        tobj.Enqueue(11);

        tobj.Display();

        tobj.DeleteMiddle();

        tobj.Display();

        sobj.close();

    
    }
}
