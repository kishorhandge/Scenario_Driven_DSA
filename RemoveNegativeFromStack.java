
// ============================================================
// Remove Negative Values from Stack
//
// Problem Statement:
// A numeric processor filters stack data by removing all
// negative values.
//
// Given a stack of integers:
// - Remove all negative elements.
// - Preserve the order of remaining elements.
//
// Return:
// Updated stack
//
// Example:
// Input:
// 4 -2 7 -1 9
//
// Output:
// 4 7 9
//
// Complexity:
// Time: O(N)
// ============================================================


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

class DeleteNegative
{
    public node first;

    DeleteNegative()
    {
        first = null;
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
    }
    
    public void RemoveNegative()
    {
        node temp = null;

        if(first != null && first.data < 0)
        {
            first = first.next;
        }

        temp = first;

        while(temp != null && temp.next != null)
        {
            if(temp.next.data < 0)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
    }

    public void Display()
    {   
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |");
            temp = temp.next;
        }

        System.out.println();
    }

}

class RemoveNegativeFromStack 
{
    public static void main(String A[]) 
    {
        DeleteNegative nobj = new DeleteNegative();

        nobj.Push(111);
        nobj.Push(101);
        nobj.Push(-51);
        nobj.Push(41);
        nobj.Push(-31);
        nobj.Push(-21);
        nobj.Push(-11);

        nobj.Display();

        nobj.RemoveNegative();

        nobj.Display();
    }
}
