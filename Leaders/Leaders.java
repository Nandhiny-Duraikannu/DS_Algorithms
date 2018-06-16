import java.util.*;
import java.lang.*;
import java.io.*;
public class Leaders {

    static void findLeader(int arr[], int arr_size)
    {
        int max_val = arr[arr_size-1];
        System.out.println(max_val+" ");
        for(int i=arr_size-2;i>=0;i--)
        {
            if(arr[i]>max_val) {
                max_val = arr[i];
                System.out.println(max_val + " ");
            }
        }


    }

    public static void main (String[] args)
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int arr_size = arr.length;
        System.out.println("leaders of the array are:");
        findLeader(arr, arr_size);


    }
}
