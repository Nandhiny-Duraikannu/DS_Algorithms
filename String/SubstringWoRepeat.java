import java.util.*;
import java.util.regex.Pattern;

public class SubstringWoRepeat {

    public int findLength(String inp)
    {

        HashSet<Character> set = new HashSet<Character>();
        int length=0;
        for (Character i:inp.toCharArray()) {
            if (set.add(i))
                length++;
            else
                break;
        }

        if (length==0)
            return 1;
        return length;

    }

    public static void main(String args[]) {
        String input = "abcabcbb";

        SubstringWoRepeat p = new SubstringWoRepeat();
        System.out.println(p.findLength(input));

    }
}

