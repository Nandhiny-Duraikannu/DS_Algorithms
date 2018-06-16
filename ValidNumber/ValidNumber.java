import java.util.ArrayList;
import java.util.Arrays;

public class ValidNumber {
        public int Verify(final String A) {
            int[] invalid = {'a','c'};
            ArrayList input = new ArrayList();
            input.add(Arrays.asList(A.split("")));
            for (Object s : input) {
              // if (invalid. s.toString())
            }
            return 0;
        }

        public static void main(String args[]) {
            ValidNumber r = new ValidNumber();
            int out = r.Verify("-01.1e-10");

        }
    }
