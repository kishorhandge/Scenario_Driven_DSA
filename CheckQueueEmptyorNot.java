// ============================================================
// Queue Empty Validator
//
// Problem Statement:
// Determine whether the queue contains any elements.
//
// Return:
// Empty
// Not Empty
//
// Complexity:
// O(1)
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

    Queue()
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

    public boolean CheckEmptyorNot()
    {
        node temp = null;

        temp = first;

        if(temp == null)
        {
            return false;
        }

        return true;
 
    }

}

class CheckQueueEmptyorNot 
{
    public static void main(String A[])
    {  
        Queue qobj = new Queue();

        boolean bRet = false;

        qobj.Enqueue(51);
        qobj.Enqueue(41);
        qobj.Enqueue(31);
        qobj.Enqueue(21);
        qobj.Enqueue(11);

        bRet = qobj.CheckEmptyorNot();

        if(bRet == true)
        {
            System.out.println("Queue is not empty");
        }
        else
        {
            System.out.println("Queue is empty");
        }
    }
}
