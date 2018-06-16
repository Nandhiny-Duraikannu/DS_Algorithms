import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseWords {
    public String ReverseWords(String a)
    {
        String[] splitData = a.split("\\s");
        Collections.reverse(Arrays.asList(splitData));
        String output= "";
        for (String s: splitData)
        {
            output = output+" "+s;
        }
        return output.trim();

    }
    public static void main(String args[])
    {
        ReverseWords r = new ReverseWords();
        String out = r.ReverseWords("one two three");
        System.out.println("out:"+out);

    }
}
