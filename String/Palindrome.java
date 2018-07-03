public class Palindrome {

    public int isPalindrome(String A) {
        A=A.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int len = A.length();
        int i=0,j=len-1, palindrome=0;
        while(j>i)
        {
            if (A.charAt(i)==A.charAt(j)) {
                palindrome = 1;
                i++;
                j--;
            }
            else
                return 0;

        }
        return 1;


    }
    public static void main(String[] args)
    {
        String inp ="A man, a plan, a canal: Panama";
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(inp));

    }
}
