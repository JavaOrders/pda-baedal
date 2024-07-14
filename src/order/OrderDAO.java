package order;

import java.util.HashMap;
import java.util.Map;
import user.domain.Customer;

public class OrderDAO {
    private final Map<Long, Order> db = new HashMap<>();

    public void save(Order order) {
        db.put(order.getOrderId(),order);
    }


}
