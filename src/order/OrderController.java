package order;

import cart.Cart;
import user.domain.Customer;

public class OrderController {
    private final OrderView orderView = new OrderView();
    private final OrderService orderService = new OrderService();

    public void addOrder(String customerId) {

        Order order = orderService.addOrder(customerId);
        orderView.printOrder(order);

        if (order.getStatus()) {
            orderView.printOrder(order);
        } else {
            orderView.rejectOrder();
            orderService.rejectOrder(order);
        }
    }
}
