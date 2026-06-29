// ============================================================
// Remove Duplicates from Linked List
//
// Problem Statement:
// A duplicate cleaner removes repeated elements from a linked list.
//
// Output:
// Unique Linked List (with all duplicate elements removed)
//
// Complexity:
// O(N)
// ============================================================

class node
{
    public int data;
    public node next;

    node(int no)
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
        System.out.println("Object of SinglyLL gets created :");
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

    public void Display()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void Duplicate()
    {
        node temp = null;

        temp = first;

        while(temp != null && temp.next != null)
        {
            if(temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
           
        }
        
    }
}


class DuplicateCleaner 
{
    public static void main(String A[]) 
    {  
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(31);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
        obj.InsertFirst(11);

        obj.Display();

        obj.Duplicate();

        obj.Display();


    }
}
