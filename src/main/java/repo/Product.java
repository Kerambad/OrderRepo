package repo;


import java.util.Objects;

public class Product {

    //Attributes
    private int productId;
    private String productName;

    //Constructor
    public Product(int id, String name) {
        this.productId = id;
        this.productName = name;
    }

    public Product() {
    }

    //Methods
    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product-id: " + productId +
                " name: " + productName + '\n';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }
}
