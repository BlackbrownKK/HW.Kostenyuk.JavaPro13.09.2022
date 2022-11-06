package Task01;

import java.util.List;

public class AppTask02 {
    public static void main(String[] args) {
        Integer[] arrayOfIntArguments = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Controller<Integer> controllerListController = new Controller<>();
        List<Integer> arrayIntArgumentsList = controllerListController.forList(arrayOfIntArguments);
        System.out.println(arrayIntArgumentsList);
    }
}
