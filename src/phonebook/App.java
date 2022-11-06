package phonebook;

public class App {
    public static void main(String[] args) {
        Phonebook.addNewRecording(new RecordingBook("Melanie C", "048-356-36-56"));
        Phonebook.addNewRecording(new RecordingBook("Geri Halliwell", "048-356-36-57"));
        Phonebook.addNewRecording(new RecordingBook("Emma Bunton", "048-123-82-88"));
        Phonebook.addNewRecording(new RecordingBook("Mel B", "048-951-91-91"));
        Phonebook.addNewRecording(new RecordingBook("Victoria Beckham", "048-147-46-46"));
        Phonebook.addNewRecording(new RecordingBook("Geri Halliwell", "048-463-37-67"));

        System.out.println(Phonebook.findContakt("Victoria Beckham"));
        System.out.println(Phonebook.findAll("Geri Halliwell"));
    }
}
