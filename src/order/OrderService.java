package order;

import cart.Cart;
import java.util.UUID;
import user.domain.Customer;

public class OrderService {

    public Order addOrder(Cart cart, Customer customer) {
        int orderId = UUID.randomUUID().hashCode();
        Order order = new Order(cart, customer, orderId);
        OrderDAO orderDAO = new OrderDAO();
        return orderDAO.save(order);
    }
}
