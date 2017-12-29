public class BubbleSort {

    void Bubblesort(int input[])
    {
        int len = input.length;
        for(int i=0;i<len-2;i++)
            for(int j=0;j<len-1;j++)
            {
                int temp = input[j];
                input[j] = input[j+1];
                input[j+1] = temp;
            }

    }
    public static void main(String args[]) {
        BubbleSort st = new BubbleSort();
        int[] input ={2,4,1,3,0};
        st.Bubblesort(input);
        st.PrintOutput(input);

    }
    void PrintOutput(int input[]) {
        for (int i = 0; i < input.length - 1; i++) {
            System.out.println(input[i]);
        }
    }
}
