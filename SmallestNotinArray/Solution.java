class SmallestNotinArray {
    public int SmallestNotinArray(int[] A) {
        // write your code in Java SE 8
        int smallest = A[0];
        int largest =A[0];
        System.out.println("smallest initialize"+ smallest);
        System.out.println("largest initialize"+ largest);

        boolean negative_flg=true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] < smallest) {
                negative_flg = false;
                System.out.println("smallest1"+ smallest);
                smallest = A[i];
                System.out.println("smallest2"+ smallest);
            }
            if (A[i] > 0 && A[i] > largest) {
                negative_flg = false;
                System.out.println("largest"+ largest);
                largest = A[i];
                System.out.println("largest"+ largest);
            }
        }
        if (negative_flg==true)
            return 1;
        if (smallest == 1)
            return   largest+1;
        else
            return smallest - 1;


    }

    public static void main(String args[]) {
        SmallestNotinArray test = new SmallestNotinArray();
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(test.SmallestNotinArray(A));
    }
}