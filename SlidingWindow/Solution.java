import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
    public int[] slidingMaximum(final int[] A, int B) {
        ArrayList<Integer> out = new ArrayList<>();
        int[] window;

    for(int i=0,j=0;i<A.length-B-1;i++,j++)
    {

        window = Arrays.copyOfRange(A,i,B+i);
           out.add(Arrays.stream(window).max().getAsInt());

    }
    //    int[] out_array = out.toArray(new Integer[out.size()]);
        int[] out_array = new int[10];
    return out_array;

    }


    public static void main(String args[])
    {
        Solution s = new Solution();
        int[] input = {1,3,-1,-3,5,3,6,7,2};
        int[] print = s.slidingMaximum(input,3);
        for(int x:print)
            System.out.println("output:"+ x);
    }
}
