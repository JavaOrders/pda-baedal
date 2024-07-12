package restaurant;

public class RestaurantController {

    RestaurantService restaurantService = new RestaurantService();

    public void openRestaurant(String name) {
        restaurantService.openRestaurant(name);
    }

}
