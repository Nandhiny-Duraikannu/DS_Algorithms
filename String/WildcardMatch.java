
import java.lang.*;



class WildcardMatch

{

    public static void main (String[] args) throws java.lang.Exception

    {
        System.out.println(isMatchMain("abc*bcd", "abcdhghgbcd"));

    }

    public static boolean isMatchMain(String P, String S) {

        if(P == null || S == null || P.length() == 0 || S.length() == 0) return false;

        return isMatch( P, S);

    }

    public static boolean isMatch(String P, String S) {

        if(P.length() == 0 && S.length() == 0) {

            return true;

        }

        if(S.length() == 0 && !P.equals("*")) return false;

        if(isCharEqual('.', P) || equalsString(P, S)) {

            return isMatch(P.substring(1), S.substring(1));

        }

        if(isCharEqual('*', P)) {

            return isMatch(P.substring(1), S) || isMatch(P, S.substring(1));

        }

        return false;

    }

    public static boolean isCharEqual(char ch, String S) {

        if(S.length() > 0 && ch == S.charAt(0)) return true;

        return false;

    }

    public static boolean equalsString(String P, String S) {

        if(P.length() > 0 && S.length() > 0 && S.charAt(0) == P.charAt(0)) return true;

        return false;

    }

}