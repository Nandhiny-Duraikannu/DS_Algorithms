import java.util.HashMap;

public class TwoSum {

    public int[] findVal(int[] arr, int target)
    {
        int[] output= new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i=0;i<arr.length;i++)
        {
            if (map.containsValue(target-arr[i]))
            {
                output[0]= arr[i];
                output[1]= target-arr[i];
            }
            else
                map.put(i,arr[i]);
        }
        return output;


    }

    public static void main(String args[]) {
        int arr[] ={2, 7, 11, 15};
        int target = 9;
        TwoSum p = new TwoSum();
        int[]out =p.findVal(arr,target);
        System.out.println(out[0]);
        System.out.println(out[1]);
    }
}
