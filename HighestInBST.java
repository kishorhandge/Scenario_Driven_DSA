// ============================================================
// Height of BST
//
// Problem Statement:
// Calculate the height of a Binary Search Tree (BST).
//
// Height Definition:
// Number of edges in the longest path from root to leaf.
//
// If the tree has a single node → height = 0.
//
// Return:
// Tree Height: <X>
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
                else if(no == temp.data)
                {
                    System.out.println("Dupliacate element not allowed");
                    break;
                }
                
            }
            
        }
    }

    public int Height(node temp)
    {   
        if(temp == null)
        {
             
            return -1;
        }
         
        int left = Height(temp.lchild);
        int right = Height(temp.rchild);

        return Math.max(left, right) + 1;

    }

}


class HighestInBST 
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

        iRet = bobj.Height(bobj.first);

        System.out.println("Heighest height is :"+iRet);
    }
}
