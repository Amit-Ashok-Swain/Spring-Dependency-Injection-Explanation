import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private ProductRepository productRepository;

    public void processOrder(Order order) {
        // Perform order processing here
        double totalAmount = calculateTotalAmount(order);
        order.setTotalAmount(totalAmount);
    }

    public void placeOrder(Order order) {
        // Place the order (for example, save it to a database)
        // In this example, we'll just print the order details
        System.out.println("Order placed:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total Amount: $" + order.getTotalAmount());
        System.out.println("Products:");

        for (Product product : order.getProducts()) {
            System.out.println(" - " + product.getName() + ": $" + product.getPrice());
        }
    }

    private double calculateTotalAmount(Order order) {
        double total = 0.0;

        for (Product product : order.getProducts()) {
            total += product.getPrice();
        }

        return total;
    }
}
