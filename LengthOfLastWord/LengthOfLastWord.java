public class LengthOfLastWord {
    public int LengthOfLastWord(String a)
    {
        String[] splitData = a.split("\\s");
        int count = splitData.length;
        if (count==0)
            return 0;
        else {
            String lastWord = splitData[count - 1];
            return lastWord.length();
        }
    }
    public static void main(String args[])
    {
        LengthOfLastWord l = new LengthOfLastWord();
        int length = l.LengthOfLastWord("    ");
        System.out.println("Length Output:"+ length);

    }
}
