package restaurant;

import java.util.List;

public class RestaurantView {
    private RestaurantController restaurantController;

    public RestaurantView(RestaurantController restaurantController) {
        this.restaurantController = restaurantController;
    }

    public void show() {
        List<Restaurant> restaurants = restaurantController.showRestaurants();
        System.out.printf("%d곳의 가게들이 있습니다.\n", restaurants.size());
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.printf("%d. %s\n", i, restaurants.get(i).getName());
        }
    }
}
