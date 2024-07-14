package order;

import java.util.HashMap;
import java.util.Map;

public class OrderDAO {
    private Map<Integer, Order> db = new HashMap<>();
  
    public Order save(Order order) {
        db.put(order.getOrderKey(), order);
        return order;
    }
}
