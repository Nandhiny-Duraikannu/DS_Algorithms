import java.util.HashMap;

public class Anagram {

    public boolean isAnagram(String x, String y)
    {

        x=x.toLowerCase();
        y=y.toLowerCase();
        HashMap<String,Boolean> map = new  HashMap<String,Boolean>();
        for (int i=0;i<x.length();i++)
            map.put(String.valueOf(x.charAt(i)),false);
        for (int j=0;j<y.length();j++)
        {
            System.out.println("inside y");
            if (map.containsKey(String.valueOf(y.charAt(j)))) {
                System.out.println("y value:"+y.charAt(j));
                map.replace(String.valueOf(y.charAt(j)), true);
            }
        }
        if (map.containsValue(false))
            return false;
        else
            return true;
    }
    public static void main(String[] args)
    {
        Anagram l = new Anagram();
       String A="mary", B = "arym";

        System.out.println(l.isAnagram(A,B));
    }
}
