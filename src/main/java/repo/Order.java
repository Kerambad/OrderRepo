package repo;

import java.util.Objects;

public class Order {
    private int orderId;
    private Product product;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order(int orderId, Product product) {
        this.orderId = orderId;
        this.product = product;


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
