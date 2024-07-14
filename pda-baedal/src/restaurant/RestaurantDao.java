package restaurant;
import java.util.ArrayList;
import java.util.List;
import menu.Menu;

public class RestaurantDao {

    private List<Restaurant> restaurants;

    public RestaurantDao() {
        this.restaurants = new ArrayList<>();
        // 더미 데이터
        Restaurant restaurant1 = new Restaurant("Kim's Diner");
        restaurant1.addMenu(new Menu("Kimchi", 10));
        restaurant1.addMenu(new Menu("Bulgogi", 12));

        Restaurant restaurant2 = new Restaurant("Lee's BBQ");
        restaurant2.addMenu(new Menu("BBQ Chicken", 15));
        restaurant2.addMenu(new Menu("Pork Belly", 18));

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }

}
