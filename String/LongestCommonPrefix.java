import java.util.HashSet;

public class LongestCommonPrefix {
    public String findPrefix(String[] A) {
        String prefix=A[0];
            for (int i = 1; i < A.length; i++)
                while (A[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
        return prefix;
    }

    public static void main(String[] args)
    {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] inp={ "abcdefgh", "abfghijk","abcefgh"};
        System.out.println(l.findPrefix(inp));
    }
}
