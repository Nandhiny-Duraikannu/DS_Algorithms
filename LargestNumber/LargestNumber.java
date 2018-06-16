import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class LargestNumber {

    public String LargestNumber(int[] num)
    {
        List<String> strs = new ArrayList<String>();
        for(Integer i : num){
            strs.add(String.valueOf(i));
        }

        Collections.sort(strs);
        Collections.reverse(strs);

        StringBuffer strBuf = new StringBuffer();
        for(String s : strs){
            strBuf.append(s);
        }
        return String.valueOf(strBuf);
    }


    public static void main(String args[])

    {
        LargestNumber l = new LargestNumber();
        int data[] = {3, 30, 34, 5, 9};
        System.out.println(l.LargestNumber(data));


    }
}

