//Implement pow(x, n) % d

public class PowerN {

    public int calcValue(int x, int n,int d)
    {
        int out;
        out=power(x,n);


        return (out%d);
    }
    public int power(int x, int n)
    {
        int tmp;
        if(n%2==0)
            tmp=x;
        else
            tmp=1;
        while(n>0) {
            tmp= tmp*x;
             power(x, n / 2);
             n--;
        }
        return tmp;
    }
    public static void main(String[] args)

    {
        PowerN r = new PowerN();
        int x = -1, n = 2, d = 20;
        System.out.println(r.calcValue(x,n,d));
    }


}
