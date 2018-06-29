import java.util.*;
public class KthLargest {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        System.out.println("PriorityQueue size "+q.size());
        for (int i : nums) {
            q.add(i);

            if (q.size() > k) {
                q.poll();
            }
        }

        return q.peek();
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 6, -1};
        KthLargest p = new KthLargest();
        System.out.println(p.findKthLargest(arr, 2));

    }
}

