public class WordCheck {
    public static void main(String[] args) {
        String sentenсe = "ZyuukyaDZibotZ,ezhoBZoschZayZenZ!laksom";
        System.out.println(reverseWordInMySentenсe(sentenсe));
    }
    public static String reverseWordInMySentenсe(String sentenсe) {
        String[] sentenceArrey = sentenсe.split("Z");
        String reversedString = "";
        for (int i = 0; i < sentenceArrey.length; i++) {
            String word = sentenceArrey[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString;
    }
}

