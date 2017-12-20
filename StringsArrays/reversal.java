

public class reversal {

    static String reverse(String str) {

        int len = str.length();
        StringBuilder dest = new StringBuilder();

        for (int i = (len - 1); i >= 0; i--)

        {
            dest.append(str.charAt(i));
        }
        return dest.toString();

    }
    public static void main(String[] args)
    {
        String input = "n%hhn09ml";
        System.out.println(reverse(input));
    }

}