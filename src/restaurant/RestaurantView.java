package restaurant;

import java.util.List;
import menu.Menu;

public class RestaurantView {
    private RestaurantController restaurantController;

    public RestaurantView(RestaurantController restaurantController) {
        this.restaurantController = restaurantController;
    }

    public void show() {
        List<Restaurant> restaurants = restaurantController.showRestaurants();
        System.out.printf("총 %d곳의 가게들이 있습니다.\n", restaurants.size());
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.printf("%d. %s\n", i, restaurants.get(i).getName());
        }
    }

    public void printMenuList(List<Menu> menus) {
        for (int i = 1; i <= menus.size(); i++) {
            System.out.println(i+"번 메뉴이름 " + menus.get(i - 1).getName() +" 가격 " + menus.get(i - 1).getPrice());
        }
    }

    public RestaurantController getRestaurantController() {
        return restaurantController;
    }
}
