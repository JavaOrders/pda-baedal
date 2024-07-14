package order;

import java.util.HashMap;
import java.util.Map;

public class OrderDAO {
    private Map<Integer, Order> db = new HashMap<>();

    // 사용자 정보를 저장하는 메서드
    public Order save(Order order) {
        db.put(order.getOrderKey(), order);
        return order;
    }

}
