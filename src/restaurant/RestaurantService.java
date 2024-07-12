package restaurant;

import java.util.List;
import menu.Menu;
import menu.MenuService;

public class RestaurantService {

    RestaurantDAO restaurantDAO = new RestaurantDAO();
    MenuService menuService = new MenuService();

    public void openRestaurant(String name) {
        List<Menu> menus = menuService.getNewMenus();
        restaurantDAO.save(name, menus);
    }

}
