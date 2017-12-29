public class SumTriplets {
    static int input[] = new int[] {5, 1, 3, 4, 7};
    static int count(int len, int sum)
    {
        int countOutput=0;
        for (int i=0; i<len-2;i++)
        {
            for (int j=i+1; j<len-1;j++)
            {
                for (int k=j+1; k<len;k++)
                {
                    if (input[i]+input[j]+input[k]<sum)
                        countOutput++;

                }
            }
        }
        return countOutput;
    }
    public static void main(String[] args)
    {
        System.out.println(count(input.length, 12));
    }

}

