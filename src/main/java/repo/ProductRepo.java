package repo;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    private Map<Integer,Product> products;

    public ProductRepo(Map<Integer, Product> products) {
        this.products = products;
    }

    public ProductRepo() {
    }

    public Product getProduct(int id) {
        return products.get(id);
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
