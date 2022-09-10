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
        if (productAdministration.getProduct(id) == null) {
            throw new NoSuchElementException("Product not found");
        }
        else {
            return productAdministration.getProduct(id);
        }
    }

    public void listProduct() {
        productAdministration.list();
    }
    public Order addOrder(int id[]) {
        Product[] productsToAdd = new Product[id.length];
        for (int j = 0; j < id.length; j++) {
            productsToAdd[j] = productAdministration.getProduct(id[j]);
        }
        return orderAdministration.add(productsToAdd);
    }

    public Order getOrder(int id){
        if (orderAdministration.getOrder(id) == null) {
            throw new NoSuchElementException("Order not found");
        }
        else {
            return orderAdministration.getOrder(id);
        }
    }
    public void listOrder() {
        orderAdministration.list();
    }
}
