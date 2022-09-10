import Data.ProductsAndOrders;
import Program.ProgramFlow;
import repo.OrderRepo;
import repo.Product;
import repo.ProductRepo;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        ShopService shopService = new ShopService(new OrderRepo(ProductsAndOrders.initializeOrder()),new ProductRepo(ProductsAndOrders.initializeProducts()));
        String[] menuOptions = {
                "List all Products"
                , "List all Orders"
                , "Display Product"
                , "Display Order"
                , "Add New Order"
        };
        int option = ProgramFlow.menu(menuOptions);

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                shopService.listProduct();
                break;
            case 2:
                shopService.listOrder();
            case 3:
                shopService.getProduct(ProgramFlow.intInput("Enter Product Id: "));
                break;
            case 4:
                shopService.getOrder(ProgramFlow.intInput("Enter Order Id: "));
                break;
            case 5:
                //call addOrder
                break;
        }
        main(null);
    }
}
