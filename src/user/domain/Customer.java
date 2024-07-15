package user.domain;

import static user.domain.Person.PersonType.CUSTOMER;

import cart.Cart;
import java.util.ArrayList;
import java.util.List;
import order.Order;

public class Customer extends Person {

    private Cart myCart;
    private long totalExpennse;
    private List<Order> orderHistory;
    private String id;
    private String password;

    public Customer(String id, String password, String name, Cart cart) {
        super(name, CUSTOMER);
        myCart = cart;
        orderHistory = new ArrayList<Order>();
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Cart getMyCart() {
        return myCart;
    }

    public void setMyCart(Cart myCart) {
        this.myCart = myCart;
    }

    public long getTotalExpennse() {
        return totalExpennse;
    }

    public void setTotalExpennse(long totalExpennse) {
        this.totalExpennse = totalExpennse;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
