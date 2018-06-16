import java.util.Stack;
import java.util.StringTokenizer;

public class RedundantBraces {
    public int braces(String a) {
        Stack<Character> stack = new Stack<Character>();
        boolean lastPopped = false;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '(' || a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '*' || a.charAt(i) == '/') {
                stack.push(a.charAt(i));
            } else if (a.charAt(i) == ')') {
                boolean didPopSymbol = false;
                while(stack.peek() != '(') {
                    didPopSymbol = true;
                    stack.pop();
                }
                if(!didPopSymbol) return 1;
                stack.pop();
            }
        }
        return 0;
    }
}
