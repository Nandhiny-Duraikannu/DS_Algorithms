import java.util.HashSet;
import java.util.Vector;

public class PositiveNegativePairs {
        public void findPairs(int[] arr,int n) {
            HashSet<Integer> set = new HashSet<>();
            Vector<Integer> v = new Vector<>();
            for (int i=0;i<n;i++)
            {
                if (set.add(Math.abs(arr[i]))==false)
                    v.add(arr[i]);

            }
            printPairs(v);
        }

        public void printPairs(Vector v)
        {
            for(int i=0;i<v.size();i++)
            System.out.println(((int)v.get(i) * -1)+" "+v.get(i));


        }

    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 2, 3, 6, -1};
        int n = arr.length;
        PositiveNegativePairs p = new PositiveNegativePairs();
        p.findPairs(arr,n);

    }

    }
