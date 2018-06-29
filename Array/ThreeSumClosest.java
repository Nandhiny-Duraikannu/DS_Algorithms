import java.util.*;
import java.util.Arrays;

public class ThreeSumClosest {

        public int findVal(int[] arr, int target)
        {
            int calculatedSum;

           int previousSum=arr[0]+arr[1]+arr[2];
            for (int i=0;i<arr.length-2;i++)
            {
                calculatedSum = arr[i]+arr[i+1]+arr[i+2];
                if (Math.abs(calculatedSum-target)<(Math.abs(previousSum-target)))
                {
                    previousSum=calculatedSum;
                }


            }

            return previousSum;
        }

        public static void main(String args[]) {
            int arr[] ={1,1,-1, -1, 3};
            int target = 3;
            ThreeSumClosest p = new ThreeSumClosest();
            System.out.println(p.findVal(arr,target));

        }
    }

