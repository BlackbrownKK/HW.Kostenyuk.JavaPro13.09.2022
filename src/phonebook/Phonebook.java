package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private static final ArrayList<RecordingBook> recordingCollection = new ArrayList<>();

    public static void addNewRecording(RecordingBook exemplar) {
        if (checkContactNumber(exemplar.getContactPhoneNumber()) == null) {
            recordingCollection.add(exemplar);
        } else {
            System.out.println(exemplar.getContactName() + "This name is already in the phone book.");
        }
    }

    public static RecordingBook checkContactNumber(String contactPhoneNumber) {
        for (RecordingBook exemplar : recordingCollection) {
            if (exemplar.getContactName().equals(contactPhoneNumber))
                return exemplar;
        }
        return null;
    }

    public static RecordingBook findContakt(String contactName) {
        for (RecordingBook exemplar : recordingCollection) {
            if (exemplar.getContactName().equals(contactName))
                return exemplar;
        }
        return null;
    }

    public static List<RecordingBook> findAll(String contactName) {
        List<RecordingBook> contactsBook = new ArrayList<>();
        for (RecordingBook exemplar : recordingCollection) {
            if (exemplar.getContactName().equals(contactName)) {
                contactsBook.add(exemplar);
            }
        }
        return contactsBook;
    }
}


