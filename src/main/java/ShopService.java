
import Program.ProgramFlow;
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
    public Order addOrder(int[] id) {
        Product[] productsToAdd = new Product[id.length];
        for (int j = 0; j < id.length; j++) {
            productsToAdd[j] = getProduct(id[j]);
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
    public void start(int runcode) {
        int option;
            if (runcode == 3 || runcode == 4) {
                option = runcode;
            }
            else {
                String[] menuOptions = {
                        "List all Products"
                        , "List all Orders"
                        , "Display Product"
                        , "Display Order"
                        , "Add New Order"
                };
                option = ProgramFlow.menu(menuOptions);
            }
            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    listProduct();
                    break;
                case 2:
                    listOrder();
                case 3:
                    try {
                        System.out.println(getProduct(ProgramFlow.intInput("Enter Product Id: ")));
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                        start(3);
                    }
                    break;
                case 4:
                    try {
                        System.out.println(getOrder(ProgramFlow.intInput("Enter Order Id: ")));
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                        start(4);
                    }
                    break;
                case 5:
                    System.out.println(addOrder(ProgramFlow.intArrayInput("Enter Id's divided by [,]: ")));
                    break;
            }
            start(0);
        }
    }