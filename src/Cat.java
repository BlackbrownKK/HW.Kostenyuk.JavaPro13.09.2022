public class Cat extends Animal {
    private static int animalCount;

    public Cat(String nameAnimal, double runDistans) {
        super(nameAnimal, runDistans);
        animalCount++;

        System.out.println("This cat " + nameAnimal + " runed " + moveRun(setRunDistansAnimalLimit(200), runDistans) +
                "m");

    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
