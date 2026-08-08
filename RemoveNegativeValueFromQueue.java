// ============================================================
// Remove Negative Elements from Queue
//
// Problem Statement:
// A filtering system removes all negative numbers from a queue.
//
// Given a queue of integers:
// - Remove all negative elements.
// - Preserve the relative order of remaining elements.
//
// Return:
// Updated queue
//
// Example:
// Input:
// Front → 4 -2 7 -1 9 → Rear
//
// Output:
// Front → 4 7 9 → Rear
//
// Complexity:
// O(N)
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
            while(temp.next != null)
            {
                temp = temp.next;
            }
            
            temp.next = newn;
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

class RemoveNegativeValueFromQueue 
{
    public static void main(String A[]) 
    {
        DeleteNegative nobj = new DeleteNegative();

        nobj.Enqueue(111);
        nobj.Enqueue(101);
        nobj.Enqueue(-51);
        nobj.Enqueue(41);
        nobj.Enqueue(-31);
        nobj.Enqueue(-21);
        nobj.Enqueue(-11);

        nobj.Display();

        nobj.RemoveNegative();

        nobj.Display();
    }
}
