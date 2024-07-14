package order;

import user.UserDAO;
import user.domain.Customer;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();
    private UserDAO userDAO= new UserDAO();

    public Long order(String id) {

        Customer customer = userDAO.findById(id);

        Order order = Order.createOrder(customer);
        orderDAO.save(order);

        return order.getOrderId();
    }
}
