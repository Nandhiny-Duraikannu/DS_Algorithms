public class LastWordLength {

    public void findLength(String input)
    {

        String[] lastWord = input.split("\\s");
        System.out.println((lastWord[lastWord.length-1]).length());

    }



    public static void main(String args[]) {
        String input="test new word length";
        LastWordLength p = new LastWordLength();
  p.findLength(input);

    }
}
