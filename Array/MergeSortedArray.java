import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeSortedArray {

    public void merge(int A[], int m, int B[], int n) {

   int i=0,j=0,k=0;
   while (i<m && j<n)
   {
       if (A[i]<B[j] || A[i]==B[j])
       {
           System.out.println(A[i]);
           i++;
           k++;
       }
       else
       {

           System.out.println(B[j]);

           j++;
           k++;
       }
   }
   if(i==m)
   {
       while (k<(m+n-1))
       {

           System.out.println(B[j]);

           j++;
           k++;

       }
   }
        if(j==n)
        {
            while (k<(m+n-1))
            {

                System.out.println(A[i]);

                i++;
                k++;

            }
        }


    }



    public static void main(String args[]) {
        int[] arr1 ={ 1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        MergeSortedArray p = new MergeSortedArray();
      p.merge(arr1,arr1.length,arr2, arr2.length);

    }
}
