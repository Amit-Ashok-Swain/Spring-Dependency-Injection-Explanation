import java.util.List;
public class Order {
    private int orderId;
    private List<Product> products;

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setTotalAmount(double totalAmount) {
    }

    public String getTotalAmount() {
        return null;
    }
}


