import java.util.HashSet;

class ListCycle
{
    Node head;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next=null;
    }

}


public void push(int new_data)
{
    Node new_node = new Node(new_data);
    new_node.next=head;
    head=new_node;
}

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node LoopFind(Node h)
    {
        HashSet<Node> set = new HashSet<>();
        while(h!=null) {
            if(!set.add(h)) {
                System.out.println("h" + h.data);
                return h;
            }
            h = h.next;
        }
        return null;

    }


public static void main(String args[])
{
    ListCycle l = new ListCycle();
    l.push(30);
    l.push(20);
    l.push(40);
    l.push(1);
    l.push(5);
    l.push(8);
    l.printList();

    l.head.next.next=l.head;
    Node out =l.LoopFind(l.head);
   if (out==null)
       System.out.println("No loop");
   else
        System.out.println("loop in "+out.data);

}
}