package Task01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTask0405 {
    public static void main(String[] args) {
        String[] lTolstoy = ("This is book about good programming . It is filled with code . We are going to look at\n" +
                "code from every different direction . Well look down at it from the top , up at it from the \n" +
                "bottom , and through it from the inside out . By the time we are done , were going to know a \n" +
                "lot about code .").split(" ");

        Controller<String> searchForUniqueWords = new Controller<>();
        List<String> TolstoyToArrayList = new ArrayList<>(Arrays.asList(lTolstoy));

        List<String> searchForUniqueWordsInCollection = searchForUniqueWords.searchingSame(TolstoyToArrayList);
        searchForUniqueWords.calcOccurrence(TolstoyToArrayList, searchForUniqueWordsInCollection);

        searchForUniqueWords.calcOccurrenceStructure(TolstoyToArrayList, searchForUniqueWordsInCollection);
    }
}
