import java.text.DecimalFormat;
import java.util.Scanner;

public class MonoBank {

    static String name;
    static double deposit;
    static double PERCENT = 20;
    static double percentPerOneYear;
    static double percentPerFiveYear;
    static double percentPerTenYear;

    public static void main(String[] args) {
        doInput();
        processData();
        doOutput();
    }

    private static void doInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter customer name:");
        name = in.nextLine();
        System.out.print("Enter the deposit amount:");
        deposit = in.nextDouble();
    }

    private static void processData() {
        percentPerOneYear = deposit * PERCENT / 100 + deposit;
        percentPerFiveYear = 5 * deposit * PERCENT / 100 + deposit;
        percentPerTenYear = 10 * deposit * PERCENT / 100 + deposit;
    }

    private static void doOutput() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Customer name is: " + name);
        System.out.println("Deposit amount: is: " + deposit);
        System.out.println("Amount of money on interest:");
        System.out.println("for the first year: " + Rounder.roundValue(percentPerOneYear));
        System.out.println("for the five years: " + Rounder.roundValue(percentPerFiveYear));
        System.out.println("for the ten years: " + Rounder.roundValue(percentPerTenYear));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    public static class Rounder {
        public static String roundValue(double value) {
            DecimalFormat df = new DecimalFormat("#.00");
            return df.format(value);
        }
    }
}

