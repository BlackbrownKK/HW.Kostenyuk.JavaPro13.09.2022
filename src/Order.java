
import java.util.Objects;

public class Order {
    private final int clientOderNumber;
    private final String clientOderName;


    public Order(int clientOderNumber, String clientOderName) {
        this.clientOderNumber = clientOderNumber;
        this.clientOderName = clientOderName;
    }

    public int getClientOderNumber() {
        return clientOderNumber;
    }

    public String getClientOderName() {
        return clientOderName;
    }

    @Override
    public String toString() {
        return " " + clientOderNumber + " | " + clientOderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return clientOderNumber == order.clientOderNumber && Objects.equals(clientOderName, order.clientOderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientOderName, clientOderNumber);
    }
}
