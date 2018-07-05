import java.util.HashMap;

public class oddOccur {

    public int findNum(final int[] A) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i =0;i<A.length;i++)
        {
            if(map.get(A[i])!=null)
                map.remove(A[i]);
            else
                map.put(A[i],A[i]);
        }

           for(int i:map.keySet())
               return i;

        return 0;
    }


    public static void main(String[] args)

    {
        oddOccur r = new oddOccur();
        int[] A = {1,7,3,7,2,5,3,5,5,1,2};
        System.out.println(r.findNum(A));
    }

}
