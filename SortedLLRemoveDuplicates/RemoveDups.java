class RemoveDups
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void removeDuplicates()
    {

        Node current = head;

        if (head == null)
            return;

        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            else
                current = current.next;
        }
    }


    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
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

    /* Drier program to test above functions */
    public static void main(String args[])
    {
        RemoveDups llist = new RemoveDups();
        llist.push(1000);
        llist.push(200);
        llist.push(10);
        llist.push(10);
        llist.push(2);
        llist.push(2);
        llist.push(-3);
        llist.push(-3);

        System.out.println("Original list");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();
    }
}