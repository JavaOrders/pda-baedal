package restaurant;

import java.util.HashMap;
import java.util.List;
import menu.Menu;

public class RestaurantController {

    RestaurantService restaurantService;
    RestaurantView restaurantView;

    public RestaurantController() {
        this.restaurantView = new RestaurantView();
        this.restaurantService = new RestaurantService();
    }

    public Restaurant openRestaurant(String name, List<HashMap<String, Integer>> menus) {
        return restaurantService.openRestaurant(name, menus);
    }

    public List<Restaurant> showRestaurants() {
        return restaurantService.showRestaurants();
    }

    public Restaurant showRestaurant(int id) {
        return restaurantService.showRestaurant(id);
    }

    public List<Menu> showMenusByRestaurantName(String restaurantName) {
        return restaurantService.showMenusByRestaurantName(restaurantName);
    }

    public RestaurantView getRestaurantView() {
        return restaurantView;
    }

    public void show() {
        List<Restaurant> restaurants = restaurantService.showRestaurants();
        restaurantView.show(restaurants);
    }


}
