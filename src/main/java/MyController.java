import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getMappings")
    public ResponseEntity<Order> getMappings() {
        Order order = new Order();
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product A", 10.0));
        products.add(new Product(2, "Product B", 20.0));
        order.setProducts(products);

        // Use the OrderService to perform operations
        orderService.processOrder(order);

        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        // Use the OrderService to place the order
        orderService.placeOrder(order);

        return new ResponseEntity<>("Order placed successfully!", HttpStatus.CREATED);
    }
}
