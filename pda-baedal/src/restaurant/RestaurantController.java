package restaurant;
import java.util.List;
import menu.Menu;

public class RestaurantController {

    private RestaurantService restaurantService;

    public RestaurantController() {
        this.restaurantService = new RestaurantService();
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    public Restaurant getRestaurantByName(String name) {
        return restaurantService.getRestaurantByName(name);
    }



}
