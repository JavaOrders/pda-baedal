package order;

import cart.Cart;
import java.util.UUID;
import restaurant.RestaurantService;
import user.UserDAO;
import user.domain.Customer;

public class OrderService {
    private final RestaurantService restaurantService = new RestaurantService();
    private final OrderDAO orderDAO = new OrderDAO();
    private final UserDAO userDAO = new UserDAO();

    public Order addOrder(String customerId) {
        Customer customer = userDAO.findById(customerId);
        Cart cart = customer.getMyCart();
        int orderId = UUID.randomUUID().hashCode();
        Order order = new Order(cart, customer, orderId);
        Order currentOrder = orderDAO.save(order);
        return updateOrderByStatus(sendToOrder(currentOrder), currentOrder);
    }

    public Order updateOrderByStatus(boolean status, Order order) {
        if (status) {
            order.setStatus(true);
        } else {
            order.setStatus(false);
        }
        return order;
    }

    public boolean sendToOrder(Order order) {
        return restaurantService.receiveOrder(order);
    }

    public void rejectOrder(Order order) {
        orderDAO.delete(order);
    }
}
