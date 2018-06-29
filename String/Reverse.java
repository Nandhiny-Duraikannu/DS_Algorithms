import java.util.*;
public class Reverse {

    public String getReverse(String stmt)
    {
        List<String> wordList= new ArrayList<String>();

        wordList = Arrays.asList(stmt.split("\\s"));
        Collections.reverse(wordList);
        System.out.println(wordList);

        return wordList.toString();

    }

    public static void main(String[] args)
    {
        String input = "test code one two";

        Reverse p = new Reverse();
        System.out.println(p.getReverse(input));

    }
}
