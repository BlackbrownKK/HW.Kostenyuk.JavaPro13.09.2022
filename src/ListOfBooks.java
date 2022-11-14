import java.util.HashMap;
import java.util.Map;

public class ListOfBooks {
    public static Map<String, String> myBooks() {
        String path1 = "src/MyBooks/BremenMusic.txt";
        String path2 = "src/MyBooks/Gruffalo.txt";
        String path3 = "src/MyBooks/Pfinocchio.txt";
        Map<String, String> myBooks = new HashMap<>();
        myBooks.put("BremenMusic.txt", path1);
        myBooks.put("Gruffalo.txt", path2);
        myBooks.put("Pinocchio.txt", path3);
        return myBooks;
    }
}
