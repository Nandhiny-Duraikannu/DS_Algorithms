//Remove Nth Node from List End
public class nthDelete {

    ListNode head;
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


    public ListNode deleteNth(ListNode A, int B) {
        int i=1;
        ListNode x=A;
        while(i<B) {
            System.out.println("i :"+i+" "+B);
            if (x!=null) {
                if (i == (B - 1)) {
                    System.out.println("i1 :" + i + " " + B);
                    System.out.println("val:" + x.val + " " + x.next.val);
                    x.next = x.next.next;


                }
                x = x.next;
                i++;
            }
            else
                break;
        }

    return A;
    }
    void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)

    {
        nthDelete k = new nthDelete();
        k.head=new ListNode(1);
        k.head.next=new ListNode(2);
        k.head.next.next=new ListNode(3);
        k.head.next.next.next=new ListNode(4);
        k.head.next.next.next.next=new ListNode(5);
        k.head.next.next.next.next.next=new ListNode(6);
        k.head.next.next.next.next.next.next=new ListNode(7);
        k.head.next.next.next.next.next.next.next=new ListNode(8);
        k.printList(k.head);
        k.printList(k.deleteNth(k.head,20));

    }

}
