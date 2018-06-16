import java.util.*;

public class DuplicateArray {



    public int find(List<Integer> num)
    {
        HashSet<Integer> set = new HashSet<>();
        int dup = 0;
        for(int i=0;i<num.size();i++) {
            if(set.add(num.get(i))==false) {
                dup = num.get(i);
                break;
            }
        }
        return dup;

    }


    public static void main(String args[])

    {
        DuplicateArray l = new DuplicateArray();

        List<Integer> input = Arrays.asList(30, 3, 30, 3, 9);

        System.out.println(l.find(input));


    }
}
