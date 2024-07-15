package cart;

import java.util.ArrayList;
import java.util.List;
import menu.Menu;
import restaurant.Restaurant;

public class Cart {
    private Restaurant restaurant;
    private List<Menu> menus;
    private int totalPrice;

    public Cart() {
        this.menus = new ArrayList<Menu>();
    }

    public Cart(Restaurant restaurant, List<Menu> menus, int totalPrice) {
        this.restaurant = restaurant;
        this.menus = menus;
        this.totalPrice = totalPrice;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void removeMenu(Menu menu) {
        menus.remove(menu);
    }

    public void clearMenus() {
        menus.clear();
    }

    public boolean isContainsMenu(Menu menu) {
        return menus.contains(menu);
    }
}
