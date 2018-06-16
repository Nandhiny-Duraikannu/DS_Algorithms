public class Sqrt {
    public int calc(int a) {
        int start =1;
        int end = a/2;
        if (a !=1) {
            while ((end * end) > a) {
                end = end - 1;
            }
            return end;
        }
        else
            return 1;
    }
    public static void main(String args[])
    {
        Sqrt s = new Sqrt();
        int output = s.calc(2);
        System.out.println("end:"+output);

    }
}
