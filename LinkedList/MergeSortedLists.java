import org.w3c.dom.NodeList;

public class MergeSortedLists {
    public ListNode head1, head2;
    static class ListNode
    {
        int val;
        ListNode next;
        ListNode(int d)
        {
            val=d;
            next=null;
        }
    }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode h=new ListNode(0);
        ListNode m=h;
        if (A==null)
            return B;
        if (B==null)
            return A;
        while(A!=null || B!=null) {
            if (A==null) {
                h.next = new ListNode(B.val);
                h=h.next;
                B=B.next;
                continue;
            }
            if (B==null) {
                h.next = new ListNode(A.val);
                h=h.next;
                A=A.next;
                continue;
            }
            if (A.val < B.val) {
                h.next = new ListNode(A.val);
                h=h.next;
                if(A.next!=null)
                    A = A.next;
                else {
                    A = null;
                }
            } else {
                h.next = new ListNode(B.val);
                h=h.next;
                if(B.next!=null)
                    B = B.next;
                else {
                    B = null;

                }
            }
        }

        return m.next;
    }
    void printList(ListNode node) {
        System.out.println("output:");

        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)

    {
        MergeSortedLists k = new MergeSortedLists();
        k.head1=new ListNode(2);
        k.head1.next=new ListNode(8);
        k.head1.next.next=new ListNode(20);
        k.head2=new ListNode(7);
        k.head2.next=new ListNode(11);
        k.head2.next.next=new ListNode(15);
        k.printList(k.mergeTwoLists(k.head1, k.head2));

    }

}
