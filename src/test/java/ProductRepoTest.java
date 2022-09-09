import org.junit.jupiter.api.Test;
import repo.Product;
import repo.ProductRepo;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {
    @Test
    void listPrintsAllProductsAtConsole () {
        //GIVEN
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        ProductRepo testRepo = new ProductRepo(products);

        //WHEN //THEN
        testRepo.list();

    }
    @Test
    void getProductReturnsShouldReturnProduct () {
        //GIVEN
        Product product1 = new Product(1,"Keyboard");
        Product product2 = new Product(2,"Mouse");

        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getProductId(), product1);
        products.put(product2.getProductId(), product2);

        ProductRepo testRepo = new ProductRepo(products);

        int testId = 2;

        //WHEN
        Product expected = testRepo.getProduct(testId);
        //THEN
        assertEquals(product2,expected);

    }

}
