package restaurant;

import java.util.HashMap;
import java.util.List;
import menu.Menu;
import menu.MenuService;

public class RestaurantService {

    RestaurantDAO restaurantDAO = new RestaurantDAO();
    MenuService menuService = new MenuService();

    public Restaurant openRestaurant(String name, List<HashMap<String, Integer>> menu) {
        List<Menu> menus = menuService.getNewMenus(name, menu);
        Restaurant restaurant = new Restaurant(name, menus);
        return restaurantDAO.save(restaurant);
    }

    public List<Restaurant> showRestaurants() {
        return restaurantDAO.findAll();
    }

}
