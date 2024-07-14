package restaurant;
import java.util.List;
import menu.Menu;
public class RestaurantView {

    public void displayRestaurants(List<Restaurant> restaurants) {
        System.out.println("레스토랑 리스트:");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getName());
        }
    }

    public void displayMenus(List<Menu> menus) {
        System.out.println("메뉴 리스트:");
        for (Menu menu : menus) {
            System.out.println(menu.getName() + " - " + menu.getPrice() + "원");
        }
    }

}
