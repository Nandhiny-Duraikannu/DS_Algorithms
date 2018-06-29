import java.util.Arrays;

public class SetMatrixZeros {


    public int[][] fillZeros(int[][] inp) {
        int size = inp.length;
        int breadth = inp[0].length;
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<breadth;j++)
            {
                if (inp[i][j]==0)
                    inp[i][0]=0;
            }
        }

        for (int i=0;i<size;i++)
        {
            if(inp[i][0]==0)
                Arrays.fill(inp[i],0);
        }
        return inp;

    }

    public static void main(String[] args)
    {
        int[][] input = {{1,1,1,0},{1,0,1,0}, {1,1,1,1}};
        SetMatrixZeros z=new SetMatrixZeros();
        int[][] out =z.fillZeros(input);
        for (int i = 0; i < out.length; i++)
            for (int j = 0; j < out[i].length; j++)
                System.out.print(out[i][j] + " ");

    }
}
