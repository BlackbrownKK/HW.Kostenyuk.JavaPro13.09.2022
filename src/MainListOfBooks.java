import java.io.File;

public class MainListOfBooks {

    public static void main(String[] args) {

        AppController appController = new AppController();
        try {
            File file = new File(ListOfBooks.myBooks().get(appController.openBook()));
            appController.countUniqueWords(appController.wordsCalk(file));
            appController.writeStatistic(appController.findCommonWords(appController.wordsCalk(file)));
        } catch (NullPointerException e) {
            System.out.println("this book is not in this collection");
        }
    }
}