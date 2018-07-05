public class Fraction {

    public String fractionToDecimal(int A, int B) {
        String x;
        x = String.valueOf(A/B);
        System.out.println(A/B);
        return x;

    }
    public static void main(String[] args)

    {
        Fraction r = new Fraction();
        int A = 1,B=2;
        System.out.println(r.fractionToDecimal(A,B));
    }

}
