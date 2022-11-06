import java.util.List;

public class AppShop {
    public static void main(String[] args) {
        List<Product> productsInShop = StockOfProducts.getProducts();

        System.out.println("Find books to current sale price: ");
        Controller.getBooksToCurrentSalePrise(productsInShop);
        System.out.println("-----------------------------------");

        System.out.println("Find all books for sale:");
        Controller.findBooksForSale(productsInShop);
        System.out.println("-----------------------------------");

        System.out.println("Find min price of books:");
        Controller.findMinPriceOfBooks(productsInShop);
        System.out.println("-----------------------------------");

        System.out.println("Find 3 now books: ");
        Controller.getThreeFinalAddedProducts(productsInShop);
        System.out.println("-----------------------------------");

        System.out.println("Total sum of this year books, their price is lower than 75 $ is, $:");
        Controller.getSumOfThisYearAddedBooksToCurrentSalePrise(productsInShop);
        System.out.println("-----------------------------------");

        System.out.println("Store of all products:");
        System.out.println();
        Controller.getAllProductsByType(productsInShop);
    }
}