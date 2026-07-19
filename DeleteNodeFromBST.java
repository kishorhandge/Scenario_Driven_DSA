// ============================================================
// Delete Node from BST
//
// Problem Statement:
// A database stores records in a Binary Search Tree (BST).
//
// You must delete a given value from the BST while maintaining
// BST properties.
//
// Deletion Cases:
// - If the node is a leaf → remove directly.
// - If the node has one child → replace the node with its child.
// - If the node has two children → replace it with its inorder
//   successor (minimum value in right subtree).
//
// Return:
// Updated BST
//
// If the value does not exist → return "Value Not Found".
//
// Example:
// Input BST:
//      50
//     /  \
//   30    70
//
// Delete: 30
//
// Output BST:
//      50
//        \
//         70
//
// Complexity:
// O(h), where h = height of the tree
// ============================================================

import java.util.Scanner;

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

class RemoveMiddleX
{
    public node first;

    RemoveMiddleX()
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
                    System.out.println("Duplicate Element Not Allowed");
                    break;
                }
            }
             
        }

    }

    public void Inorder(node temp)
    {
        if(temp != null)
        {   
           
            Inorder(temp.lchild);
            System.out.print(temp.data+ " ");
            Inorder(temp.rchild);
            
        }
    }

    public void DeleteElement(int target)
    {   
        node temp = first;
        node parent = null;

        temp = first;

        while(temp != null && temp.data != target)
        {   
            parent = temp;

            temp = temp.lchild;

            if(target < temp.data)
            {
                temp = temp.lchild;
            }
            else
            {
                temp = temp.rchild;
            }
        }

        if(temp == null)
        {
            System.out.println("Value not found");
            return;
        }

        

    }

}

class DeleteNodeFromBST 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,Target = 0;

        RemoveMiddleX tobj = new RemoveMiddleX();

        tobj.Insert(51);
        tobj.Insert(41);
        tobj.Insert(31);
        tobj.Insert(21);
        tobj.Insert(11);

        tobj.Inorder(tobj.first);
        System.out.println();

        System.out.println("Enter the element that you want to delete");
        Target = sobj.nextInt();

        tobj.DeleteElement(Target);

        tobj.Inorder(tobj.first);
        System.out.println();

        sobj.close();
    }
}
