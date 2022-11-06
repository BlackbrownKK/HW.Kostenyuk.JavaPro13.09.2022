public class Dog extends Animal {

    private static int animalCount;

    public Dog(String nameAnimal, double runDistans, double swimDistans) {
        super(nameAnimal, runDistans);
        animalCount++;
        System.out.println("This dog " + nameAnimal + " runed " + moveRun(setRunDistansAnimalLimit(500), runDistans) + "m" +
                " and swimed " + swimMove(setSwimDistansAnimalLimit(10), swimDistans) + "m");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
