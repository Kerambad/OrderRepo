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

    Map<Integer, Order> addList () {
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order order1 = new Order(1, products);
        Order order2 = new Order(2, products);

        Map<Integer, Order> orders = new HashMap<>();

        orders.put(order1.getOrderId(),order1);
        orders.put(order2.getOrderId(),order2);

        return orders;
    }



    @Test
    void listPrintsAllOrdersAtConsole() {
        //GIVEN
        OrderRepo orderrepo = new OrderRepo(addList());

        //WHEN
        orderrepo.list();

    }
    @Test
    void getOrderShouldReturnOrderById() {
        //GIVEN
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order order1 = new Order(1, products);
        Order order2 = new Order(2, products);

        Map<Integer, Order> orders = new HashMap<>();

        orders.put(order1.getOrderId(),order1);
        orders.put(order2.getOrderId(),order2);
        OrderRepo orderrepo = new OrderRepo(addList());

        int testId = 2;

        //WHEN
        Order actual = orderrepo.get(testId);

        //THEN
        assertEquals(order2,actual);

    }
    @Test
    void addOrderShouldReturnAddedOrder() {
        //GIVEN
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order order1 = new Order(1, products);
        Order order2 = new Order(2, products);

        Map<Integer, Order> orders = new HashMap<>();

        orders.put(order1.getOrderId(),order1);
        orders.put(order2.getOrderId(),order2);
        OrderRepo orderrepo = new OrderRepo(addList());

        Product productTest1 = new Product(11,"M1");
        Product productTest2 = new Product(12,"Magic");
        Product[] testProducts = {productTest1,productTest2};

        Map<Integer,Product> expected = new HashMap<>();
        expected.put(11, productTest1);
        expected.put(12, productTest2);

        //WHEN
        Order actual = orderrepo.add(5, testProducts);

        //THEN
        assertEquals(new Order(5,expected),actual);

    }



}
