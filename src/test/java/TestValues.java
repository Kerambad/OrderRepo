import repo.Order;
import repo.OrderRepo;
import repo.Product;
import repo.ProductRepo;

import java.util.HashMap;
import java.util.Map;

public class TestValues {

    //Values for Products
    static Product productTestProduct1(){
        return new Product(1,"Keyboard");
    }
    static Product productTestProduct2() {
        return new Product(2, "Mouse");
    }
    static Map<Integer, Product> productTestMap() {
        Map<Integer, Product> products = new HashMap<>();
        products.put(productTestProduct1().getProductId(), productTestProduct1());
        products.put(productTestProduct2().getProductId(), productTestProduct2());

        return products;
    }
    static ProductRepo productTestRepo () {
        return new ProductRepo(productTestMap());
    }

    //Values for Orders
    static Order orderTestOrder () {
        return new Order(1, productTestMap());
    }
    static Map<Integer, Order> orderTestMap () {
        Map<Integer, Order> orders = new HashMap<>();
        orders.put(orderTestOrder().getOrderId(),orderTestOrder());
        return orders;
    }
    static OrderRepo orderTestRepo () {
        return new OrderRepo(orderTestMap());
    }

    //ShopService Values
    static ShopService shopServiceTestRepo () {
        return new ShopService(orderTestRepo(),productTestRepo());
    }
}
