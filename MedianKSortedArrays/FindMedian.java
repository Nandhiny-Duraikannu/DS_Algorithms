import java.util.*;

public class FindMedian {

    public double calculateMedian(int[] arr1, int[] arr2)
    {
        int median_index,count=1;
        boolean even;
        int total_length = arr1.length+arr2.length;
        if((total_length)%2==0) {
            median_index = (total_length / 2);
            even=true;
        }
        else {
            median_index = (int) Math.ceil(total_length / 2);
            even=false;
        }

        Stack<Integer> pq = new Stack<Integer>();
        int i=0,j=0;


        while(pq.size()<=median_index) {
            if (arr1[i] < arr2[j]) {
                pq.push(arr1[i]);
                i++;
            } else {
                pq.push(arr2[j]);
                j++;
            }
        }
        if(even)
        {

           double median_val = (pq.pop()+pq.pop())/2;
           return (median_val);
        }
        else
            return pq.pop();
    }


    public static void main(String[] args)
    {
        int arr1[] = { 1,2};
        int arr2[] = { 3,4};

        FindMedian p = new FindMedian();
        System.out.println("Median Value:"+(float)p.calculateMedian(arr1,arr2));

    }
}
