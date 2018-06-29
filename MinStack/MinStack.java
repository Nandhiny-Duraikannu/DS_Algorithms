import java.util.Stack;

public class MinStack {
    int min;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {


        if(stack.isEmpty()) {
            min = x;
//            System.out.println("min value1 " + min);
        }
        if(x<min) {
            min = x;
//            System.out.println("min value2 "+min);
        }
        stack.push(x);
        System.out.println("pushed:"+x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        if (!stack.isEmpty()) {
            int peek = stack.peek();
            return peek;
        }
        else
            return -1;
    }

      public int getMin() {
        if (!stack.isEmpty())
            return min;
        else
            return -1;

   }

    public static void main(String args[])
    {
        MinStack min = new MinStack();
        min.push(2);
        min.push(30);
        min.push(11);
        min.push(9);

        System.out.println("Top is "+min.top());
        min.pop();
        System.out.println("New Top is "+min.top());
        System.out.println("Min is:"+min.getMin());



    }
}
