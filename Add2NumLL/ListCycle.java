
class AddNum
{
    Node head1,head2;
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

    public Node AddNUmbers(Node h1,Node h2) {

        int val1, val2, carry = 0;
        Node tmp = null,prev=null;
        while (h1 != null || h2 != null) {
            if(tmp!=null) {
                prev = tmp;
            }
            val1 = (h1 != null) ? h1.data : 0;
            val2 = (h2 != null) ? h2.data : 0;
            int data = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;
            if (h1 != null) h1 = h1.next;
            if (h2 != null) h2 = h2.next;
            tmp = new Node(data);
            tmp.next=prev;
            System.out.println("val1:" + val1 + " val2:" + val2 + " tmp.data :" + tmp.data + " carry:" + carry);

        }

        return tmp;
    }


public static void main(String args[])
{
    AddNum l1 = new AddNum();
    l1.head1 = new Node(9);
    l1.head1.next = new Node(9);
    l1.head1.next.next = new Node(1);
//    l1.head1.next.next.next = new Node(4);
//    l1.head1.next.next.next.next = new Node(6);
    System.out.print("First List is ");
    l1.printList(l1.head1);

    l1.head2 = new Node(1);
//    l1.head2.next = new Node(5);
    System.out.print("Second List is ");
    l1.printList(l1.head2);


   Node out =l1.AddNUmbers(l1.head1,l1.head2);
    System.out.println("output");
    l1.printList(out);

}
}