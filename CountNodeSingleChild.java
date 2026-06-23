// ============================================================
// Count Nodes with Single Child
//
// Problem Statement:
// Count the number of nodes in a tree that have exactly one child.
//
// Return:
// Single Child Node Count: <X>
//
// Example:
// Input:
// Tree:
//     10
//    /
//   5
//
// Output:
// Single Child Node Count: 1
//
// Complexity:
// O(N)
// ============================================================


class node
{
    public int data;
    public node lchild;
    public node rchild;

    public node(int no)
    {
        data = no;
        lchild = null;
        rchild = null;
    }
}

class BST
{
    public node first;

    BST()
    {
        first = null;
    }

    public void Insert(int no)
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

            while(true) 
            { 
                if(no < temp.data)
                {
                    if(temp.lchild == null)
                    {
                        temp.lchild = newn;
                        break;
                    }

                    temp = temp.lchild;
                }
                else if(no > temp.data)
                {
                    if(temp.rchild == null)
                    {
                        temp.rchild = newn;
                        break;
                    }

                    temp = temp.rchild;
                }
                else 
                {
                    break;
                }
            }
        }
    }

    public void Preorder(node temp)
    {
        if(temp != null)
        {   
            System.out.print(temp.data + " ");
            Preorder(temp.lchild);
            Preorder(temp.rchild);
            
        }
    }

    public int CountSingleChild(node temp)
    {
        int iCount = 0;

        if(temp == null)
        {
            return 0;
        }

        if((temp.lchild != null && temp.rchild == null) || 
       (temp.lchild == null && temp.rchild != null))
        {
            iCount = 1;
        }


        return iCount +  CountSingleChild(temp.lchild) + CountSingleChild(temp.rchild) ;

    }
}


class CountNodeSingleChild 
{
    public static void main(String A[])
    {   
        BST bobj = new BST();
        int iRet = 0;

        bobj.Insert(51);
        bobj.Insert(41);
        bobj.Insert(31);
        bobj.Insert(21);
        bobj.Insert(11);

        bobj.Preorder(bobj.first);
        System.out.println();

        iRet = bobj.CountSingleChild(bobj.first);

        System.out.println(iRet);


    }
}
