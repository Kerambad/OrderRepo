import org.junit.jupiter.api.Test;
import repo.Product;
import repo.ProductRepo;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {
    @Test
    void listPrintsAllProductsAtConsole () {
        //GIVEN;
        ProductRepo testRepo = TestValues.productTestRepo();
        //WHEN //THEN
        testRepo.list();

    }
    @Test
    void getProductReturnsShouldReturnProduct () {
        //GIVEN
        ProductRepo testRepo = TestValues.productTestRepo();
        int shouldReturnProductAtId = 2;

        //WHEN
        Product expected = testRepo.getProduct(shouldReturnProductAtId);
        //THEN
        assertEquals(TestValues.productTestProduct2(),expected);

    }

}
