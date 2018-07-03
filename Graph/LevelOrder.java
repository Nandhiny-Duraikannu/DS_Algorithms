import java.util.*;
class LNode
{
    int data;
    LNode left, right;
    public LNode(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    LNode root;

    public BinaryTree()
    {
        root = null;
    }
    public void printLevelOrder(LNode r) {
        Queue<LNode> q = new LinkedList<LNode>();
            System.out.println(r.data);
            if (r.left != null) {
                q.add(r.left);
            }
            if (r.right != null) {
                q.add(r.right);
            }
            if(!q.isEmpty())
                printLevelOrder(q.poll());

        }



    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root= new LNode(1);
        tree.root.left= new LNode(2);
        tree.root.right= new LNode(3);
        tree.root.left.left= new LNode(4);
        tree.root.left.right= new LNode(5);

        System.out.println("Level order traversal of binary tree is ");
        if (tree.root!=null)
            tree.printLevelOrder(tree.root);
    }
}
