// ============================================================
// Delete First Node in Linked List
//
// Problem Statement:
// A company removes the first employee record from a list.
//
// Operation:
// Delete the first node of the linked list.
//
// Output:
// Updated List after deletion
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
    public void DeleteFirst()
    {
        node temp = null;

        if(first == null)
        {
            return;
        }
        else 
        {
            temp = first;

            first = first.next;

        }
    }

    public void Display()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data +" |->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}


class RemoveFirst 
{
    public static void main(String A[])
    {  
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(41);
        obj.InsertFirst(31);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        obj.DeleteFirst();

        obj.Display();

    }
}
