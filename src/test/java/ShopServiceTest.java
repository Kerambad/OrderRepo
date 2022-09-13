import org.junit.jupiter.api.Test;
import repo.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ShopServiceTest {

    @Test
    void addOrderShouldReturnSuccessfulAddedOrder() {
        //GIVEN
        ShopService shopServiceTest = TestValues.shopServiceTestRepo();
        int[] testOrder = {1,2};
        //WHEN
        Order actual = shopServiceTest.addOrder(testOrder);
        //THEN
        assertEquals(shopServiceTest.getOrder(2), actual);


    }
    @Test
    void addOrderShouldThrowExceptionBecauseProductNotExists() {
        //GIVEN
        ShopService shopServiceTest = TestValues.shopServiceTestRepo();
        int[] testOrder = {1,3};

        //WHEN //THEN
        assertThrows(NoSuchElementException.class, () -> shopServiceTest.addOrder(testOrder));
    }
    @Test
    void getProductShouldThrowExceptionBecauseProductNotExists() {
        //GIVEN
        ShopService shopServiceTest = TestValues.shopServiceTestRepo();
        int testProduct = 4;

        //WHEN //THEN
        assertThrows(NoSuchElementException.class, () -> shopServiceTest.getProduct(testProduct));
    }

    @Test
    void getProductShouldReturnRequestedProduct() {
        //GIVEN
        ShopService shopServiceTest = TestValues.shopServiceTestRepo();
        Product testProduct = TestValues.productTestProduct2();

        //WHEN
        Product actual = shopServiceTest.getProduct(2);
        // THEN
        assertEquals(testProduct, actual);

    }

    @Test
    void getOrderShouldThrowExceptionBecauseOrderNotExists() {
        //GIVEN
        ShopService shopServiceTest = TestValues.shopServiceTestRepo();
        int testOrder = 3;

        //WHEN //THEN
        assertThrows(NoSuchElementException.class, () -> shopServiceTest.getOrder(testOrder));
    }
    @Test
    void getOrderShouldReturnRequestedOrder() {
        //GIVEN
        ShopService shopServiceTest = TestValues.shopServiceTestRepo();
        Order testOrder = TestValues.orderTestOrder();

        //WHEN
        Order actual = shopServiceTest.getOrder(1);
        // THEN
        assertEquals(testOrder, actual);
    }
}
