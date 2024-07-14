package restaurant;
import java.util.List;

public class RestaurantService {

    private RestaurantDao restaurantDao;

    public RestaurantService() {
        this.restaurantDao = new RestaurantDao();
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantDao.getAllRestaurants();
    }


    public Restaurant getRestaurantByName(String name) {
        for (Restaurant restaurant : restaurantDao.getAllRestaurants()) {
            if (restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        return null;
    }



}
