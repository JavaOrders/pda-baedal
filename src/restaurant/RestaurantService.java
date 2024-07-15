package restaurant;

import java.util.HashMap;
import java.util.List;
import menu.Menu;
import menu.MenuService;

public class RestaurantService {

    RestaurantDAO restaurantDAO = new RestaurantDAO();
    MenuService menuService = new MenuService();

    public Restaurant openRestaurant(String name, List<HashMap<String, Integer>> menu) {
        if (isExist(name)) {
            return null;
        }
        List<Menu> menus = menuService.getNewMenus(name, menu);
        Restaurant restaurant = new Restaurant(name, menus);
        return restaurantDAO.save(restaurant);
    }

    private boolean isExist(String name) {
        Restaurant restaurant = getRestaurant(name);
        return restaurant != null;
    }

    public Restaurant getRestaurant(String name) {
        return restaurantDAO.findByName(name);
    }

    public List<Restaurant> showRestaurants() {
        return restaurantDAO.findAll();
    }

    public Restaurant showRestaurant(int id) {
        return restaurantDAO.findById(id);
    }

    public List<Menu> showMenusByRestaurantName(String restaurantName) {
        return menuService.getMenus(restaurantName);
    }

}
