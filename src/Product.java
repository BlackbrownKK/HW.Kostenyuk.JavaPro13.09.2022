import java.time.LocalDate;

public class Product {
    private final String typeOfProduct;
    private final int identificationNumber;
    private double priceOfProduct;
    private final boolean discountPossible;
    private final LocalDate dateAdded;

    public Product(String typeOfProduct, int identificationNumber, double priceOfProduct, boolean discountPossible, LocalDate dateAdded) {
        this.typeOfProduct = typeOfProduct;
        this.identificationNumber = identificationNumber;
        this.priceOfProduct = priceOfProduct;
        this.discountPossible = discountPossible;
        this.dateAdded = dateAdded;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public boolean isDiscountPossible() {
        return discountPossible;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }


    @Override
    public String toString() {
        return "Product{" +
                "typeOfProduct='" + typeOfProduct + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", priceOfProduct, $ " + priceOfProduct +
                ", discountPossible=" + discountPossible +
                ", dateAdded=" + dateAdded +
                '}';
    }
}


