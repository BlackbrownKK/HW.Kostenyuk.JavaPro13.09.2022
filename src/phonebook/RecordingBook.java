package phonebook;

public class RecordingBook {
    private final String contactName;
    private final String contactPhoneNumber;

    public RecordingBook(String contactName, String contactPhoneNumber) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    @Override
    public String toString() {
        return "Name is: " + contactName + ". Phone number is: " + contactPhoneNumber;
    }
}
