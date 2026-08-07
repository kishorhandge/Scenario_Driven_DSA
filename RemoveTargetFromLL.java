// ============================================================
// Delete Node by Value in Linked List
//
// Problem Statement:
// A database removes the node containing a specific value
// from a linked list.
//
// Input:
// Target value
//
// Output:
// Updated List after deletion
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

class Target
{
    public node first;

    Target()
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
    public void Remove(int Target)
    {
        
        node temp = null;

        temp = first;

        if(first == null)
        {
            return;
        }
        if(first.data == Target)
        {
            first = first.next;
            return;
        }

        while(temp.next != null)
        {
            if(temp.next.data == Target)
            {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }

    }

    public void Display()
    {   
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |=>");
            temp = temp.next;
        }

        System.out.println("null");
    }
}


class RemoveTargetFromLL 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        Target tobj = new Target();

        tobj.InsertFirst(51);
        tobj.InsertFirst(41);
        tobj.InsertFirst(31);
        tobj.InsertFirst(21);
        tobj.InsertFirst(11);

        tobj.Display();

        System.out.println("Enter the target :");
        iNo = sobj.nextInt();

        tobj.Remove(iNo);

        tobj.Display();

        sobj.close();

    
    }
}
