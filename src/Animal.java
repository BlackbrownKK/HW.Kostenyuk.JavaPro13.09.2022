public class Animal {
    private final String nameAnimal;
    private double runDistansAnimalLimit;
    private final double runDistansAnimal;
    private double swimDistansAnimalLimit;
    private static int animalCount;

    public Animal(String nameAnimal, double runDistansAnimal) {
        this.nameAnimal = nameAnimal;
        this.runDistansAnimal = runDistansAnimal;
        this.animalCount++;
    }


    public double setRunDistansAnimalLimit(double runDistansAnimalLimit) {
        this.runDistansAnimalLimit = runDistansAnimalLimit;
        return runDistansAnimalLimit;
    }

    public double setSwimDistansAnimalLimit(double swimDistansAnimalLimit) {
        this.swimDistansAnimalLimit = swimDistansAnimalLimit;
        return swimDistansAnimalLimit;
    }

    public double moveRun(double runDistansAnimalLimit, double runDistans) {
        double realRunDistans;
        if (runDistans <= runDistansAnimalLimit) {
            realRunDistans = runDistans;
        } else {
            realRunDistans = runDistansAnimalLimit;
        }
        return realRunDistans;
    }

    public double swimMove(double swimDistansAnimalLimit, double swimDistans) {
        double realSwimDistans;
        if (swimDistans <= swimDistansAnimalLimit) {
            realSwimDistans = swimDistans;
        } else {
            realSwimDistans = swimDistansAnimalLimit;
        }
        return realSwimDistans;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

}



