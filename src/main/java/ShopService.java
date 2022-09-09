import Data.ProductsAndOrders;
import repo.Order;
import repo.OrderRepo;
import repo.Product;
import repo.ProductRepo;

import java.util.NoSuchElementException;

public class ShopService {
    private OrderRepo orderAdministration;
    private ProductRepo productAdministration;

    public ShopService(OrderRepo orderAdministration, ProductRepo productAdministration) {
        this.orderAdministration = orderAdministration;
        this.productAdministration = productAdministration;
    }

    public Product getProduct(int id) {
        return productAdministration.getProduct(id);
    }

    public void listProduct() {
        productAdministration.list();
    }
    public Order addOrder(int id[]) {
        Product[] productsToAdd = new Product[id.length];
        int i = 0;
        for (int index : id) {
            if (productAdministration.getProduct(index) == null) {
                throw new NoSuchElementException("Product not found");
            }
            else {
                productsToAdd[i++] = productAdministration.getProduct(index);
            }
        }
        return orderAdministration.add(productsToAdd);
    }
    public Order getOrder(int id) {
        return orderAdministration.get(id);
    }
    public void listOrder() {
        orderAdministration.list();
    }
}
