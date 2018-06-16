import java.util.*;
        import java.lang.*;
        import java.io.*;

class equilibrium {
    static int findElement(int input_arr[], int input_size)
    {
       int sum=0,checksum=input_arr[0],output=0;
     for(int i=0;i<input_size;i++)
     {
         sum+=input_arr[i];
     }
     for(int i=1;i<input_size-1;i++)
     {
         if (checksum==sum-input_arr[i]-checksum)
             output= input_arr[i];
         else
             checksum += input_arr[i];


     }
     if (output==0)
        return -1;
     else
         return output;

    }



    public static void main (String[] args)
    {
        int arr[] = {-7,1,5,2,-4,3,0};
        int arr_size = arr.length;
        int element_index = findElement(arr, arr_size);
        System.out.println("element_index:"+element_index);

    }
}