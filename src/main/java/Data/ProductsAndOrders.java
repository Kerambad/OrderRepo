package Data;

import repo.Order;
import repo.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductsAndOrders {

    public static Map<Integer, Product> initializeProducts() {
        Product product1 = new Product(1, "Radio");
        Product product2 = new Product(2, "TV");
        Product product3 = new Product(3, "Laptop");
        Product product4 = new Product(4, "Phone");
        Product product5 = new Product(5, "Display");
        Product product6 = new Product(6, "Fridge");
        Product product7 = new Product(7, "Webcam");
        Product product8 = new Product(8, "Keyboard");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);
        products.put(product3.getProductId(), product3);
        products.put(product4.getProductId(), product4);
        products.put(product5.getProductId(), product5);
        products.put(product6.getProductId(), product6);
        products.put(product7.getProductId(), product7);
        products.put(product8.getProductId(), product8);

        return products;
    }

    public static Map<Integer, Order> initializeOrder() {

        //Order 1
        Product product2 = new Product(2, "TV");
        Product product3 = new Product(3, "Laptop");

        Map<Integer, Product> products1 = new HashMap<>();
        products1.put(product2.getProductId(), product2);
        products1.put(product3.getProductId(), product3);

        Order order1 = new Order(1,products1);

        //Order 2
        Map<Integer, Product> products2 = new HashMap<>();
        Product product6 = new Product(6, "Fridge");
        Product product7 = new Product(7, "Webcam");

        products2.put(product6.getProductId(), product6);
        products2.put(product7.getProductId(), product7);

        Order order2 = new Order(2,products2);

        //Put together
        Map <Integer,Order> allOrders = new HashMap<>();
        allOrders.put(order1.getOrderId(), order1);
        allOrders.put(order2.getOrderId(), order2);

        return allOrders;
    }
}