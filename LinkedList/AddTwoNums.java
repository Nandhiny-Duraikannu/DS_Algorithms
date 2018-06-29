
class LinkedList_Add {

    ListNode head1,head2;
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            next = null;
        }
    }

    public ListNode addNum(ListNode h1,ListNode h2)
    {

        ListNode out=new ListNode(0);
        ListNode print = out;
        int carryOver=0;
        while(h1!=null)
        {
            System.out.println("carryOver:"+carryOver);
            ListNode prev=out;
            int sum = (h1.val + h2.val+carryOver);
            out.val = sum%10;
            System.out.println("out.val:"+out.val+" sum:"+sum);
            carryOver = (int)(sum/10);
            h1=h1.next;
            h2=h2.next;
            out=new ListNode(0);
            prev.next=out;
        }
        return print;
    }

    public void print(ListNode o)
    {
        while (o!=null) {
            System.out.println(o.val);
            o=o.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList_Add l1 =new LinkedList_Add();
        l1.head1= new ListNode(2);
        l1.head1.next=new ListNode(4);
        l1.head1.next.next= new ListNode(3);
        l1.head2= new ListNode(2);
        l1.head2.next=new ListNode(6);
        l1.head2.next.next= new ListNode(4);
        ListNode output = l1.addNum(l1.head1,l1.head2);
        l1.print(output);

    }
}


