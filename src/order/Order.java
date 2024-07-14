package order;

import menu.Menu;
import java.util.ArrayList;
import java.util.List;
import user.domain.Customer;

public class Order {
    private static final int ORDER = 1;
    private static long orderIdCounter = 1;

    private long orderId = orderIdCounter++;
    private Customer customer;
    private List<Menu> menus = new ArrayList<>();
    private int orderStatus;
    private int totalPrice;

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.getOrderHistory().add(this);
    }

    public void addOrderMenu(Menu menu) {
        menus.add(menu);
    }

    public static Order createOrder(Customer customer) {
        Order order = new Order();
        order.setCustomer(customer);
        List<Menu> menus = customer.getMyCart().getMenus();

        for (Menu menu : menus) {
            order.addOrderMenu(menu);
            //TODO: should seperate calcTotalPrice Logic
            order.setTotalPrice(order.getTotalPrice() + menu.getPrice());
        }
        order.setOrderStatus(ORDER);

        return order;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
