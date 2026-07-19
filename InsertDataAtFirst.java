// ============================================================
// Insert Urgent Task at Front of Queue
//
// Problem Statement:
// A system allows inserting urgent tasks at the front of the queue.
//
// Given:
// - A queue
// - A value X
//
// Insert X at the front of the queue.
//
// Return:
// Updated queue
//
// Example:
// Input:
// Queue: 10 20 30
// Insert Front: 5
//
// Output:
// 5 10 20 30
//
// Complexity:
// O(N)  (if normal queue)
// O(1)  (if deque)
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

class InsertUrgent
{
    public node first;

    InsertUrgent()
    {
        first = null;
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
    }
     
    public void AddFirst()
    {
         
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


class InsertDataAtFirst 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        InsertUrgent tobj = new InsertUrgent();

        tobj.Enqueue(51);
        tobj.Enqueue(41);
        tobj.Enqueue(31);
        tobj.Enqueue(21);
        tobj.Enqueue(11);

        tobj.Display();

        System.out.println("After reversing :");

        tobj.AddFirst();

        tobj.Display();

        sobj.close();

    
    }
}
