package repo;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    private Map<Integer,Order> orders;

    public OrderRepo(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public void list() {
        System.out.println(orders.values());
    }

    public Order get(int id) {
        return orders.get(id);
    }

    public Order add(Product[] productsToAdd) {
            Map<Integer,Product> getsAddedToOrder = new HashMap<>();
            for(Product product : productsToAdd) {
                getsAddedToOrder.put(product.getProductId(), product);
            }
            Order orderToAdd = new Order(orders.size() + 1,getsAddedToOrder);
            orders.put(orderToAdd.getOrderId(), orderToAdd);

        return orderToAdd;
    }
}
