import java.io.IOException;
import java.util.HashMap;

public class Isomorphic {
    public static boolean validate(String a, String b)
    {

        HashMap<Character, Character>  map = new HashMap<Character,Character>();
        for(int i=0; i<a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                if (map.get(a.charAt(i)) != b.charAt(i))
                    return false;

            } else
                map.put(a.charAt(i), b.charAt(i));
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        String inp1 = "foo",inp2="bar";
        System.out.println(validate(inp1,inp2));
    }
}
