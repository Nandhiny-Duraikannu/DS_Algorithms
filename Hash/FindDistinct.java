import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.Iterator;

public class FindDistinct {
        public void getvalue(int arr[],int n) {
            HashMap<Integer, Boolean> set = new HashMap<Integer, Boolean>();
            for (int i = 0; i < n; i++) {
                System.out.println("input "+arr[i]);
                if (set.containsKey(arr[i]))
                    set.put(arr[i], false);
                 else
                    set.put(arr[i], true);
            }
            Iterator<Integer> it = set.keySet().iterator();

            while (it.hasNext()) {
                int key = it.next();
                if (set.get(key) == true)
                    System.out.println("key: " + key + " value: " + set.get(key));
            }
        }


        public static void main(String args[]) {
            int arr[] = { 1, 8, -6, -1, 6, 8, 8};
            int n = arr.length;
            FindDistinct p = new FindDistinct();
            p.getvalue(arr,n);

        }
    }
