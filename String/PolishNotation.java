import java.util.*;
import java.io.*;

public class PolishNotation {

    public static int evalRPN(String[] stmt)
    {
        Stack<Integer> stk = new Stack<Integer>();

        for (int i=0;i<stmt.length;i++)
        {
            switch (stmt[i])
            {
                case "+":
                    stk.push(stk.pop()+stk.pop());
                    break;
                case "-":
                    stk.push(-stk.pop()+stk.pop());
                    break;
                case "*":
                    stk.push(stk.pop()*stk.pop());
                    break;
                case "/":
                    stk.push(stk.pop()/stk.pop());
                    break;
                    default:
                stk.push(Integer.parseInt(stmt[i]));

            }

        }


        return stk.pop();

    }

    public static void main(String[] args) throws IOException {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }
}