public class RemoveDupsSortedList {

    public DupsSortedNode head;
    static class DupsSortedNode
    {
        int val;
        DupsSortedNode next;
        DupsSortedNode(int d)
        {
            val=d;
            next=null;
        }
    }

    public DupsSortedNode deleteDuplicates(DupsSortedNode A) {

        DupsSortedNode x=A;
        while(x.next!=null) {
            if (x.val == x.next.val)
                x.next = x.next.next;
            else
            x = x.next;
        }
        return A;
    }

    void printList(DupsSortedNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)

    {
        RemoveDupsSortedList k = new RemoveDupsSortedList();
        k.head=new DupsSortedNode(1);
        k.head.next=new DupsSortedNode(1);
//        k.head.next.next=new DupsSortedNode(3);
//        k.head.next.next.next=new DupsSortedNode(3);
//        k.head.next.next.next.next=new DupsSortedNode(5);
//        k.head.next.next.next.next.next=new DupsSortedNode(6);
//        k.head.next.next.next.next.next.next=new DupsSortedNode(7);
//        k.head.next.next.next.next.next.next.next=new DupsSortedNode(8);
     //   k.printList(k.head);
        k.printList(k.deleteDuplicates(k.head));

    }


}
