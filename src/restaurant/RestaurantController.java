package restaurant;

import java.util.HashMap;
import java.util.List;

public class RestaurantController {

    RestaurantService restaurantService = new RestaurantService();

    public Restaurant openRestaurant(String name, List<HashMap<String, Integer>> menus) {
        return restaurantService.openRestaurant(name, menus);
    }

}
