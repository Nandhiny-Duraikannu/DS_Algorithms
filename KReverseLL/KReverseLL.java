public class KReverseLL {

    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }

    }


    void printList(Node h)
    {

        while (h != null)
        {
            System.out.print(h.data+" ");
            h = h.next;
        }
        System.out.println();
    }

    public Node Reverse(Node h, int k) {

        Node top = h, bottom = h, tmp = null,ptr1,ptr2;
            while (k != 0) {
                k--;
                bottom = bottom.next;
                if(k==1)
                    ptr2=bottom;
            }

            while (top != bottom) {
                ptr1=top.next;
                ptr2=bottom;
                tmp= top.next;
                bottom.next = top.next;
                top.next = tmp;
                top=bottom.next;
                top=ptr1;


            }


return h;
    }

    public static void main(String args[])
    {
        KReverseLL l1 = new KReverseLL();
        l1.head = new Node(9);
        l1.head.next = new Node(10);
        l1.head.next.next = new Node(1);
        l1.head.next.next.next = new Node(4);
        l1.head.next.next.next.next = new Node(6);
        l1.head.next.next.next.next = new Node(3);
        System.out.print("List is ");
        l1.printList(l1.head);
        int k=3;

        Node out =l1.Reverse(l1.head,k);
        System.out.println("output");
        l1.printList(out);

    }
}