package Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller<T> {

    // getting the number of elements in the specified collection equal to the specified object.
    public int countOccurance(List<T> inputWholeSentences, T desiredValue) {
        return Collections.frequency(inputWholeSentences, desiredValue);

    }

    public List<T> forList(T[] inputData) {
        List<T> convectorList = new ArrayList<>();
        Collections.addAll(convectorList, inputData);
        return convectorList;
    }

    //  searching same object in the collection.
    public List<T> searchingSame(List<T> inputData) {
        List<T> searchingSameUnit = new ArrayList<>();
        for (T unit : inputData) {
            if (!searchingSameUnit.contains(unit)) searchingSameUnit.add(unit);
        }
        return searchingSameUnit;
    }

    //  calculation sames objects in the collection.
    public void calcOccurrence(List<T> inputData, List<T> arguments) {
        for (T unit : arguments) {
            System.out.println(unit + " - " + countOccurance(inputData, unit));
        }
    }

    public void calcOccurrenceStructure(List<T> inputData, List<T> arguments) {
        for (T unit : arguments) {
            System.out.println("name " + " " + unit + " occurrence " + countOccurance(inputData, unit));
        }
    }
}
