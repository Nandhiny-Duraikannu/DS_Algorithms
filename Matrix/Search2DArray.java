import java.util.Arrays;

public class Search2DArray {

    public boolean findIndex(int[][] inp,int target) {
        boolean avail;
        int rowNum=-1;
        int size = inp.length;
        if (size ==0)
            return false;
        int breadth = inp[0].length;

        for (int i=0;i<size-1;i++)
        {
            if (inp[i][0]<=target && inp[i][breadth-1]>=target) {
                rowNum = i;
                break;
            }

        }
        if (rowNum==-1)
            return false;
        else
            return findPos(inp,rowNum,target,breadth);

    }


    public boolean findPos(int[][] inp,int rowNum, int target, int breadth) {
        for(int j=0;j<breadth;j++) {
            if (inp[rowNum][j] == target)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[][] input = {{1}};
        Search2DArray z=new Search2DArray();
        int find =1;
        System.out.println(z.findIndex(input,find));

    }
}
