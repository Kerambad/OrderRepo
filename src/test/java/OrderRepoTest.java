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
        OrderRepo orderrepo = TestValues.orderTestRepo();

        //WHEN
        orderrepo.list();

    }
    @Test
    void getOrderShouldReturnOrderById() {
        //GIVEN
        Order expected = TestValues.orderTestOrder();
        OrderRepo orderrepo = TestValues.orderTestRepo();
        //WHEN
        Order actual = orderrepo.getOrder(1);
        //THEN
        assertEquals(expected,actual);

    }
    @Test
    void addOrderShouldReturnAddedOrder() {
        //GIVEN
        Product[] productArrayToTest = {TestValues.productTestProduct1(), TestValues.productTestProduct2()};
        Order expected = new Order(2, TestValues.productTestMap());
        OrderRepo repoToTest = TestValues.orderTestRepo();

        //WHEN
        Order actual = repoToTest.add(productArrayToTest);

        //THEN
        assertEquals(expected,actual);

    }


}
