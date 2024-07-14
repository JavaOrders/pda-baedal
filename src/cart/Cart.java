package cart;
import java.util.ArrayList;
import java.util.List;
import menu.Menu;
import restaurant.Restaurant;

public class Cart {
    private int totalPrice;
    private List<Menu> menus;
    private List<Restaurant> restaurants;

    public Cart() {
        this.totalPrice = 0; // 초기값 설정
        this.menus = new ArrayList<>();
        this.restaurants = new ArrayList<>();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
