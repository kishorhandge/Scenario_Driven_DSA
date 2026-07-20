// ============================================================
// Reverse Linked List
//
// Problem Statement:
// A linked data processor reverses the entire linked list.
//
// Output:
// Reversed Linked List
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

class Reverse
{
    public node first;

    Reverse()
    {
        first = null;
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
    }
     
    public void MakeReverse()
    {
        node prev = null;
        node curr = first;
        node next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        first = prev;
    }

    public void Display()
    {   
        node temp = null;

        temp = first;

        if(temp == null)
        {
            System.out.println("Linked List is empty");
            return;
        }

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |=>");
            temp = temp.next;
        }

        System.out.println("null");
    }
}


class ReverseTheLL 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        Reverse tobj = new Reverse();

        tobj.InsertFirst(51);
        tobj.InsertFirst(41);
        tobj.InsertFirst(31);
        tobj.InsertFirst(21);
        tobj.InsertFirst(11);

        tobj.Display();

        System.out.println("After reversing :");

        tobj.MakeReverse();

        tobj.Display();

        sobj.close();

    
    }
}
