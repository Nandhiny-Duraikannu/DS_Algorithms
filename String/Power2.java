public class Power2 {
    public boolean isPowerOfTwo(int n) {
        int count = Integer.bitCount(n);
        System.out.println(count);
        return n > 0 && count == 1;
    }

    public static void main(String[] args)
    {
        Power2 l = new Power2();
        System.out.println(l.isPowerOfTwo(10));
    }
}
