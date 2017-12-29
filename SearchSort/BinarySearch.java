public class BinarySearch {

    int BinarySearch(int[] input, int start, int end, int find) {


        if (end >=  start) {
            int mid = start+(end-start) / 2;
            if (input[mid] == find)
                return mid;
            if (input[mid] > find)
               return BinarySearch(input, start, mid - 1, find);

            return BinarySearch(input, mid + 1, end, find);

        }

        return -1;
    }


    public static void main(String args[]) {
        BinarySearch sr = new BinarySearch();
        int input[] = {2,10,33,35,123,444,5674};
        int size = input.length - 1;
        int find = 5674;
        int output = sr.BinarySearch(input, 0, size, find);
        if (output == -1)
            System.out.println("Not present");
        else
            System.out.println("Element present in index" + output);

    }

}
