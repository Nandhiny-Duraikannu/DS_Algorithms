//check if string contains only digits

public class CheckDigits {
    public boolean onlyDigits(String M)
    {
        if(M.contains("*\\d+"))
            return false;
        else
            return true;
    }

    public static void main(String[] args)
    {
        CheckDigits l = new CheckDigits();
        String A="6568778re979";

        System.out.println(l.onlyDigits(A));
    }
}
