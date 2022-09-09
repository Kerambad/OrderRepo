package repo;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    private Map<Integer,Order> orders = new HashMap<>();

    public OrderRepo(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public void list() {
        System.out.println(orders.values());
    }

    public Order get(int id) {
        return orders.get(id);
    }

    public Order add(int id, Product[] products) {

        Map<Integer,Product> productsToAdd = new HashMap<>();
        for (int i = 0; i < products.length; i++) {
            productsToAdd.put(products[i].getProductId(),products[i]);
        }
        Order toAdd = new Order(id, productsToAdd);
        orders.put(id, toAdd);
        return toAdd;
    }
}
