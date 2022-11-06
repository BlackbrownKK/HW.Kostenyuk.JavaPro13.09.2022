import java.util.LinkedList;
import java.util.Scanner;

public class CoffeeOrderBoard {
    private int lastClientOrderNumber;
    private final LinkedList<Order> coffeeOrderBoard = new LinkedList<>();

    public void addCoffeeOrderBoard(String clientOderName) {
        Order order = new Order(++lastClientOrderNumber, clientOderName);
        coffeeOrderBoard.addLast(order);
    }

    public void draw() {
        System.out.println("Current list:");
        System.out.println("====================");
        System.out.println(" Num | Name");
        for (Order order : coffeeOrderBoard) {
            System.out.println(order.toString());
        }
        System.out.println();
    }


    public void turn() {
        System.out.println("====================");
        System.out.println(" Num | Name");
        for (int i = 0; i <= 2; i++) {
            System.out.println(coffeeOrderBoard.get(i));
        }
    }

    public void deliver() {
        Scanner scanner = new Scanner(System.in);
        int nunber = scanner.nextInt();
        for (Order order : coffeeOrderBoard) {
            if (nunber == order.getClientOderNumber()) {
                coffeeOrderBoard.remove(nunber - 1);
                System.out.println("Client " + order.getClientOderName() + ", please take up your order number: " +
                        order.getClientOderNumber());
                System.out.println();
                draw();
                return;
            }
        }
    }
}

