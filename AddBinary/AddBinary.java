public class AddBinary {
        public String BiToInt(String A, String B) {
            int num1,num2;
            try {
                num1 = Integer.parseInt(A, 2);
                num2 = Integer.parseInt(B, 2);
            }
            catch (Exception e)
            {
                return null;
            }
            int sum = num1+num2;
            String output = Integer.toBinaryString(sum);
            return output;

        }


        public static void main(String args[]) {
            AddBinary r = new AddBinary();
             r.BiToInt("10001100010111000101100010100110001001101010000010011010","101111000100100100111110010010101110101001100100101001111010011000000110");


        }
    }
