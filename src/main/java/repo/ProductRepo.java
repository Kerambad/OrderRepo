package repo;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    //Attributes

    private Map<Integer,Product> products;

    //Constructor
    public ProductRepo() {
    }
    public ProductRepo(Map<Integer, Product> products) {
        this.products = products;
    }

    //Methods
    public Product getProduct(int id) {
        return products.get(id);
    }

    public int getHashId(Product id) {
        return id.getProductId();
    }
    public void list() {
        System.out.println(products.values());
    }
}
