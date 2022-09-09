package repo;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    private Map<Integer,Product> products = new HashMap<>();

    public ProductRepo(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;

    }

    public Product printSingleProduct(int id) {
        System.out.println(products.get(id));
        return products.get(id);
    }

    public int getHashId(Product id) {
        return id.getProductId();
    }
    public void list() {
        System.out.println(products.values());
    }
}
