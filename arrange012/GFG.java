import java.util.*;
        import java.lang.*;
        import java.io.*;

class GFG {
    static void sort012(int input_arr[], int input_size)
    {
        System.out.println("Array before seggregation ");
        for(int i=0;i<input_arr.length;i++)
        {
            System.out.println(input_arr[i]+" ");
        }
        int count_0=0,count_1=0,count_2=0,l,j,k;
        for (int i: input_arr)
        {
         switch (i)
         {
             case 0: count_0++;break;
             case 1: count_1++;break;
             case 2: count_2++;break;
         }
        }
        System.out.println("count0:"+count_0+" count_1:"+count_1+" count_2:"+count_2);

        for(l=0;l < count_0;l++)
            input_arr[l]=0;
        for(j=l;j < l+count_1;j++)
            input_arr[j]=1;
        for(k=j;k < j+count_2;k++)
            input_arr[k]=2;
        System.out.println("Array after seggregation ");
        for(int i=0;i<input_arr.length;i++)
        {
            System.out.println(input_arr[i]+" ");
        }
    }



    public static void main (String[] args)
    {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr, arr_size);

    }
}