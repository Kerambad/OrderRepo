import Data.ProductsAndOrders;
import repo.Order;
import repo.OrderRepo;
import repo.Product;
import repo.ProductRepo;

public class ShopService {
    private OrderRepo orderAdministration = new OrderRepo(ProductsAndOrders.initializeOrder());
    private ProductRepo productAdministration = new ProductRepo(ProductsAndOrders.initializeProducts());

    public Product getProduct(int id) {
        return productAdministration.getProduct(id);
    }

    public void listProduct() {
        productAdministration.list();
    }
    public Order addOrder(int id, Product[] toadd) {
        return orderAdministration.add(id, toadd);
    }
    public Order getOrder(int id) {
        return orderAdministration.get(id);
    }
    public void listOrder() {
        orderAdministration.list();
    }
}
