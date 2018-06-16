class GCD
{
    // Recursive function to return gcd of a and b
    static int GCD(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return GCD(a-b, b);
        return GCD(a, b-a);
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a +" and " + b + " is " + GCD(a, b));
    }
}
