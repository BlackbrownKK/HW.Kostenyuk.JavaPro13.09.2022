package Task01;

import java.util.ArrayList;
import java.util.List;

public class AppTask01 {
    public static void main(String[] args) {
        String[] shoppingListArray = "checkLis/aper/corn/paper/corn/apricots/bread/cleaner/rice/vegetables/salt"
                .split("/");
        Controller<String> searchShoppingListFunction = new Controller<>();
        ArrayList<String> shoppingListArrayList = new ArrayList<>(List.of(shoppingListArray));
        System.out.println(searchShoppingListFunction.countOccurance(shoppingListArrayList,"corn"));
    }
}
