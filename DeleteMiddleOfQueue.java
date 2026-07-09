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

class Queue
{
    public node first;
    public int iCount;

    Queue()
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

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;
    }
    public void RemoveMiddle()
    {   
        if(first == null)
        {
            return;
        }

        int iMiddle = 0;

        iMiddle = (iCount + 1)/2;

        node temp = null;

        temp = first;

       int iCnt = 0;
       node target = null;

       for(iCnt = 1;iCnt < (iMiddle - 1);iCnt++)
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

class DeleteMiddleOfQueue 
{
    public static void main(String A[])
    { 
        Queue obj = new Queue();

        int iRet = 0;

        obj.Enqueue(51);
        obj.Enqueue(41);
        obj.Enqueue(31);
        obj.Enqueue(21);
        obj.Enqueue(11);

        obj.Display();

        obj.RemoveMiddle();

        obj.Display();

    }
}
