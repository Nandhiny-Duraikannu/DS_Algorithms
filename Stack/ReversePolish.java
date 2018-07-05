import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class ReversePolish {

    public int calcValue(String[] A) {
        int out,a,b;
        Stack<Integer> q= new Stack<Integer>();
        for (int i=0;i<A.length;i++)
        {
            System.out.println("a.i:"+A[i]);
            if (("*/+-").contains(A[i]))
            {
                System.out.println("in if");
                a=q.pop();
                b=q.pop();
                switch(A[i]) {
                    case "*":
                       out = q.push(a*b);
                        System.out.println("out*:"+out);
                        break;
                    case "/":
                        out = q.push(b/a);
                        System.out.println("out/:"+out);
                        break;

                    case "+":
                        out = q.push(a+b);
                        System.out.println("out+:"+out);
                        break;
                    case "-":
                        out = q.push(b-a);
                        System.out.println("out-:"+out);

                        break;

                }
            }
            else
            {

                q.push(Integer.parseInt(A[i]));
                System.out.println("else"+A[i]);
            }
        }


    return q.pop();
    }


        public static void main(String[] args)

    {
        ReversePolish r = new ReversePolish();
        String[] str={"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        System.out.println(r.calcValue(str));
    }

}
