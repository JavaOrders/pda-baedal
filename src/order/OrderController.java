package order;

import cart.Cart;
import user.domain.Customer;

public class OrderController {
    private final OrderView orderView = new OrderView();
    private final OrderService orderService = new OrderService();

    public Order addOrder(Cart cart, Customer customer) {
        Order order = orderService.addOrder(cart, customer);
        orderView.printOrder(order);
        return order;
    }
}
