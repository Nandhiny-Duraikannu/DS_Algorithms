import java.util.Stack;

public class ValidParanthesis {

    public boolean validate(char[] exp)
    {

        String begin="{[(";
        String end = "}])";
        boolean flag;

        Stack<Character> stk= new Stack<Character>();

        for(Character i:exp) {
            if (begin.contains(i.toString()))
                stk.push(i);
            if (end.contains(i.toString())) {
                char popped = stk.pop();
                if ((i=='}' && popped=='{')||(i==']' && popped=='[')|| (i==')' && popped=='('))

                    flag = true;
                else
                    return false;

            }
        }
        if (!stk.isEmpty())
            return false;
        return true;


    }


    public static void main(String args[]) {
       char[] exp = {'{','(',')','}','['};
        ValidParanthesis p = new ValidParanthesis();
        System.out.println(p.validate(exp));

    }
}
