public class Car {

    static double inputVoltage = 30.55;
    static boolean keyUnlock = false;
    static double fuelPressure = 22.5;

    public static void main(String[] args) {
        start(inputVoltage,keyUnlock,fuelPressure);
    }

    public static void start(double voltage, boolean key, double pressure ) {
        if (startElectricity(voltage) == true && startCommand(key) == true &&
                startFuelSystem(pressure) == true) {
            System.out.println("The car started up");
        } else {
            System.out.println("The car didn't start");
        }
    }

    private static boolean startElectricity(double volt) {
        if (volt >= 12) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean startCommand(boolean keyStart) {
        if (keyStart == true) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean startFuelSystem(double pressure) {
        if (pressure >= 1) {
            return true;
        } else {
            return false;
        }
    }
}

