// ============================================================
// Second Maximum Element in Linked List
//
// Problem Statement:
// A fraud monitoring system finds the second maximum element
// from a linked list.
//
// Return:
// Second Largest Value: <value>
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

class SinglyLL
{
    public node first;

    SinglyLL()
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
    public int SecondLar()
    {
        node temp = null;

        int iMax = 0;
        int SecMax = iMax;

        temp = first;
        while(temp != null)
        {
            if((temp.data) > iMax)
            {
                SecMax = iMax;
                iMax = temp.data;
            }
            else if(temp.data > SecMax && temp.data != iMax)
            {
                SecMax = temp.data;
            }

            temp = temp.next;
        }

        return SecMax;
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
class SecondLargest 
{
    public static void main(String A[])
    { 
        SinglyLL obj = new SinglyLL();

        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.SecondLar();

        System.out.println("Second Largest element from Linked List is :"+iRet);

    }
}
