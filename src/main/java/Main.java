import Data.ProductsAndOrders;
import repo.OrderRepo;
import repo.ProductRepo;


public class Main {

    public static void main(String[] args) {
        ShopService shopService = new ShopService(new OrderRepo(ProductsAndOrders.initializeOrder()), new ProductRepo(ProductsAndOrders.initializeProducts()));
        shopService.start(0);
    }
    
    //test



}
