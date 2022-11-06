import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Controller {

    public static void getBooksToCurrentSalePrise(List<Product> productsInShop) {

        productsInShop
                .stream()
                .filter(o -> o.getTypeOfProduct().equals("Book"))
                .filter(i -> i.getPriceOfProduct() > 250)
                .sorted(Comparator.comparingDouble(Product::getPriceOfProduct))
                .forEach(System.out::println);
    }

    public static void findBooksForSale(List<Product> productsInShop) {

        productsInShop
                .stream()
                .filter(o -> o.getTypeOfProduct().equals("Book"))
                .filter(Product::isDiscountPossible)
                .peek(product -> product.setPriceOfProduct((product.getPriceOfProduct() * 0.9)))
                .toList()
                .forEach(System.out::println);
    }

    public static void findMinPriceOfBooks(List<Product> productsInShop) throws NoSuchElementException {
        Product productWithMinPrice = productsInShop
                .stream()
                .filter(p -> p.getTypeOfProduct().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPriceOfProduct))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(productWithMinPrice);
    }


    public static void getThreeFinalAddedProducts(List<Product> productsInShop) {
        productsInShop
                .stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .toList()
                .forEach(System.out::println);
    }

    public static void getSumOfThisYearAddedBooksToCurrentSalePrise(List<Product> productsInShop) {
        double sumOfThisYearBooks = productsInShop
                .stream()
                .filter(p -> p.getTypeOfProduct().equals("Book"))
                .filter(p -> p.getPriceOfProduct() < 75)
                .filter(p -> p.getDateAdded().getYear() == Year.now().getValue())
                .mapToDouble(Product::getPriceOfProduct)
                .sum();

        System.out.println(sumOfThisYearBooks);
    }

    public static void getAllProductsByType(List<Product> productsInShop) {

        Map<String, List<Product>> getAllStoreByType = productsInShop
                .stream()
                .collect(Collectors.groupingBy(Product::getTypeOfProduct));

        getAllStoreByType.forEach(((String, productsInShop1) -> {
            System.out.println(String);
            productsInShop1.forEach(System.out::println);
            System.out.println();
        }));
    }
}

