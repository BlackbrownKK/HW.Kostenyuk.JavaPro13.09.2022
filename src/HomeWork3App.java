import java.util.Scanner;

public class HomeWork3App {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        inRange();
        plusMinus();
        plusTrueMinusFalse();
        numberOfTimes();
        leapYear();
    }

    // Task 2.
    public static void printThreeWords() {
        System.out.printf("Orange%nBanana%nApple%n- - -%n");
    }

    // Task 3.
    public static void checkSumSign() {
        int a = -900;
        int b = 150;
        if ((a + b) >= 0) {
            System.out.printf("The amount is positive%n- - -%n");
        } else {
            System.out.printf("The amount is negative%n- - -%n");
        }
    }

    // Task 4.
    public static void printColor() {
        int value = 500;
        if (value <= 0) {
            System.out.printf("Red%n- - -%n");
        } else if (value > 0 && value < 100) {
            System.out.printf("Yellow%n- - -%n");
        } else {
            System.out.printf("Green%n- - -%n");
        }
    }

    // Task 5.
    public static void compareNumbers() {
        int a = -900;
        int b = 150;
        if (a >= b) {
            System.out.printf("a >= b%n- - -%n");
        } else {
            System.out.printf("a < b%n- - -%n");
        }
    }

    // Task 6.
    public static void inRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check sum a+b between 10 and 20");
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.printf("Result is %b%n- - -%n", checkRange(a, b));
    }

    public static boolean checkRange(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }

    // Task 7.
    public static void plusMinus() {
        System.out.println("Check plus is or minus, enter the value of a:");
        Scanner sc = new Scanner(System.in);
        int variable = sc.nextInt();
        System.out.printf("Result is %s%n- - -%n", checkPlusMinus(variable));
    }

    public static String checkPlusMinus(int variable) {
        String result;
        if (variable >= 0) {
            result = "positive";
        } else {
            result = "negative";
        }
        return result;
    }

    // Task 8.
    public static void plusTrueMinusFalse() {
        System.out.println("Enter the value, plus'll true, minus'll false");
        Scanner sc = new Scanner(System.in);
        int variable = validateOnlyIntNoZero(sc);
        System.out.printf("Result is %s%n- - -%n", checkplusTrueMinusFalse(variable));
    }

    public static boolean checkplusTrueMinusFalse(int variable) {
        if (variable > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task 9.

    public static void numberOfTimes() {
        String stringExpression = "Lockey is ";
        int variableExpression = 777;
        System.out.println("Enter the number of lines");
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        newLine(stringExpression, variableExpression, numberOfLines);
    }

    public static String newLine(String stringExpression, int variable, int number) {
        int b = 1;
        for (int a = 0; a < number; ) {
            System.out.println(b + "). " + stringExpression + variable);
            a++;
            b++;
        }
        return stringExpression;
    }

    public static int validateOnlyIntNoZero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!\n", str);
            System.out.print("Enter number!: ");
        }
        int variable = scanner.nextInt();
        while (variable == 0) {
            System.out.print("Zero is incorrect value, enter integer number: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - not a number!\n", str);
                System.out.print("Enter number!: ");
            }
            variable = scanner.nextInt();
        }
        return variable;
    }

    // Task 10.
    public static void leapYear() {
        System.out.printf("- - -%nEnter the year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("leap Year = true, other = false. Entered year - " + calcLeapYear(year));
    }

    public static boolean calcLeapYear(int x) {
        if (x % 400 == 0) {
            return true;
        } else if (x % 100 == 0) {
            return false;
        } else if (x % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

