public class reversal {

    public  reversal(String str) {

            int len = str.length();
            StringBuilder dest = new StringBuilder();

            for (int i = (len - 1); i >= 0; i--)

            {
                dest.append(str.charAt(i));
            }
        System.out.println(dest.toString());
        }


}