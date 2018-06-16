import java.util.Arrays;

public class AddOne {
    public int[] AddOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            System.out.println("res:"+res);
            res[0] = 1;
            return res;
        }
        return digits;
    }
    public static void main (String[] args)
    {
        int arr[] = {4,9,9,9};
        System.out.println("add one to array:");
        AddOne add =new AddOne();
        int[] res1 = new int[arr.length + 1];
        System.out.println("res1:"+ Arrays.toString(res1));
        int[] output = add.AddOne(arr);
        for(int i =0;i<output.length;i++)
            System.out.println(output[i]);

    }
}