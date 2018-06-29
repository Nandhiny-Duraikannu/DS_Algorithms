import java.util.*;

public class OnlyPositive {
        public void findPostive(int[] arr, int n) {

            HashSet<Integer> set = new HashSet<Integer>();
            for(int i=0;i<n;i++)
            {
                if(arr[i]<0 && set.contains(Math.abs(arr[i]))) {
                    set.remove(arr[i]);
                    set.add(-arr[i]);
                }


            }
            Iterator<Integer> it = set.iterator();
           while(it.hasNext())
               System.out.println("in while");
               if (it.next()>0) {
                   System.out.println("greater");
                   System.out.println(it.next());
               }
        }


        public static void main(String args[]) {
            int arr[] = { 1, 8, -6, -1, 6, 8, 8};
            int n = arr.length;
            OnlyPositive p = new OnlyPositive();
            p.findPostive(arr,n);

        }
    }
