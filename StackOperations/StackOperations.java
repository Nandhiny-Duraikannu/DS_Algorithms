import java.util.Stack;

public class StackOperations {
    Stack<Integer> stack = new Stack<Integer>();


    public void push(int x) {
        stack.push(x);

    }

    public void pop() {
        stack.pop();

    }

    public int top() {

        int peek = stack.peek();
        return peek;
    }

    public int getMin() {
        return 1;

    }
    public void print()
    {

        System.out.println(stack.toString());
    }
    public static void main(String args[])
    {

        StackOperations op = new StackOperations();
        op.push(1);
        op.push(2);
        op.push(3);
        op.push(4);
        System.out.println("top:"+op.top());
        op.pop();
        op.print();

    }
}
