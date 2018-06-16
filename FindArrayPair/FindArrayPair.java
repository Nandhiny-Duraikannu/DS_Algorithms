public class FindArrayPair {
    public static int[] arrayPair(int[] A, int sum) {
    int top = A.length-1;
    int bottom = 0;
    int test = A[top-1]-A[bottom];
        System.out.println(test);
        if (test>sum)
        {
            test = A[top-1]-A[bottom];

        }
        else if (test < sum )
        {
            test = A[top-1]-A[bottom-1];
        }
        else if (test == sum)
        {
          //  out = [];
        }
    return A;
    }

    public static void main(String[] args)
    {
        int[] out = new int[10];
        int[] input = {1,2,4,4};
        int sum =8;
        out = arrayPair(input,sum);
        System.out.println(out);

    }
}
