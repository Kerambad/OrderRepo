package repo;

import java.util.Map;
import java.util.Objects;

public class Order {

    //Attributes
    private int orderId;
    private Map<Integer,Product> product;

    //Constructor
    public Order(int orderId, Map<Integer, Product> product) {
        this.orderId = orderId;
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    //Methods

    public Map<Integer, Product> getProduct() {
        return product;
    }

    public void setProduct(Map<Integer, Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order: OrderId: " + orderId +
                "\n" + product + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        return Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
