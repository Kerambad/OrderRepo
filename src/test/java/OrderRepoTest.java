import org.junit.jupiter.api.Test;
import repo.Order;
import repo.OrderRepo;
import repo.Product;
import repo.ProductRepo;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepoTest {
    @Test
    void listPrintsAllOrdersAtConsole() {
        //GIVEN
        OrderRepo orderrepo = generateOrderRepo();

        //WHEN
        orderrepo.list();

    }
    @Test
    void getOrderShouldReturnOrderById() {
        //GIVEN
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");
        Product[] productArrayToTest = {product1, product2};

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order expected = new Order(1, products);
        OrderRepo orderrepo = generateOrderRepo();


        //WHEN
        Order actual = orderrepo.get(1);

        //THEN
        assertEquals(expected,actual);

    }
    @Test
    void addOrderShouldReturnAddedOrder() {
        //GIVEN
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");
        Product[] productArrayToTest = {product1, product2};

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order expected = new Order(2, products);

        OrderRepo repoToTest = generateOrderRepo();

        //WHEN
        Order actual = repoToTest.add(productArrayToTest);

        //THEN
        assertEquals(expected,actual);

    }

    private OrderRepo generateOrderRepo() {
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order order1 = new Order(1, products);

        Map<Integer, Order> orders = new HashMap<>();
        orders.put(order1.getOrderId(),order1);

        OrderRepo orderrepo = new OrderRepo(orders);
        return orderrepo;
    }


}
