import Data.ProductsAndOrders;
import repo.OrderRepo;
import repo.Product;
import repo.ProductRepo;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {


        ShopService shopService = new ShopService(new OrderRepo(ProductsAndOrders.initializeOrder()),new ProductRepo(ProductsAndOrders.initializeProducts()));

        Product add1 = new Product(7, "Webcam");
        Product add2 = new Product(2, "TV");
        Product[] addArray = {add1,add2};

        System.out.println("New Order ID: "
                + shopService.addOrder(new int[]{6, 7}).getOrderId());

        System.out.println(shopService.getOrder(3));

        System.out.println(shopService.getProduct(8));

        try {
            System.out.println(shopService.getOrder(10));
        }
        catch (NoSuchElementException NseeOrder) {
            System.out.println(NseeOrder.getMessage());
        }

//        shopService.listOrder();
//        shopService.listProduct();


    }
}
