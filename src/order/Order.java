package order;

import cart.Cart;
import java.util.List;
import menu.Menu;
import restaurant.Restaurant;
import user.domain.Customer;

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private List<Menu> menus;
    private int totalPrice;// 인스턴스 변수로 수정
    private int orderKey;

    public Order() {
    }

    public Order(Cart cart, Customer customer, int key) {
        this.customer = customer;
        this.restaurant = cart.getRestaurant();
        this.menus = cart.getMenus();
        this.totalPrice = cart.getTotalPrice();
        this.orderKey = key;
    }

    public int getOrderKey() {
        return orderKey;
    }

    public String getCustomer() {
        return customer.getName();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getMenus() {
        StringBuilder menuList = new StringBuilder();
        for (Menu menu : menus) {
            menuList.append(menu.getName()).append(", ");
        }
        // Remove the trailing comma and space if there are any menus
        if (menuList.length() > 0) {
            menuList.setLength(menuList.length() - 2);
        }
        return menuList.toString();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Menu> getMenuList() {
        return menus;
    }
}
