import java.util.*;
    class NodeBT
    {
        int data,hd;
        NodeBT left, right;

        NodeBT(int item)
        {
            data = item;
            left = right = null;
        }
    }

    class Values
    {
        int max, min;
    }

    class VerticalBT
    {
        NodeBT root;
        NodeBT focusNode=root;
        void calculateHd(NodeBT node)
        {
            // Base case
            if (node == null)
                return;
            if(focusNode==root) {
                root.hd = 0;
                focusNode=root.left;
            }

            while (focusNode!=null)
            {

            }
        }

        void printVerticalLine(NodeBT node, int line_no, int hd)
        {
            // Base case
            if (node == null)
                return;

            // If this node is on the given line number
            if (hd == line_no)
                System.out.print(node.data + " ");

            // Recur for left and right subtrees
            printVerticalLine(node.left, line_no, hd - 1);
            printVerticalLine(node.right, line_no, hd + 1);
        }

        // The main function that prints a given binary tree in
        // vertical order
//        void verticalOrder(NodeBT node)
//        {
//            calculateHd(node);
//
////            for (int line_no = val.min; line_no <= val.max; line_no++)
////            {
////                printVerticalLine(node, line_no, 0);
////                System.out.println("");
////            }
//        }

        // Driver program to test the above functions
        public static void main(String args[])
        {
            VerticalBT tree = new VerticalBT();

            /* Let us construct the tree shown in above diagram */
            tree.root = new NodeBT(1);
            tree.root.left = new NodeBT(2);
            tree.root.right = new NodeBT(3);
            tree.root.left.left = new NodeBT(4);
            tree.root.left.right = new NodeBT(5);
            tree.root.right.left = new NodeBT(6);
            tree.root.right.right = new NodeBT(7);
            tree.root.right.left.right = new NodeBT(8);
            tree.root.right.right.right = new NodeBT(9);

            System.out.println("vertical order traversal is :");
            tree.calculateHd(tree.root);
        }
    }