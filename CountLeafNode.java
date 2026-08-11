// ============================================================
// Count Leaf Nodes
//
// Problem Statement:
// Count the number of leaf nodes in a Binary Search Tree (BST).
//
// Leaf Node Definition:
// A leaf node is a node that has no left child and no right child.
//
// Return:
// Leaf Node Count: <X>
//
// Complexity:
// Time: O(N)
// ============================================================

class node
{
    public int data;
    public node lchild;
    public node rchild;

    public node(int no)
    {
        data = no;
        lchild= null;
        rchild = null;
    }
}

class Countleaf
{
    public node first;
    public int iCount;

    Countleaf() 
    {
        first = null;
        iCount = 0;
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
                if(no > temp.data)
                {
                    if(temp.rchild == null)
                    {
                        temp.rchild = newn;
                         
                        break;
                    }

                    temp = temp.rchild;
                }
                else if(no < temp.data)
                {
                    if(temp.lchild == null)
                    {
                        temp.lchild = newn;
                         
                        break;
                    }

                    temp = temp.lchild;
                }
                else if(no == temp.data)
                {
                    System.out.println("Duplicate element not allowed");
                    break;
                }
            }
             
        }
    }

    public int Count(node temp)
    {
        if(temp == null)
        {
            return 0;
        }

        if(temp.lchild == null && temp.rchild == null)
        {
            return 1;
        }

        return Count(temp.lchild) + Count(temp.rchild);
    }

}

class CountLeafNode 
{   
    public static void main(String A[])
    {
        Countleaf cobj = new Countleaf();
        int iRet = 0;

        cobj.Insert(51);
        cobj.Insert(41);
        cobj.Insert(31);
        cobj.Insert(21);
        cobj.Insert(11);

        iRet = cobj.Count(cobj.first);

        System.out.println("Number of Nodes are : "+iRet);

    }
}
