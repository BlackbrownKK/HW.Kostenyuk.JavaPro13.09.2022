import java.time.LocalDate;
import java.util.List;

public class StockOfProducts {


    public static List<Product> getProducts() {

        LocalDate data1 = LocalDate.of(2021, 9, 3);
        LocalDate data2 = LocalDate.of(2021, 2, 11);
        LocalDate data3 = LocalDate.of(2022, 3, 23);
        LocalDate data4 = LocalDate.of(2022, 5, 21);

        return List.of(
                new Product("Calk", 45215, 44.6, true, data1),
                new Product("Pen", 541566, 50.8, true, data2),
                new Product("Calk", 54544, 105.6, false, data3),
                new Product("Book", 354351, 99.9, false, data2),
                new Product("Toy", 31234, 105.8, true, data4),
                new Product("Pen", 345313, 19.9, false, data3),
                new Product("Toy", 32123, 49.9, true, data3),
                new Product("Notebook", 354531, 10, true, data3),
                new Product("Book", 312314, 279.9, true, data2),
                new Product("Book", 34521, 59.9, false, data3),
                new Product("Notebook", 12385, 150, true, data3),
                new Product("Book", 12345, 68, false, data4),
                new Product("Book", 23879, 100, true, data4)
        );
    }
}
