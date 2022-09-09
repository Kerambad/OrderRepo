import org.junit.jupiter.api.Test;
import repo.*;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ShopServiceTest {

    @Test
    void addOrderShouldReturnSuccessfulAddedOrder() {
        //GIVEN
        ShopService shopServiceTest = generateShopServiceTestParas();
        int[] testOrder = {1,2};
        //WHEN
        Order actual = shopServiceTest.addOrder(testOrder);
        //THEN
        assertEquals(shopServiceTest.getOrder(2), actual);


    }
    @Test
    void addOrderShouldThrowExceptionBecauseProductNotExists() {
        //GIVEN
        ShopService shopServiceTest = generateShopServiceTestParas();
        int[] testOrder = {1,3};
        //WHEN
        try {
            Order actual = shopServiceTest.addOrder(testOrder);
            fail();
        }
        //THEN
        catch (NoSuchElementException e){}
    }

    private ShopService generateShopServiceTestParas() {
        Product product1 = new Product(1, "Radio");
        Product product2 = new Product(2, "TV");
        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        Order order1 = new Order(1, products);

        //Put together
        Map<Integer, Order> allOrders = new HashMap<>();
        allOrders.put(order1.getOrderId(), order1);

        ShopService init = new ShopService(new OrderRepo(allOrders), new ProductRepo(products));
        return init;

    }
}
