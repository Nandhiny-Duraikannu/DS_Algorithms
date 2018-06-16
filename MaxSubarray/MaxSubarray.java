import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxSubarray {
    static void find_subarray(int[] arr, int k) {


            for(int i=k-1;i<arr.length-k;i=i+k)
        {

            System.out.println(arr[i]);

        }
    }
    public static void main (String[] args)
    {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k=3;
        System.out.println("Max in subarray:");
        find_subarray(arr, k);
    }
}
